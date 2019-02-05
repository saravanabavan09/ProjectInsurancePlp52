package com.cg.project.service;

import com.cg.project.exception.ProjectException;
import com.cg.project.presentation.Presentation;

public interface ProjectService {

	int addCustomerDetails(Presentation presentation) throws ProjectException;

	boolean CheckClaimReason(String claimReason);

	boolean CheckAccidentLocationStreet(String accidentLocationStreet);

}
