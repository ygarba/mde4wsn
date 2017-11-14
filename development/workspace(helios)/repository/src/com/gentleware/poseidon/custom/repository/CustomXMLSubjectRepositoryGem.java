package com.gentleware.poseidon.custom.repository;

import org.eclipse.emf.ecore.EPackage.Registry;

import com.gentleware.poseidon.repository.XMLSubjectRepositoryGem;

public class CustomXMLSubjectRepositoryGem extends XMLSubjectRepositoryGem {

	public CustomXMLSubjectRepositoryGem(String fileName) {
		super(fileName);
	}

	@Override
	/**
	 * Please register your emf packages here
	 * see super method for details
	 */
	protected void registerPackages(Registry packageRegistry) {		 
		super.registerPackages(packageRegistry);
	}
	
	

}
