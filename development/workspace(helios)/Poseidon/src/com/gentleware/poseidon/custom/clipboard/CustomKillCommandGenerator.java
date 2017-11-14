package com.gentleware.poseidon.custom.clipboard;

import java.util.Collection;
import java.util.Set;

import com.gentleware.poseidon.clipboard.KillCommandGenerator;
import com.gentleware.poseidon.idraw.foundation.DiagramReference;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;

public class CustomKillCommandGenerator extends KillCommandGenerator {

	public CustomKillCommandGenerator(ToolCoordinatorFacet coordinator, DiagramReference diagramReference,
			Collection<String> figureIdsInSelection, Set<String> figureIdsIncludedInDelete) {
		super(coordinator, diagramReference, figureIdsInSelection, figureIdsIncludedInDelete);
	}

}
	

	


