package org.isf.opd.test;


import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.isf.disease.model.Disease;
import org.isf.opd.model.Opd;
import org.isf.patient.model.Patient;
import org.isf.utils.exception.OHException;

public class TestOpd 
{	
    private int code = 999999999;
	private GregorianCalendar visitDate = new GregorianCalendar(1984, Calendar.AUGUST, 14);
	private int age = 9;
	private char sex = 'F';
	private String note = "TestNote";
	private int prog_year = 2008;
	private int lock = 0;
	private char newPatient = 'N';
	private String referralFrom = "R";
	private String referralTo = "R";
	private String userID = "TestUser";
    
			
	public Opd setup(
			Patient patient,
			Disease disease,
			boolean usingSet) throws OHException 
	{
		Opd opd;
	
				
		if (usingSet == true)
		{
			opd = new Opd();
			_setParameters(patient, disease, opd);
		}
		else
		{
			// Create Opd with all parameters 
			opd = new Opd(prog_year, sex, age, disease, lock);
			opd.setCode(code);
			opd.setVisitDate(visitDate);
			opd.setNote(note);
			opd.setNewPatient(newPatient); 
			opd.setReferralFrom(referralFrom); 
			opd.setReferralTo(referralTo);
			opd.setUserID(userID);
			opd.setPatient(patient);
			opd.setDisease2(disease);
			opd.setDisease3(disease);
		}
				    	
		return opd;
	}
	
	public void _setParameters(
			Patient patient,
			Disease disease,
			Opd opd) 
	{	
		opd.setCode(code);
		opd.setVisitDate(visitDate);
		opd.setAge(age);
		opd.setSex(sex);
		opd.setNote(note);
		opd.setProgYear(prog_year);
		opd.setLock(lock);
		opd.setNewPatient(newPatient);
		opd.setReferralFrom(referralFrom);
		opd.setReferralTo(referralTo);
		opd.setUserID(userID);
		opd.setPatient(patient);
		opd.setDisease(disease);
		opd.setDisease2(disease);
		opd.setDisease3(disease);		
		
		return;
	}
	
	public void check(
			Opd opd) 
	{		
    	System.out.println("Check Opd: " + opd.getCode());
    	assertEquals(code, opd.getCode());
    	assertEquals(visitDate, opd.getVisitDate());
    	assertEquals(age, opd.getAge());
    	assertEquals(sex, opd.getSex());
    	assertEquals(note, opd.getNote());
    	assertEquals(prog_year, opd.getProgYear());
    	assertEquals(lock, opd.getLock());
    	assertEquals(newPatient, opd.getNewPatient());
    	assertEquals(referralFrom, opd.getReferralFrom());
    	assertEquals(referralTo, opd.getReferralTo());
    	assertEquals(userID, opd.getUserID());
		
		return;
	}
}
