/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * FeatureMapAction.java,v 1.3 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.elist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapFactory;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.collection.spi.PersistentCollection;

/**
 * Tests the feature map example Tests: - Creating Feature maps with simple types, containment and
 * non-containment relations - Retrieval of feature map entries - AddAll - Removal of contained and
 * non-contained feature map entries (cascading delete) - Delete restrictions
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2010/04/03 09:21:01 $
 */
public class FeatureMapAction extends AbstractTestAction {
	public FeatureMapAction() {
		super(FeaturemapPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}

	/** Stores a TopModel Object */
	@Override
	public void doAction(TestStore store) {
		// List of types by group
		FeaturemapFactory factory = FeaturemapFactory.eINSTANCE;

		{
			store.beginTransaction();
			store.store(createProduct(1, null));
			store.commitTransaction();
		}

		{
			Resource res = store.getResource();
			try {
				res.load(null);
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			Iterator<?> it = res.getContents().iterator();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (obj instanceof ProductType) {
					ProductType prod = (ProductType) obj;

					// check some things, desc1 and desc2
					List<?> list = prod.getGroup().list(
							FeaturemapPackage.eINSTANCE.getProductType_Description());
					assertTrue(((String) list.get(0)).compareTo("desc11") == 0);
					assertTrue(((String) list.get(1)).compareTo("desc21") == 0);

					list = prod.getGroup().list(
							FeaturemapPackage.eINSTANCE.getProductType_TranslatedDescription());
					assertTrue(((TranslatedDescriptionType) list.get(0)).getLanguage().compareTo("en") == 0);
					assertTrue(((TranslatedDescriptionType) list.get(1)).getLanguage().compareTo("nl") == 0);

					list = prod.getGroup1();
					assertTrue(((Entry) list.get(0)).getValue() instanceof Double);
					assertEquals(53.5, ((PriceByQuantityType) ((Entry) list.get(1)).getValue()).getPrice(),
							0.01);
					assertTrue(((SupplierPriceType) ((Entry) list.get(2)).getValue()).getName().compareTo(
							"supplier1") == 0);
				}
			}

			// product is added to resource
			createProduct(2, res);
			try {
				res.save(null);
				res.unload();
			} catch (Exception e) {
				throw new StoreTestException("Exception", e);
			}
		}

		// to test
		// add on an existing group
		// addAll on an existing group
		// contains
		// move
		// set
		// remove feature

		{
			store.beginTransaction();
			List<?> products = store.getObjects(ProductType.class);
			ProductType product1 = (ProductType) products.get(0);
			ProductType product2 = (ProductType) products.get(1);
			assertTrue(products.size() == 2);
			assertTrue(product1.getName().compareTo("_1") == 0);
			assertTrue(product2.getName().compareTo("_2") == 0);

			checkLazyLoad(product1.getGroup1());
			checkLazyLoad(product1.getGroup());

			checkLazyLoad(product2.getGroup1());
			checkLazyLoad(product2.getGroup());

			// check container property
			assertTrue(((PriceByQuantityType) product1.getGroup1().getValue(1)).eContainer() == product1);

			if (!isEAVTest() && !isComponentTest()) {
				Object[] eobjs = store.getCrossReferencers((EObject) product1.getGroup1().getValue(1),
						false);
				assertEquals(1, eobjs.length);
				assertTrue(eobjs[0] == product1);

				// should give same result because the pricebyquantity is contained
				eobjs = store.getCrossReferencers((EObject) product1.getGroup1().getValue(1), true);
				assertEquals(1, eobjs.length);
				assertTrue(eobjs[0] == product1);
			}

			// add something!
			// after this at position 0, 1 and 3 there should be a Double
			// note that the set 1 means that the price by quantity is deleted
			// as it is contained!
			Entry entry = FeatureMapUtil.createEntry(
					FeaturemapPackage.eINSTANCE.getProductType_SimplePrice(), new Double(254.0));
			product1.getGroup1().set(1, entry);
			product1.getGroup1().add(FeaturemapPackage.eINSTANCE.getProductType_SimplePrice(),
					new Double(154.0));

			// remove the price by quantity, this should remove it
			product1.getGroup1().remove(1);

			ArrayList<TranslatedDescriptionType> trans = new ArrayList<TranslatedDescriptionType>();
			TranslatedDescriptionType transDesc1 = factory.createTranslatedDescriptionType();
			transDesc1.setDescription("transdesca.12"); // note the string ends
			// on 2 is used below
			transDesc1.setLanguage("en");
			TranslatedDescriptionType transDesc2 = factory.createTranslatedDescriptionType();
			transDesc2.setDescription("transdesca.22"); // note the string ends
			// on 2 is used below
			transDesc2.setLanguage("nl");
			trans.add(transDesc1);
			trans.add(transDesc2);

			product2.getGroup().addAll(
					FeaturemapPackage.eINSTANCE.getProductType_TranslatedDescription(), trans);

			// remove one translated description in the map, this should not
			// delete it
			product2.getGroup().remove(1);

			store.commitTransaction();
		}

		{
			store.beginTransaction();
			store.checkNumber(TranslatedDescriptionType.class, 6);
			store.commitTransaction();
		}

		// delete restriction
		if (!isEAVTest()) {
			// in case of eav tests there are only anonymous references
			// which do not support delete constraints
			store.checkDeleteFails(TranslatedDescriptionType.class);
		}

		// there should still be 6
		{
			store.beginTransaction();
			store.checkNumber(TranslatedDescriptionType.class, 6);
			store.commitTransaction();
		}

		// cascading delete
		{
			store.beginTransaction();
			List<?> products = store.getObjects(ProductType.class);
			ProductType product2 = (ProductType) products.get(1);

			// remove a translated description entry, this should not delete it
			// (see check for 6
			// below)
			product2.getGroup().remove(1);
			store.commitTransaction();
		}

		// do some tests
		{
			store.beginTransaction();
			store.checkNumber(PriceByQuantityType.class, 1);

			// there should still be 6 translated descriptions
			store.checkNumber(TranslatedDescriptionType.class, 6);
			List<?> products = store.getObjects(ProductType.class);
			ProductType product2 = (ProductType) products.get(1);

			assertTrue(product2.getGroup().size() == 4);

			// now delete the complete product
			store.deleteObject(product2);
			store.commitTransaction();
		}

		// do some recounts
		{
			store.beginTransaction();
			store.checkNumber(TranslatedDescriptionType.class, 6);
			store.checkNumber(SupplierPriceType.class, 2);
			store.checkNumber(PriceByQuantityType.class, 0);
			store.checkNumber(ProductType.class, 1);

			// now delete of some of the suppliers and translated description
			// should be possible
			Iterator<?> suppliers = store.getObjects(SupplierPriceType.class).iterator();
			while (suppliers.hasNext()) {
				SupplierPriceType supplier = (SupplierPriceType) suppliers.next();
				if (supplier.getName().endsWith("2")) {
					store.deleteObject(supplier);
				}
			}

			Iterator<?> transs = store.getObjects(TranslatedDescriptionType.class).iterator();
			while (transs.hasNext()) {
				TranslatedDescriptionType trans = (TranslatedDescriptionType) transs.next();
				if (trans.getDescription().endsWith("2")) {
					store.deleteObject(trans);
				}
			}

			store.commitTransaction();
		}

		// do some more checks
		{
			store.beginTransaction();
			store.checkNumber(PriceByQuantityType.class, 0);
			store.checkNumber(TranslatedDescriptionType.class, 2);
			store.checkNumber(SupplierPriceType.class, 1);
			store.commitTransaction();
		}

		// now test move
		{
			store.beginTransaction();
			List<?> products = store.getObjects(ProductType.class);
			ProductType product1 = (ProductType) products.get(0);
			product1.getGroup().move(0, 1);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List<?> products = store.getObjects(ProductType.class);
			ProductType product1 = (ProductType) products.get(0);

			assertTrue((product1.getGroup().get(0)).getValue() instanceof TranslatedDescriptionType);
			assertTrue((product1.getGroup().get(1)).getValue() instanceof String);
			assertTrue((product1.getGroup().get(2)).getValue() instanceof String);
			assertTrue((product1.getGroup().get(3)).getValue() instanceof TranslatedDescriptionType);
			store.commitTransaction();
		}

		// add tests to see if PersistentStoreAdapter works fine
		if (!isEAVTest()) {
			store.beginTransaction();
			ProductType pt = createProduct(10, null);
			store.store(pt);
			store.commitTransaction();
			pt.getGroup().add(FeaturemapPackage.eINSTANCE.getProductType_Description(), "desc110");

			pt.getGroup1()
					.add(FeaturemapPackage.eINSTANCE.getProductType_SimplePrice(), new Double(54.0));

			PersistentStoreAdapter adapter = StoreUtil.getPersistentStoreAdapter(pt);
			final Object value = adapter.getStoreCollection(FeaturemapPackage.eINSTANCE
					.getProductType_Group());
			final Object value1 = adapter.getStoreCollection(FeaturemapPackage.eINSTANCE
					.getProductType_Group1());
			compareFeatureMaps((List<?>) value, pt.getGroup());
			compareFeatureMaps((List<?>) value1, pt.getGroup1());
		}

	}

	protected void checkLazyLoad(FeatureMap fm) {

	}

	protected boolean isEAVTest() {
		return false;
	}

	protected boolean isComponentTest() {
		return false;
	}

	// compare lists which both contain feature map entries
	private void compareFeatureMaps(List<?> l1, List<?> l2) {
		assertTrue(l1 != l2);
		assertEquals(l1.size(), l2.size());
		for (Object o : l1) {
			final FeatureMap.Entry fe1 = (FeatureMap.Entry) o;
			final FeatureMap.Entry fe2 = (FeatureMap.Entry) l2.get(l1.indexOf(o));
			assertEquals(fe1.getEStructuralFeature(), fe2.getEStructuralFeature());
			assertEquals(fe1.getValue(), fe2.getValue());
		}
	}

	/** Creates a product, adding the passed int as an extra argument */
	private ProductType createProduct(int index, Resource res) {
		FeaturemapFactory factory = FeaturemapFactory.eINSTANCE;
		ProductType product = factory.createProductType();
		product.setName("_" + index);
		product.setProductClassification(ProductClassification.NORMAL_LITERAL);

		TranslatedDescriptionType transDesc1 = factory.createTranslatedDescriptionType();
		transDesc1.setDescription("transdesc1" + index);
		transDesc1.setLanguage("en");
		TranslatedDescriptionType transDesc2 = factory.createTranslatedDescriptionType();
		transDesc2.setDescription("transdesc2" + index);
		transDesc2.setLanguage("nl");
		product.getGroup().add(FeaturemapPackage.eINSTANCE.getProductType_Description(),
				"desc1" + index);
		product.getGroup().add(FeaturemapPackage.eINSTANCE.getProductType_TranslatedDescription(),
				transDesc1);
		product.getGroup().add(FeaturemapPackage.eINSTANCE.getProductType_Description(),
				"desc2" + index);
		product.getGroup().add(FeaturemapPackage.eINSTANCE.getProductType_TranslatedDescription(),
				transDesc2);

		product.getGroup1().add(FeaturemapPackage.eINSTANCE.getProductType_SimplePrice(),
				new Double(54.0));

		PriceByQuantityType priceQuantity = factory.createPriceByQuantityType();
		priceQuantity.setPrice(53.5);
		priceQuantity.setQuantity(100.0);
		product.getGroup1().add(1, FeaturemapPackage.eINSTANCE.getProductType_PriceByQuantity(),
				priceQuantity);

		SupplierPriceType supplier = factory.createSupplierPriceType();
		supplier.setName("supplier" + index);
		supplier.setPrice(51.6);
		product.getGroup1().add(FeaturemapPackage.eINSTANCE.getProductType_PriceFromSupplier(),
				supplier);

		if (res != null) {
			res.getContents().add(product);
			res.getContents().add(transDesc1);
			res.getContents().add(transDesc2);
			res.getContents().add(supplier);
		}
		return product;
	}

	protected void testLazyCollectionUtils(List<?> list) {
		final PersistableDelegateList<?> persistableEList = (PersistableDelegateList<?>) list;
		final PersistentCollection persistentCollection = (PersistentCollection) persistableEList
				.getDelegate();
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

		// test the size operation
		int size = LazyCollectionUtils.size(list);
		assertTrue(size > 0);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());

		final Iterator<?> iterator = LazyCollectionUtils.getPagedLoadingIterator(list, 5);
		int index = 0;
		while (iterator.hasNext()) {
			index++;
			Object o = iterator.next();
			assertTrue(o != null);
		}
		assertEquals(size, index);
		assertFalse(persistentCollection.wasInitialized());
		assertFalse(persistableEList.isLoaded());
	}
}
