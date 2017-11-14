package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenPlatformSlotCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.PlatformSlotCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenPlatformSlotCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "PlatformSlot";
	private DslGenPlatformSlotCreateFacet nodeCreateFacet = new PlatformSlotCreateFacetImpl();

	public DslGenPlatformSlotCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenPlatformSlotCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
