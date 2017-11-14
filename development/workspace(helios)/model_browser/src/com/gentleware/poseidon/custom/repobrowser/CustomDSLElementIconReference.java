package com.gentleware.poseidon.custom.repobrowser;

import com.gentleware.poseidon.repobrowser.ShortCutType;
import com.gentleware.poseidon.repobrowser.DSLElementIconReference;
import com.gentleware.poseidon.repobrowser.DSLIconDeterminer;

public class CustomDSLElementIconReference extends DSLElementIconReference {


	public CustomDSLElementIconReference(Class<?> type, String name,
			ShortCutType shortCutType, DSLIconDeterminer determiner) {
		super(type, name, shortCutType, determiner);
	}

}
