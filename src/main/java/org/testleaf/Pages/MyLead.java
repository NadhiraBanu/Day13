package org.testleaf.Pages;

import java.io.IOException;

import org.testleaf.ProjectSpecificMethod.ProjectSpecificMethod;

public class MyLead  extends ProjectSpecificMethod{
	
	
	
	public CreateLead clickCreate() throws IOException
	{
		
		click(locateElement("link","Create Lead"));
		return new CreateLead();
	}

}
