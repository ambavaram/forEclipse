package com.goibibo.generic;
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public  class Basepage 
{
	WebDriver driver=null;
	public Logger log = Logger.getLogger(Basepage.class);
	private int value;
	public Basepage(WebDriver browser)
	{
			driver=browser;
	}
	public void verifyTitlepresent(String expTitle)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		String actTitle=null;
		try
		{
			w.until(ExpectedConditions.titleContains(expTitle));
			actTitle = driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
		    log.info(expTitle+ " and "+actTitle+" matched ");	
		}
		
	catch(Exception e)	
	{
		log.error(expTitle+" and "+actTitle +" did not match "+e);
	}
}	
		
public void verifyElementpresent(WebElement ele)
{
		WebDriverWait w = new WebDriverWait(driver, 10);
		
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			log.info(ele+ " was found");
			
		}
		
		catch(Exception e)
		{
			log.error("Unable to find the element "+ele +": "+ e);
			
		}
		
}
public void mouseover(WebElement ele)
{
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			log.info("Mouse overed on" +ele);
			
		}
		catch(Exception e)
		{
			log.error("Mouse over failed "+e);
		}		
}
	
public void switchBrowser() 
{
		try 
		{
		      Set<String>handler=driver.getWindowHandles();
		      Iterator<String>it=handler.iterator();
		      String parentWindowId=it.next();
		      System.out.println("pwindowid:" +parentWindowId);
		      String childwindowId=it.next();
		      System.out.println("cwindowid:" +childwindowId);
		      driver.switchTo().window(childwindowId);
			  log.info("Browser Switch Successful");

		} 
		catch (Exception e) 
		{
			log.error("Switch Browser failed");
		}

}
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


