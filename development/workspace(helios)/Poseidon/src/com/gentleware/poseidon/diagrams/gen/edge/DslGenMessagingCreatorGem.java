package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.edge.DslGenMessagingCreateFacet;
import com.gentleware.poseidon.custom.diagrams.edge.impl.MessagingCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenMessagingCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Messaging";
	private DslGenMessagingCreateFacet arcCreateFacet = new MessagingCreateFacetImpl();

	public DslGenMessagingCreatorGem() {
		createProperties();
		arcCreateFacet.setCreatorGem(this);
	}

	public DslGenMessagingCreateFacet getArcCreateFacet() {
		return arcCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
