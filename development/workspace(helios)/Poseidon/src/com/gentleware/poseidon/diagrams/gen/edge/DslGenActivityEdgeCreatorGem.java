package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.edge.DslGenActivityEdgeCreateFacet;
import com.gentleware.poseidon.custom.diagrams.edge.impl.ActivityEdgeCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenActivityEdgeCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "ActivityEdge";
	private DslGenActivityEdgeCreateFacet arcCreateFacet = new ActivityEdgeCreateFacetImpl();

	public DslGenActivityEdgeCreatorGem() {
		createProperties();
		arcCreateFacet.setCreatorGem(this);
	}

	public DslGenActivityEdgeCreateFacet getArcCreateFacet() {
		return arcCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
