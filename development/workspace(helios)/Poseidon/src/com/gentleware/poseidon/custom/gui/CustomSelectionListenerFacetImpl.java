package com.gentleware.poseidon.custom.gui;

import bibliothek.gui.dock.common.DefaultSingleCDockable;

import com.gentleware.poseidon.gui.SelectionListenerFacetImpl;
import com.gentleware.poseidon.idraw.foundation.PaletteManagerFacet;
import com.gentleware.poseidon.repobrowser.RepositoryBrowserGem;

public class CustomSelectionListenerFacetImpl extends SelectionListenerFacetImpl {

	public CustomSelectionListenerFacetImpl(RepositoryBrowserGem browserGem,
			DefaultSingleCDockable dockable, PaletteManagerFacet paletteFacet) {
		super(browserGem, dockable, paletteFacet);
	}

}
