package com.gentleware.poseidon.custom.diagrams.arc;

import com.gentleware.poseidon.diagrams.arc.BasicArcFigureGem;
import com.gentleware.poseidon.idraw.arcfacilities.arcsupport.BasicArcState;
import com.gentleware.poseidon.idraw.foundation.persistence.PersistentProperties;

public class CustomBasicArcFigureGem extends BasicArcFigureGem {

	public CustomBasicArcFigureGem(BasicArcState state) {
		super(state);
	}

	public CustomBasicArcFigureGem(PersistentProperties properties, BasicArcState state) {
		super(properties, state);	
	}

}
