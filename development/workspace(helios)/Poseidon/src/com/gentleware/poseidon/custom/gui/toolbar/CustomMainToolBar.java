package com.gentleware.poseidon.custom.gui.toolbar;

import com.gentleware.poseidon.gui.ApplicationWindow;
import com.gentleware.poseidon.gui.toolbar.MainToolBar;

public class CustomMainToolBar extends MainToolBar {

	private static final long serialVersionUID = -7109771703816096780L;

	public CustomMainToolBar(ApplicationWindow applicationWindow) {
		super(applicationWindow);	
	}

	public CustomMainToolBar(int orientation,
			ApplicationWindow applicationWindow) {
		super(orientation, applicationWindow);
	
	}

	public CustomMainToolBar(String name, ApplicationWindow applicationWindow) {
		super(name, applicationWindow);
	
	}

	public CustomMainToolBar(String name, int orientation,
			ApplicationWindow applicationWindow) {
		super(name, orientation, applicationWindow);	
	}

}
