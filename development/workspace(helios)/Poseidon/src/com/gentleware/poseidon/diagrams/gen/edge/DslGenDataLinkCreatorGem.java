package com.gentleware.poseidon.diagrams.gen.edge;

import com.gentleware.poseidon.diagrams.gen.edge.DslGenDataLinkCreateFacet;
import com.gentleware.poseidon.custom.diagrams.edge.impl.DataLinkCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenDataLinkCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "DataLink";
	private DslGenDataLinkCreateFacet arcCreateFacet = new DataLinkCreateFacetImpl();

	public DslGenDataLinkCreatorGem() {
		createProperties();
		arcCreateFacet.setCreatorGem(this);
	}

	public DslGenDataLinkCreateFacet getArcCreateFacet() {
		return arcCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
