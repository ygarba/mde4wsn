package com.gentleware.poseidon.custom.gui.menu;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.diagrams.listeners.NewDefaultDiagramActionListener;
import com.gentleware.poseidon.gui.ApplicationWindow;
import com.gentleware.poseidon.repositorybase.DslGenDiagramType; //Yau: added as suggest fix

public class NewYauActivityDiagramActionListener extends
		NewDefaultDiagramActionListener {

	public NewYauActivityDiagramActionListener(
			ApplicationWindow applicationWindow) {
		super(applicationWindow);
		// TODO Auto-generated constructor stub
	}

	public NewYauActivityDiagramActionListener(
			ApplicationWindow applicationWindow, EObject diagramOwner) {
		super(applicationWindow, diagramOwner);
		// TODO Auto-generated constructor stub
	}
	
	//@Author(name = "Yau")
	@Override
	protected DslGenDiagramType getDiagramType() {
		return DslGenDiagramType.ACTIVITY_LITERAL;
	}
}
