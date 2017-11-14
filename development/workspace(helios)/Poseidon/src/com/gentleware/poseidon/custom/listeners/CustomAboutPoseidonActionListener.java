/**
 * 
 */
package com.gentleware.poseidon.custom.listeners;

import javax.swing.ImageIcon;

import com.gentleware.poseidon.gui.ApplicationWindow;
import com.gentleware.poseidon.listeners.AboutPoseidonActionListener;
import com.gentleware.poseidon.swingx.Utilities;

public class CustomAboutPoseidonActionListener extends AboutPoseidonActionListener {

	public CustomAboutPoseidonActionListener(ApplicationWindow applicationWindow) {
		super(applicationWindow);
	}

	/*Yau:
	@Override
	protected String getAboutText() {		
		return super.getAboutText();
	}
	*/
	//Yau: 
	@Override
	protected String getAboutText() {
	return "DSML for Wireless Sensor Networks, 2015";
	}
	@Override
	protected ImageIcon getAboutIcon() {
	return Utilities.loadImageIcon("about_70x70");
	}
	//Yau: end
}
