package com.gentleware.poseidon.custom.repobrowser;

import java.util.Set;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.deltaengine.errorchecking.ErrorRegister;
import com.gentleware.poseidon.easydock.EasyDock;
import com.gentleware.poseidon.idraw.foundation.ToolCoordinatorFacet;
import com.gentleware.poseidon.jumble.packageview.base.PackageViewRegistryFacet;
import com.gentleware.poseidon.repobrowser.DiagramOpenerFacet;
import com.gentleware.poseidon.repobrowser.TreeMediator;
import com.gentleware.poseidon.repositorybase.SubjectRepositoryFacet;

public class CustomTreeMediator extends TreeMediator {

	public CustomTreeMediator(SubjectRepositoryFacet repository, ToolCoordinatorFacet coordinator, boolean outlineMode, EObject start, JPopupMenu parentPopup,
			JMenuItem[] items, DiagramOpenerFacet diagramOpener, ErrorRegister errors, Set<String> exclude, PackageViewRegistryFacet packageViewRegistryFacet, EasyDock desktop) {
		super(repository, coordinator, outlineMode, start, parentPopup, items, diagramOpener, errors, exclude, packageViewRegistryFacet, desktop);
	}

}
