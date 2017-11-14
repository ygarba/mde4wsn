package com.gentleware.poseidon.custom.gui.menu;

import com.gentleware.poseidon.gui.menu.MainMenuResourceBundle;
import com.gentleware.poseidon.swingx.ResourceId;

public class CustomMainMenuResourceBundle extends MainMenuResourceBundle {
	private static final String MAIN_MENU_BUNDLE = getName(CustomMainMenuResourceBundle.class);
	
	//@Author("Yau")
/*	public static final ResourceId NewYauNetworkDiagram = new ResourceId(MAIN_MENU_BUNDLE, "New Network View"); */
	public static final ResourceId NewYauNodeDiagram = new ResourceId(MAIN_MENU_BUNDLE, "New Node View");
	public static final ResourceId NewYauStateMachineDiagram = new ResourceId(MAIN_MENU_BUNDLE, "New State Machine View");
	public static final ResourceId NewYauActivityDiagram = new ResourceId(MAIN_MENU_BUNDLE, "New Activity View");
	public static final ResourceId NewYauPlatformDiagram = new ResourceId(MAIN_MENU_BUNDLE, "New Platform View");
	//end @Author("Yau")
	
	public static void add() {
        add(MAIN_MENU_BUNDLE, CustomMainMenuResourceBundle.class);
     }
	
}
