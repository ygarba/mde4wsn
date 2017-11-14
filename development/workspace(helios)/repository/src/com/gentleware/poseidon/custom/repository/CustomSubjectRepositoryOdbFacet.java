package com.gentleware.poseidon.custom.repository;

import com.gentleware.poseidon.repository.ObjectDbSubjectRepositoryGem;
import com.gentleware.poseidon.repository.SubjectRepositoryOdbFacet;

public class CustomSubjectRepositoryOdbFacet extends SubjectRepositoryOdbFacet {

	public CustomSubjectRepositoryOdbFacet(ObjectDbSubjectRepositoryGem subjectRepositoryGem) {
		super(subjectRepositoryGem);
	}

}
