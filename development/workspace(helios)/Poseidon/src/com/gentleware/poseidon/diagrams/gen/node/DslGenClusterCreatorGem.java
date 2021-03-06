package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenClusterCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.ClusterCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenClusterCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "Cluster";
	private DslGenClusterCreateFacet nodeCreateFacet = new ClusterCreateFacetImpl();

	public DslGenClusterCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenClusterCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
