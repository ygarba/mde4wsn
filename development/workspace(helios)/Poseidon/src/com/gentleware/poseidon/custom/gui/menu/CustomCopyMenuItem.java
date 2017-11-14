package com.gentleware.poseidon.custom.gui.menu;

import com.gentleware.poseidon.gui.menu.CopyMenuItem;
import com.gentleware.poseidon.idraw.foundation.DiagramViewFacet;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;

public class CustomCopyMenuItem extends CopyMenuItem {

	private static final long serialVersionUID = -1166273820750548998L;

	public CustomCopyMenuItem(DiagramViewFacet diagramView, ToolCoordinatorFacet toolCoordinator) {
		super(diagramView, toolCoordinator);
	}

}
