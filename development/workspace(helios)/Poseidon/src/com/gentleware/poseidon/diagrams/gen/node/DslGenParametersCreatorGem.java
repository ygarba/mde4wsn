package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenParametersCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.ParametersCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenParametersCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Parameters";
	private DslGenParametersCreateFacet nodeCreateFacet = new ParametersCreateFacetImpl();

	public DslGenParametersCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenParametersCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
