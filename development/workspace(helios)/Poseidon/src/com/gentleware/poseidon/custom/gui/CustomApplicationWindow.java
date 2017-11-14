package com.gentleware.poseidon.custom.gui;

import com.gentleware.poseidon.deltaengine.errorchecking.ErrorRegister;
import com.gentleware.poseidon.gui.ApplicationWindow;

public class CustomApplicationWindow extends ApplicationWindow {

	private static final long serialVersionUID = 310587965650249150L;

	public CustomApplicationWindow(String title, ErrorRegister errors) {
		super(title, errors);	
	}

}
