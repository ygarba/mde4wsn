package com.gentleware.poseidon.custom.idraw.jazz.nodes.creation;

import com.gentleware.poseidon.idraw.jazz.nodes.creation.CompositeCreateCommandFactory;

public class CustomCompositeCreateCommandFactory extends CompositeCreateCommandFactory {

	public static CompositeCreateCommandFactory getInstance() {
		if (instance == null) {
			instance = new CompositeCreateCommandFactory();
		}
		return instance;
	}
}
