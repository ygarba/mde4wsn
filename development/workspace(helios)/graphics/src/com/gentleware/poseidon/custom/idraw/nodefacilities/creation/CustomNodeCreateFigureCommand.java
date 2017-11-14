package com.gentleware.poseidon.custom.idraw.nodefacilities.creation;

import com.gentleware.poseidon.geometry.UDimension;
import com.gentleware.poseidon.geometry.UPoint;
import com.gentleware.poseidon.idraw.foundation.FigureReference;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;
import com.gentleware.poseidon.idraw.nodefacilities.creation.NodeCreateFigureCommand;
import com.gentleware.poseidon.idraw.nodefacilities.creationbase.NodeCreateFacet;

public class CustomNodeCreateFigureCommand extends NodeCreateFigureCommand {
	private static final long serialVersionUID = 4784634017364680101L;

	public CustomNodeCreateFigureCommand(Object useSubject,
			FigureReference reference, FigureReference containingReference,
			NodeCreateFacet factory, UPoint location, boolean previewingOnly,
			PersistentProperties properties, Object relatedSubject,
			String executeDescription, String unExecuteDescription) {
		this(useSubject, reference, containingReference, factory, location,
				previewingOnly, properties, relatedSubject, executeDescription,
				unExecuteDescription, null, false);
	}
	
	public CustomNodeCreateFigureCommand(Object useSubject,
			FigureReference reference, FigureReference containingReference,
			NodeCreateFacet factory, UPoint location, boolean previewingOnly,
			PersistentProperties properties, Object relatedSubject,
			String executeDescription, String unExecuteDescription, boolean createAsFeature) {
		this(useSubject, reference, containingReference, factory, location,
				previewingOnly, properties, relatedSubject, executeDescription,
				unExecuteDescription, null, createAsFeature);
	}

	public CustomNodeCreateFigureCommand(Object useSubject,
			FigureReference reference, FigureReference containingReference,
			NodeCreateFacet factory, UPoint location, boolean previewingOnly,
			PersistentProperties properties, Object relatedSubject,
			String executeDescription, String unExecuteDescription,
			UDimension forcedDimensions) {
		super(useSubject, reference, containingReference, factory, location,
				previewingOnly, properties, relatedSubject, executeDescription,
				unExecuteDescription, forcedDimensions, false);
	}	
	
	public CustomNodeCreateFigureCommand(Object useSubject,
			FigureReference reference, FigureReference containingReference,
			NodeCreateFacet factory, UPoint location, boolean previewingOnly,
			PersistentProperties properties, Object relatedSubject,
			String executeDescription, String unExecuteDescription,
			UDimension forcedDimensions, boolean createAsFeature) {
		super(useSubject, reference, containingReference, factory, location,
				previewingOnly, properties, relatedSubject, executeDescription,
				unExecuteDescription, forcedDimensions, createAsFeature);
	}

}
