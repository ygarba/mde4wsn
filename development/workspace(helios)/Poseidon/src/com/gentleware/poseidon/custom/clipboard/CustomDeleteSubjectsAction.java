/**
 * 
 */
package com.gentleware.poseidon.custom.clipboard;

import com.gentleware.poseidon.clipboard.DeleteSubjectsAction;
import com.gentleware.poseidon.idraw.foundation.DiagramViewFacet;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;

public class CustomDeleteSubjectsAction extends DeleteSubjectsAction {

	private static final long serialVersionUID = 1L;

	public CustomDeleteSubjectsAction(ToolCoordinatorFacet coordinator, DiagramViewFacet diagramView) {
		super(coordinator, diagramView);
	}

}
