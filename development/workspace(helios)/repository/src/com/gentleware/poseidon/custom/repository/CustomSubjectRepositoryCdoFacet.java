package com.gentleware.poseidon.custom.repository;

import com.gentleware.poseidon.repository.CdoSubjectRepositoryGem;
import com.gentleware.poseidon.repository.SubjectRepositoryCdoFacet;

public class CustomSubjectRepositoryCdoFacet extends SubjectRepositoryCdoFacet {

	public CustomSubjectRepositoryCdoFacet(CdoSubjectRepositoryGem subjectRepositoryGem) {
		super(subjectRepositoryGem);
	}

}
