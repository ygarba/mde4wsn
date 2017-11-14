package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenUpdatePoolActionCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.UpdatePoolActionCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenUpdatePoolActionCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "UpdatePoolAction";
	private DslGenUpdatePoolActionCreateFacet nodeCreateFacet = new UpdatePoolActionCreateFacetImpl();

	public DslGenUpdatePoolActionCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenUpdatePoolActionCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
