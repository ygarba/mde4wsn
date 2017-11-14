package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenFinalNodeCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.FinalNodeCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

import com.gentleware.poseidon.custom.diagrams.property.impl.FillColorPropertyImpl;
import java.awt.Color;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenFinalNodeCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "FinalNode";
	private DslGenFinalNodeCreateFacet nodeCreateFacet = new FinalNodeCreateFacetImpl();

	public DslGenFinalNodeCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenFinalNodeCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
		DiagramProperty property;
		property = new FillColorPropertyImpl();
		property.setValue(Color.BLACK);
		diagramProperties.put(property.getPropertyName(), property);
	}

	public String getCreatorName() {
		return NAME;
	}

	public void setFillColor(Color fillColor) {
		diagramProperties.get("fill").setValue(fillColor);
	}

	public Color getFillColor() {
		return (Color) diagramProperties.get("fill").getValue();
	}

}
