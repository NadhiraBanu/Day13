package org.testleaf.Pages;


import java.io.IOException;

import org.testleaf.ProjectSpecificMethod.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	

	
	
	  public LoginPage enterUsername(String USNAME) throws IOException {
	   
		  enterText(locateElement("id","username"), USNAME);
	  return this; }
	  
	 
	
	public LoginPage enterPassWord(String Password) throws IOException
	{
		
		enterText(locateElement("id","password"), Password);
		return this;
	}

	
	public  HomePage login() throws IOException
	{
		click(locateElement("class","decorativeSubmit"));
	return new HomePage();
	}
	


}
