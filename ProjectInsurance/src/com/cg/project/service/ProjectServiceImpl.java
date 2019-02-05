package com.cg.project.service;

import java.util.regex.Pattern;

import com.cg.project.dao.ProjectDao;
import com.cg.project.dao.ProjectDaoImpl;
import com.cg.project.exception.ProjectException;
import com.cg.project.presentation.Presentation;

public class ProjectServiceImpl implements ProjectService {
	ProjectDao projectDao = new ProjectDaoImpl();



/*	private boolean checkpolicyNumber(int policyNumber) {
		String policynumberRegEx = "[0-9]{10}$";
		return Pattern.matches(policynumberRegEx, String.valueOf(policyNumber));
	}
	private boolean checkaccidentZip(int accidentZip) {
		String accidentzipRegEx = "[0-9]{5}$";
		return Pattern.matches(accidentzipRegEx, String.valueOf(accidentZip));
	}

	private boolean checkaccidentState(String accidentState) {
		String accidentstateRegEx = "[A-Z]{1}[a-zA-Z]{3,15}$";
		return Pattern.matches(accidentstateRegEx, String.valueOf(accidentState));
	}

	private boolean checkaccidentCity(String accidentCity) {
		String accidentcityRegEx = "[A-Z]{1}[a-zA-Z]{2,15}$";
		return Pattern.matches(accidentcityRegEx, String.valueOf(accidentCity));
	}

	private boolean checkAccidentLocationStreet(String accidentLocationStreet) {
	}

	public boolean CheckclaimReason(String claimReason) {
		
	}
*/
	@Override
	public int addCustomerDetails(Presentation presentation) throws ProjectException {
		// TODO Auto-generated method stub
		return projectDao.addCustomerDetails(presentation);
	}



	@Override
	public boolean CheckClaimReason(String claimReason) {
		String claimreasonRegEx = "[A-Z]{1}[a-zA-Z]{4,30}$";
		boolean input=Pattern.matches(claimreasonRegEx, String.valueOf(claimReason));
		return input;
		}



	@Override
	public boolean CheckAccidentLocationStreet(String accidentLocationStreet) {
		String accidentlocationstreetRegEx = "[A-Z]{1}[a-zA-Z0-9]{4,30}$";
		return Pattern.matches(accidentlocationstreetRegEx, String.valueOf(accidentLocationStreet));
	}

}
