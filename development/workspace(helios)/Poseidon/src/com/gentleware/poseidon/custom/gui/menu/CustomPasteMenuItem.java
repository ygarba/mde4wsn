package com.gentleware.poseidon.custom.gui.menu;

import com.gentleware.poseidon.gui.menu.PasteMenuItem;
import com.gentleware.poseidon.idraw.foundation.DiagramViewFacet;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;

public class CustomPasteMenuItem extends PasteMenuItem {

	private static final long serialVersionUID = -7145346134304951885L;

	public CustomPasteMenuItem(DiagramViewFacet diagramView, ToolCoordinatorFacet toolCoordinator, boolean sourceIsMainMenu, boolean copyComplete) {
		super(diagramView, toolCoordinator, sourceIsMainMenu, copyComplete);
	}

}
