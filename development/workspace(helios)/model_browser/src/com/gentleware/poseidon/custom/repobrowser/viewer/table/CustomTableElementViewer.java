package com.gentleware.poseidon.custom.repobrowser.viewer.table;

import javax.swing.JPanel;

import org.eclipse.emf.ecore.EObject;

import com.gentleware.poseidon.repobrowser.viewer.table.TableElementViewer;

public class CustomTableElementViewer extends TableElementViewer {

	public CustomTableElementViewer(EObject element, EObject subsidiary, JPanel insetPanel) {
		super(element, subsidiary, insetPanel);
	}

}
