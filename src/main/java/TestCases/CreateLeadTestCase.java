package TestCases;

import java.io.IOException;

import org.testleaf.Pages.CreateLead;
import org.testleaf.Pages.HomePage;
import org.testleaf.Pages.LoginPage;
import org.testleaf.Pages.MyHomePage;
import org.testleaf.Pages.MyLead;
import org.testleaf.Pages.ViewLead;
import org.testleaf.ProjectSpecificMethod.ProjectSpecificMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners.Listners.class)

public class CreateLeadTestCase extends ProjectSpecificMethod{
	
	
	
	@BeforeTest
	
	public void setdata()
	{
		ExcelFilename ="TestData";
		Sheetname="CreateLead";
		
	}
	

	

	@Test(dataProvider="senddata")
	
	public void createLead(String UserName ,String Pass , String Cname , String Fname , String Sname) throws IOException
	{
		new LoginPage().enterUsername(UserName).enterPassWord(Pass).login();
		new HomePage().clickCRM();
		new MyHomePage().clickLeadtab();
		new MyLead().clickCreate();
		new CreateLead().enterCompany(Cname).enterFirstName(Fname).enterSecondName(Sname).submit();
		
	}
	
	
	
	

}
