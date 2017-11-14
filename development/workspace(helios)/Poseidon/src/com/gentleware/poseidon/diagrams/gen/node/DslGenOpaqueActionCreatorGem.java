package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenOpaqueActionCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.OpaqueActionCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenOpaqueActionCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "OpaqueAction";
	private DslGenOpaqueActionCreateFacet nodeCreateFacet = new OpaqueActionCreateFacetImpl();

	public DslGenOpaqueActionCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenOpaqueActionCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
