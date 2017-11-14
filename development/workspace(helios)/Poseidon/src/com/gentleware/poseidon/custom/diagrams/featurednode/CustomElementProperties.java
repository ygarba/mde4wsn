package com.gentleware.poseidon.custom.diagrams.featurednode;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.diagrams.classifier.ElementProperties;
import com.gentleware.poseidon.idraw.foundation.FigureFacet;

public class CustomElementProperties extends ElementProperties {

	public CustomElementProperties(FigureFacet figureToCalculatePerspectiveFrom, EObject element) {
		super(figureToCalculatePerspectiveFrom, element);
	}

	public CustomElementProperties(FigureFacet figure) {
		super(figure);
	}

}
