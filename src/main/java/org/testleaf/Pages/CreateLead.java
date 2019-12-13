package org.testleaf.Pages;

import java.io.IOException;

import org.testleaf.ProjectSpecificMethod.ProjectSpecificMethod;

public class CreateLead  extends ProjectSpecificMethod{
	
	
	
	public CreateLead enterCompany(String Coompany) throws IOException
	{
		enterText(locateElement("id","createLeadForm_companyName"), Coompany);
		return this;
	}
	
	public CreateLead enterFirstName(String FirstName) throws IOException
	{
		enterText(locateElement("id","createLeadForm_firstName"), FirstName);
		return this;
	}
	
	
	public CreateLead enterSecondName(String SecondName) throws IOException
	{enterText(locateElement("id","createLeadForm_lastName"), SecondName);
		return this;
	}
	
	
	
	public ViewLead submit() throws IOException
	{
		click(locateElement("name","submitButton"));
		return new ViewLead();
	}

}
