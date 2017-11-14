package com.gentleware.poseidon.custom.gui.menu;

import com.gentleware.poseidon.gui.menu.CutMenuItem;
import com.gentleware.poseidon.idraw.foundation.DiagramViewFacet;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;

public class CustomCutMenuItem extends CutMenuItem {

	private static final long serialVersionUID = 5970347833178993132L;

	public CustomCutMenuItem(DiagramViewFacet diagramView, ToolCoordinatorFacet toolCoordinator) {
		super(diagramView, toolCoordinator);
	}

}
