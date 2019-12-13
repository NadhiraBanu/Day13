package org.testleaf.SeleniumBase;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testleaf.interfaceOne.Browser;
import org.testleaf.interfaceOne.Elements;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class SeleniumBase  implements Browser,Elements {

	public static RemoteWebDriver driver;
	
	// Launch Browser and type Url 
	
	public void startapp(String browser , String Url )
	{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"./drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
	}
	

	
	// Send Keys
	
	public void enterText(WebElement w , String data ) throws IOException
	{
		w.clear();
		w.sendKeys(data);
	capture("Snap001");
	//	reporting();	

	}
	
	
	
	
	// Click 
	
	public void click(WebElement web) throws IOException
	{
		web.click();
	capture("Snap002");
		//reporting();
	}
	
	
	// Locate Element 
	
	
	public WebElement locateElement(String locatorType, String value) {
	
			switch(locatorType.toLowerCase()) {
			case "id": return driver.findElementById(value);
			case "name": return driver.findElementByName(value);
			case "class": return driver.findElementByClassName(value);
			case "link": return driver.findElementByLinkText(value);
			case "xpath": return driver.findElementByXPath(value);
	
			}
			
			return null;
	}


	
	public WebElement locateElement1(String value) {
		WebElement findElementById = driver.findElement(By.id(value));
		return findElementById;
	}

	
	
	public String capture(String SnapName) throws IOException
	{
		
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
		Date date = new Date();
		File Source1 = driver.getScreenshotAs(OutputType.FILE);
		String Destination2 = "./Snaps/"+SnapName+"-"+dateFormat.format(date)+".png";
		File target = new File(Destination2);
		FileUtils.copyFile(Source1, target);
		return Destination2;
	}

	
	
	// Report
	
	
	/*
	 * public static ExtentHtmlReporter reporter; public static ExtentReports
	 * report; public static ExtentTest log;
	 * 
	 * 
	 * public String TestName="Test001";
	 * 
	 * 
	 * 
	 * 
	 * @BeforeSuite public void start() {
	 * 
	 * reporter = new ExtentHtmlReporter("./reports/report.html");
	 * reporter.setAppendExisting(true);
	 * 
	 * report = new ExtentReports(); report.attachReporter(reporter);
	 * 
	 * }
	 * 
	 * 
	 * public void reporting() throws IOException {
	 * 
	 * log = report.createTest(TestName);
	 * 
	 * 
	 * log.log(Status.PASS, "Success"); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @AfterSuite public void stopReport() { report.flush(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */	
	
	
	
	
	public void closebrowser()
	{
		driver.close();
	}



	
	
	
	
	
	
	
}





