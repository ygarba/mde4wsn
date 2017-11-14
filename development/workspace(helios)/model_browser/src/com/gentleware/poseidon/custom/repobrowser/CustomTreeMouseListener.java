package com.gentleware.poseidon.custom.repobrowser;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTree;

import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;
import com.gentleware.poseidon.jumble.packageview.base.PackageViewRegistryFacet;
import com.gentleware.poseidon.repobrowser.DiagramOpenerFacet;
import com.gentleware.poseidon.repobrowser.TreeMouseListener;
import com.gentleware.poseidon.repobrowser.TreeMediator;
import com.gentleware.poseidon.repositorybase.SubjectRepositoryFacet;

public class CustomTreeMouseListener extends TreeMouseListener {

	public CustomTreeMouseListener(SubjectRepositoryFacet repository, ToolCoordinatorFacet coordinator,
			JPopupMenu parentPopup, JMenuItem[] items, DiagramOpenerFacet diagramOpener,
			PackageViewRegistryFacet packageViewRegistryFacet, JTree tree, TreeMediator treeMediator) {
		super(repository, coordinator, parentPopup, items, diagramOpener, packageViewRegistryFacet, tree, treeMediator);
	}

}
