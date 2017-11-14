package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenActivationProfileCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.ActivationProfileCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenActivationProfileCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "ActivationProfile";
	private DslGenActivationProfileCreateFacet nodeCreateFacet = new ActivationProfileCreateFacetImpl();

	public DslGenActivationProfileCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenActivationProfileCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
