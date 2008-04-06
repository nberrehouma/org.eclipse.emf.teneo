/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryExample.java,v 1.1 2008/04/01 07:32:44 mtaal Exp $
 */
package org.eclipse.example.library.tests;

import java.io.File;
import java.io.IOException;

import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.example.library.Book;
import org.eclipse.example.library.LibraryFactory;
import org.eclipse.example.library.LibraryPackage;

import org.eclipse.example.library.util.LibraryResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>library</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryExample {
	/**
	 * <!-- begin-user-doc -->
	 * Load all the argument file paths or URIs as instances of the model.
	 * <!-- end-user-doc -->
	 * @param args the file paths or URIs.
	 * @generated
	 */
	public static void main(String[] args) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new LibraryResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(LibraryPackage.eNS_URI, 
			 LibraryPackage.eINSTANCE);
        
		// If there are no arguments, emit an appropriate usage message.
		//
		if (args.length == 0) {
			System.out.println("Enter a list of file paths or URIs that have content like this:");
			try {
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.library"));
				Book root = LibraryFactory.eINSTANCE.createBook();
				resource.getContents().add(root);
				resource.save(System.out, null);
			}
			catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		else {
			// Iterate over all the arguments.
			//
			for (int i = 0; i < args.length; ++i) {
				// Construct the URI for the instance file.
				// The argument is treated as a file path only if it denotes an existing file.
				// Otherwise, it's directly treated as a URL.
				//
				File file = new File(args[i]);
				URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(args[0]);

				try {
					// Demand load resource for this file.
					//
					Resource resource = resourceSet.getResource(uri, true);
					System.out.println("Loaded " + uri);

					// Validate the contents of the loaded resource.
					//
					for (Iterator j = resource.getContents().iterator(); j.hasNext(); ) {
						EObject eObject = (EObject)j.next();
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							printDiagnostic(diagnostic, "");
						}
					}
				}
				catch (RuntimeException exception) {
					System.out.println("Problem loading " + uri);
					exception.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Prints diagnostics with indentation.
	 * <!-- end-user-doc -->
	 * @param diagnostic the diagnostic to print.
	 * @param indent the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext(); ) {
			printDiagnostic((Diagnostic)i.next(), indent + "  ");
		}
	}

} //LibraryExample