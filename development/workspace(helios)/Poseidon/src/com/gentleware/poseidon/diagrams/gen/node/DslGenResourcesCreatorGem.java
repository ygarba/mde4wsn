package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenResourcesCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.ResourcesCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenResourcesCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Resources";
	private DslGenResourcesCreateFacet nodeCreateFacet = new ResourcesCreateFacetImpl();

	public DslGenResourcesCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenResourcesCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
