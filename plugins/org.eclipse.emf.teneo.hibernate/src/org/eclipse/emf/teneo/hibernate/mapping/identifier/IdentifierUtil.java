/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: IdentifierUtil.java,v 1.2 2006/07/22 13:09:55 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.identifier;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.hibernate.engine.ForeignKeys;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.impl.SessionImpl;
import org.hibernate.type.NullableType;
import org.hibernate.type.Type;

/**
 * Different identifier related utilities. The current Elver store representation does not use the EMF id concept but
 * uses the underlying hibernate identifier. This allows more flexibility than the EMF identifier.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class IdentifierUtil {
	/** The logger */
//	private static Log log = LogFactory.getLog(IdentifierUtil.class);

	/** Separator used in encoding the class name and value */
	private static final String ENCODING_SEPARATOR = ";";

	/** HashTable with identifier types hashed by entityname */
	private static final Hashtable identifierTypeCache = new Hashtable();

	/** HashTable with cached constructors */
	private static final Hashtable constructorCache = new Hashtable();

	/** Returns the identifiertype on the basis of the class of the passed object */
	public static Type getIdentifierType(String className, SessionImplementor session) {
		Type type = (Type) identifierTypeCache.get(className);
		if (type != null)
			return type;

		final Type identifierType = ((SessionImpl) session).getFactory().getClassMetadata(className)
				.getIdentifierType();
		identifierTypeCache.put(className, identifierType);
		return identifierType;
	}

	/** Converts an id to a string representation */
	public static String idToString(Object object, SessionImplementor session) {

		return createIDString(getIdentifierType(object.getClass().getName(), session), getID(object, session));
	}

	/** String to id */
	public static Serializable stringToId(String className, SessionImplementor Session, String idStr) {
		return extractID(getIdentifierType(className, Session), idStr);
	}

	/** Creates the serializable id object from a string */
	private static Serializable extractID(Type type, String idString) {
		// first handle the most common case
		if (type instanceof NullableType) {
			final NullableType ntype = (NullableType) type;
			return (Serializable) ntype.fromStringValue(idString);
		}

		// for all other cases the classname of the type is encoded into the field
		final String className = idString.substring(0, idString.indexOf(ENCODING_SEPARATOR));
		final String strValue = idString.substring(1 + idString.indexOf(ENCODING_SEPARATOR));

		Constructor constructor = (Constructor) constructorCache.get(className);
		if (constructor == null) {
			try {
				final Class clazz = ClassLoaderResolver.classForName(className);
				constructor = clazz.getConstructor(new Class[] { String.class });
			} catch (StoreClassLoadException e) {
				throw new HbStoreException("Class " + className + " not found");
			} catch (NoSuchMethodException e) {
				throw new HbStoreException("Class " + className
						+ " does not have a constructor with a String parameter!");
			}
		}
		if (constructor == null) {
			throw new HbStoreException("Class " + className + " does not have a constructor with a String parameter!");
		}

		try {
			return (Serializable) constructor.newInstance(new Object[] { strValue });
		} catch (InvocationTargetException e) {
			throw new HbStoreException("Can not instantiate: " + className + " using value " + strValue);
		} catch (InstantiationException e) {
			throw new HbStoreException("Can not instantiate: " + className + " using value " + strValue);
		} catch (IllegalAccessException e) {
			throw new HbStoreException("Can not instantiate: " + className + " using value " + strValue);
		}
	}

	/** Returns the id of the passed object */
	public static Serializable getID(Object object, SessionImplementor session) {
		// try the hibernate way
		Serializable result = (Serializable) IdentifierCacheHandler.getID(object);
		if (result != null)
			return result;

		final String entityName = session.bestGuessEntityName(object);
		return ForeignKeys.getEntityIdentifierIfNotUnsaved(entityName, object, session);
	}

	/** Creates an id string from a serializable object */
	private static String createIDString(Type type, Serializable id) {
		if (type instanceof NullableType) {
			final NullableType ntype = (NullableType) type;
			return ntype.toString(id);
		}

		return id.getClass().getName() + ENCODING_SEPARATOR + id.toString();
	}
}