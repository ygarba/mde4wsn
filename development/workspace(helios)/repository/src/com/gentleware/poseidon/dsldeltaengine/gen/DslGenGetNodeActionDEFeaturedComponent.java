package com.gentleware.poseidon.dsldeltaengine.gen;

import java.util.HashMap;
import java.util.Map;
import com.gentleware.poseidon.deltaengine.base.Deltas;
import com.gentleware.poseidon.deltaengine.base.IDeltas;
import org.eclipse.emf.ecore.EObject;
import com.gentleware.poseidon.dsl.wsn.*;
import com.gentleware.poseidon.dsldeltaengine.AbstractDEComponent;
import com.gentleware.poseidon.repository.SemanticElementManager;
import com.gentleware.poseidon.diagrams.gen.base.DslGenElementRoles;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenGetNodeActionDEFeaturedComponent extends AbstractDEComponent {

	private Map<String, Map<String, Deltas>> featuresOfType = new HashMap<String, Map<String, Deltas>>();

	public DslGenGetNodeActionDEFeaturedComponent(EObject subject) {
		super(subject);
	}

	public IDeltas getDeltas(String ownerRole, String childRole) {
		super.getDeltas(ownerRole, childRole);
		Map<String, Deltas> featuresForGivenOwner = featuresOfType
				.get(ownerRole);
		if (featuresForGivenOwner != null) {
			Deltas deltas = featuresForGivenOwner.get(childRole);
			if (deltas != null) {
				return deltas;
			}
		}
		return super.getDeltas(ownerRole, childRole);
	}

	public void initialiseDeltas() {
	}

	@Override
	public boolean isNamespace() {
		if (getSubject() != null) {
			return SemanticElementManager.getInstance().isElementANamespace(
					getSubject());
		}
		return super.isNamespace();
	}
}
