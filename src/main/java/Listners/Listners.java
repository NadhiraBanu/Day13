package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	
	// When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");					
    }		
    
    
    
 // When Test case get passed, this method is called.
    @Override
	public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());					
    }	
	
	

}
