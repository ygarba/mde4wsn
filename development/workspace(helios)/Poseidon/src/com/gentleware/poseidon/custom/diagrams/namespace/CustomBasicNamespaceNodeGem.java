package com.gentleware.poseidon.custom.diagrams.namespace;

import java.awt.Color;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.diagrams.namespace.BasicNamespaceNodeGem;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.idraw.foundation.DiagramFacet;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;

public class CustomBasicNamespaceNodeGem extends BasicNamespaceNodeGem {

	public CustomBasicNamespaceNodeGem(EObject subject, String owningPackageName, DiagramFacet diagram,
			String figureId, String figureName, Color fillColor, boolean displayOnlyIcon) {
		super(subject, owningPackageName, diagram, figureId, figureName, fillColor, displayOnlyIcon);
	}

	public CustomBasicNamespaceNodeGem(String figureName, Object element, PersistentProperties properties) {
		super(figureName, element, properties);
	}
	
}
