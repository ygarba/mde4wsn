package com.gentleware.poseidon.custom.repobrowser;

import com.gentleware.poseidon.jumble.packageview.base.PackageViewRegistryFacet;
import com.gentleware.poseidon.repobrowser.TreeMediator;
import com.gentleware.poseidon.repobrowser.TreeMenuCreator;

public class CustomTreeMenuCreator extends TreeMenuCreator {

	public CustomTreeMenuCreator(PackageViewRegistryFacet packageViewRegistryFacet, TreeMediator mediator) {
		super(packageViewRegistryFacet, mediator);
	}

}
