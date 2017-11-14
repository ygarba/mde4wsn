/**
 * 
 */
package com.gentleware.poseidon.custom.clipboard;

import com.gentleware.poseidon.clipboard.DeleteAction;
import com.gentleware.poseidon.idraw.foundation.DiagramViewFacet;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;

public class CustomDeleteAction extends DeleteAction {

	private static final long serialVersionUID = 1L;

	public CustomDeleteAction(ToolCoordinatorFacet coordinator, DiagramViewFacet diagramView) {
		super(coordinator, diagramView);
	}
}
