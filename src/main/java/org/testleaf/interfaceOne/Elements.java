package org.testleaf.interfaceOne;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public interface Elements {
	
	
	public void enterText(WebElement w , String data ) throws IOException;
	public void click(WebElement web) throws IOException;
	public WebElement locateElement(String type , String value );

}
