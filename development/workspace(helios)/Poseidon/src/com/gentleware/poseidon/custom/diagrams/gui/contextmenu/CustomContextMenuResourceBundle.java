package com.gentleware.poseidon.custom.diagrams.gui.contextmenu;

import com.gentleware.poseidon.diagrams.gui.contextmenu.ContextMenuResourceBundle;

public class CustomContextMenuResourceBundle extends ContextMenuResourceBundle {
	public final String BUNDLE = getName(CustomContextMenuResourceBundle.class);

	@Override
	public void add() {
		add(BUNDLE, CustomContextMenuResourceBundle.class);
	}

	@Override
	public void remove() {
		remove();
	}

	@Override
	public String getBundle() {
		return BUNDLE;
	}
}
