package org.testleaf.Pages;

import java.io.IOException;

import org.testleaf.ProjectSpecificMethod.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {

	
	public MyLead clickLeadtab() throws IOException
	{
		
		click(locateElement("xpath","//*[text()='Leads']"));
		return new MyLead();
	}
	
}
