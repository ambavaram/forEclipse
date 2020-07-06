
package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goibibo.generic.Basepage;

public class Homepage  extends Basepage
{

@FindBy(xpath="//span[contains(text(),'Hotels')]")
private WebElement Hotels;

public Homepage(WebDriver driver)
{
	super(driver);
	
}
public void Hotels() throws InterruptedException
{
	try
	{
	verifyElementpresent(Hotels);
	mouseover(Hotels);
	log.info("");
}
catch(Exception e)
{
	log.error("");
}

}
	
}




