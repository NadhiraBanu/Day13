package org.testleaf.ProjectSpecificMethod;

import java.io.IOException;

import org.testleaf.SeleniumBase.SeleniumBase;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Files.ReadExcel;

public class ProjectSpecificMethod  extends SeleniumBase{
	
	public String ExcelFilename;
	public String Sheetname;
	
	
	
	@BeforeMethod
	
	public void launch() throws InterruptedException
	{
		startapp("chrome","http://leaftaps.com/opentaps");
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	
	public void close()
	{
		closebrowser();
	}
	
	
@DataProvider
	
	public String[][] senddata() throws IOException
	{
       ReadExcel e = new ReadExcel();
		
		return e.readExcel(ExcelFilename, Sheetname);
		
	}
	

}
