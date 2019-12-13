package org.testleaf.Pages;

import java.io.IOException;

import org.testleaf.ProjectSpecificMethod.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	
		public MyHomePage clickCRM() throws IOException
		{
		
			click(locateElement("link","CRM/SFA"));
			return new MyHomePage();
		}
	
}
