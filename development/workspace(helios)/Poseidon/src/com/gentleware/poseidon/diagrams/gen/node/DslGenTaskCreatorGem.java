package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenTaskCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.TaskCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenTaskCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Task";
	private DslGenTaskCreateFacet nodeCreateFacet = new TaskCreateFacetImpl();

	public DslGenTaskCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenTaskCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
