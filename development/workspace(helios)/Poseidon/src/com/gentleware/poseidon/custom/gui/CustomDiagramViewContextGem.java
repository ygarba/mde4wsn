package com.gentleware.poseidon.custom.gui;

import java.util.List;

import com.gentleware.poseidon.diagrams.packageview.base.PackageViewSmartMenuItemMaker;
import com.gentleware.poseidon.gui.DiagramViewContextGem;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;
import com.gentleware.poseidon.jumble.guibase.ReusableDiagramViewFacet;

public class CustomDiagramViewContextGem extends DiagramViewContextGem {

	public CustomDiagramViewContextGem(ReusableDiagramViewFacet reusableFacet,
			ToolCoordinatorFacet toolCoordinatorFacet, List<PackageViewSmartMenuItemMaker> menuItemMakers) {
		super(reusableFacet, toolCoordinatorFacet, menuItemMakers);
	}

}
