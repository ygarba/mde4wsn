package com.gentleware.poseidon.custom.repobrowser;

import com.gentleware.poseidon.repobrowser.RepositoryBrowserResourceBundle;

public class CustomRepositoryBrowserResourceBundle extends RepositoryBrowserResourceBundle {
	
	@Override
	public void add() {
		add(BUNDLE, CustomRepositoryBrowserResourceBundle.class);
	}

	@Override
	public void remove() {
		remove(BUNDLE);
	}

	@Override
	public String getBundle() {
		return BUNDLE;
	}
}
