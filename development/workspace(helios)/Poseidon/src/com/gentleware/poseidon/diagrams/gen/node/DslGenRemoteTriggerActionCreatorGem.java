package com.gentleware.poseidon.diagrams.gen.node;

import com.gentleware.poseidon.diagrams.gen.node.DslGenRemoteTriggerActionCreateFacet;
import com.gentleware.poseidon.custom.diagrams.node.impl.RemoteTriggerActionCreateFacetImpl;

import com.gentleware.poseidon.custom.diagrams.base.CustomBaseCreatorGem;
import com.gentleware.poseidon.diagrams.base.DiagramProperty;
import com.gentleware.poseidon.idraw.utility.ScreenProperties;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenRemoteTriggerActionCreatorGem extends CustomBaseCreatorGem {
	public static final String NAME = "RemoteTriggerAction";
	private DslGenRemoteTriggerActionCreateFacet nodeCreateFacet = new RemoteTriggerActionCreateFacetImpl();

	public DslGenRemoteTriggerActionCreatorGem() {
		createProperties();
		nodeCreateFacet.setCreatorGem(this);
	}

	public DslGenRemoteTriggerActionCreateFacet getNodeCreateFacet() {
		return nodeCreateFacet;
	}

	private void createProperties() {
	}

	public String getCreatorName() {
		return NAME;
	}

}
