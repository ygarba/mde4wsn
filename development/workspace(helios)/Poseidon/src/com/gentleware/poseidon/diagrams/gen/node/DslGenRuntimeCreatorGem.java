package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenRuntimeCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.RuntimeCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenRuntimeCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Runtime";
	private DslGenRuntimeCreateFacet nodeCreateFacet = new RuntimeCreateFacetImpl();

	public DslGenRuntimeCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenRuntimeCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
