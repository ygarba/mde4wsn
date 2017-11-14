package com.gentleware.poseidon.custom.diagrams.base;

import java.awt.Color;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.diagrams.base.BasicArcAppearanceFacetImpl;
import com.gentleware.poseidon.idraw.foundation.FigureFacet;

public class CustomBasicArcAppearanceFacet extends BasicArcAppearanceFacetImpl {

	public CustomBasicArcAppearanceFacet(Color fillColor, Color lineColor, FigureFacet figureFacet, String figureName, EObject subject) {
		super(fillColor, lineColor, figureFacet, figureName, subject);
	}

}
