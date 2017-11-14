package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenObjectivesCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.ObjectivesCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenObjectivesCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Objectives";
	private DslGenObjectivesCreateFacet nodeCreateFacet = new ObjectivesCreateFacetImpl();

	public DslGenObjectivesCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenObjectivesCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
