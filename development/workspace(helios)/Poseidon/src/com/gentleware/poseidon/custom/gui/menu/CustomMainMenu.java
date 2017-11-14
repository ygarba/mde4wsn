package com.gentleware.poseidon.custom.gui.menu;

//Yau: actual imports
import com.gentleware.poseidon.gui.ApplicationWindow;
import com.gentleware.poseidon.gui.menu.MainMenu;
//Yau: end actual imports
import com.gentleware.poseidon.swingx.ResourceId;
import javax.swing.JMenuItem;

public class CustomMainMenu extends MainMenu {

	public CustomMainMenu(ApplicationWindow applicationWindow) {
		super(applicationWindow);
	}
	
	@Override
	protected void createPoseidonCreateMenu() {
		super.createPoseidonCreateMenu();
		ResourceId createMenuResourceId = CustomMainMenuResourceBundle.Create; 
		
		//Yau: for Network View
/*		JMenuItem NetworkDiagramItem = factory.addMenuItem(createMenuResourceId, 
				createMenuResourceId, CustomMainMenuResourceBundle.NewYauNetworkDiagram, "b"); */
		//Yau: for Node View
		JMenuItem NodeDiagramItem = factory.addMenuItem(createMenuResourceId, 
				createMenuResourceId, CustomMainMenuResourceBundle.NewYauNodeDiagram, "b");
		//Yau: for State Machine View
		JMenuItem StateMachineDiagramItem = factory.addMenuItem(createMenuResourceId, 
				createMenuResourceId, CustomMainMenuResourceBundle.NewYauStateMachineDiagram, "c");
		//Yau: for Activity View
		JMenuItem ActivityDiagramItem = factory.addMenuItem(createMenuResourceId, 
				createMenuResourceId, CustomMainMenuResourceBundle.NewYauActivityDiagram, "d");
		//Yau: for Platform View
		JMenuItem PlatformDiagramItem = factory.addMenuItem(createMenuResourceId, 
				createMenuResourceId, CustomMainMenuResourceBundle.NewYauPlatformDiagram, "e");
		
		//Yau: Instantiate the listener for all the new diagrams
	/*	NewYauNetworkDiagramActionListener actionListener4Network = 
			new	NewYauNetworkDiagramActionListener(this.applicationWindow); */
		NewYauNodeDiagramActionListener actionListener4Node = 
			new	NewYauNodeDiagramActionListener(this.applicationWindow);
		NewYauStateMachineDiagramActionListener actionListener4StateMachine = 
			new	NewYauStateMachineDiagramActionListener(this.applicationWindow);
		NewYauActivityDiagramActionListener actionListener4Activity = 
			new	NewYauActivityDiagramActionListener(this.applicationWindow);
		NewYauPlatformDiagramActionListener actionListener4Platform = 
			new	NewYauPlatformDiagramActionListener(this.applicationWindow);
		
		//Yau: add action listener for all the views
	/*	NetworkDiagramItem.addActionListener(actionListener4Network); */
		NodeDiagramItem.addActionListener(actionListener4Node);
		StateMachineDiagramItem.addActionListener(actionListener4StateMachine);
		ActivityDiagramItem.addActionListener(actionListener4Activity);
		PlatformDiagramItem.addActionListener(actionListener4Platform);
	}

}
