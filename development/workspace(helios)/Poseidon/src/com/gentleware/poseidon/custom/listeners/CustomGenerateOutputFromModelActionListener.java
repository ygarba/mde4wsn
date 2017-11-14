package com.gentleware.poseidon.custom.listeners;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;

import com.gentleware.poseidon.dsl.PoseidonCoreRootElement;
import com.gentleware.poseidon.gui.ApplicationWindow;
import com.gentleware.poseidon.listeners.GenerateOutputFromModelActionListener;
import com.gentleware.poseidon.repositorybase.GlobalSubjectRepository;
import com.gentleware.poseidon.repositorybase.SubjectRepositoryFacet;

public class CustomGenerateOutputFromModelActionListener extends GenerateOutputFromModelActionListener {
	public static final String WORKFLOW_FILE_NAME = "GenerateFromPoseidon.mwe";

	public CustomGenerateOutputFromModelActionListener(ApplicationWindow applicationWindow) {
		super(applicationWindow);
	}
	
	// Below is an example of running the generation 
	/*
	public void actionPerformed(ActionEvent e) {
		Map<String, String> properties = new HashMap<String, String>();
		Map<Object, Object> slotContents = new HashMap<Object, Object>();

		SubjectRepositoryFacet repository = GlobalSubjectRepository.repository;
		PoseidonCoreRootElement topLevelModel = repository.getTopLevelModel();
		slotContents.put("model", topLevelModel);
		WorkflowRunner workflowRunner = new WorkflowRunner();

		boolean successfulRun = false;
		boolean wellPrepared = workflowRunner.prepare(WORKFLOW_FILE_NAME, null, properties);
		if (!wellPrepared) {
			applicationWindow.getCoordinator().invokeErrorDialog("Generation failed", "Generation failed because of configuration error(s)");
			return;
		}
		IssuesImpl issues = new IssuesImpl();
		successfulRun = workflowRunner.executeWorkflow(slotContents, issues);
		if (!successfulRun) {
			MWEDiagnostic[] errors = issues.getErrors();
			MWEDiagnostic firstError = errors[0];
			String message = firstError.getMessage();
			applicationWindow.getCoordinator().invokeErrorDialog("Generation failed", "Generation falied: " + "\n" + message);
			return;
		} else {
			applicationWindow.getCoordinator().invokeInfoDialog("Generation", "Generation completed successfully");
		}
	}
	*/	
}
