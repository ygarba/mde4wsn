package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenSensingActionCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.SensingActionCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenSensingActionCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "SensingAction";
	private DslGenSensingActionCreateFacet nodeCreateFacet = new SensingActionCreateFacetImpl();

	public DslGenSensingActionCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenSensingActionCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
