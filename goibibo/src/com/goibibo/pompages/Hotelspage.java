package com.goibibo.pompages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.goibibo.generic.Basepage;

public class Hotelspage extends Basepage
{
	@FindBy(xpath="//input[@type='radio']")
	    private WebElement radiobutton;
	
	@FindBy(xpath="//input[@aria-autocomplete='list']")
	private WebElement Search;
	
	
	@FindBy(xpath="//span[contains(text(),'20')]")
	private WebElement Activedate;
	
	@FindBy(xpath="//span[contains(text(),'25')]")
	 private WebElement outactivedate;
	
	
	@FindBy(xpath="//span[contains(text(),'Ooty')]")
	private WebElement Ooty;
	
	
	@FindBy(className="TrendingDestinationsUI__OverlayMainText-qz22gb-7 kzpolP")
	private WebElement List;
	
	@FindBy(xpath="//p[contains(text(),'Mumbai')]")
	private WebElement TrendingCities;
	
	
	@FindBy(xpath="//span[contains(text(),'Hotels')]")
	private WebElement Hotels;

	@FindBy(xpath="//p[contains(text(),'India')]")
	private WebElement India;
	
	@FindBy(xpath="//p[contains(text(),'International')]")
	private WebElement International;
	
	@FindBy(xpath="//button[contains(text(),'Done')]")
	private WebElement Done;
	
	
	@FindBy(xpath="//div[contains(text(),'Check-in')]")
	private WebElement CheckinDate; 
	
	@FindBy(xpath="//div[@class='dcalendarstyles__MonthChangeRightArrowDiv-r2jz2t-16 eVCvYn']")
	private WebElement CheckinArrow;
	
	@FindBy(xpath="//div [@class='dcalendarstyles__SliderArrow-r2jz2t-14 jGviQM']")
		private WebElement calendar;
	
	@FindBy(xpath="//div[contains(text(),'Check-out Date')]")
	private WebElement CheckoutDate;
	
	@FindBy(xpath="//button[contains(text(),'Search Hotels')]")
	private WebElement SearchHotels;
	
	
	@FindBy(xpath="//span[contains(text(),'Rooms')]")
	private WebElement guestsandRooms;
	
	/*@FindBy(xpath="//div[@class='Layouts__Row-sc-1yzlivq-0 PaxWidgetstyles__ContentWrapperDiv-gv3w6r-1 ixtNEy\']//div[2]//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-gv3w6r-7 dUGaFj']")*/
	@FindBy(xpath="//div[@class='Layouts__Row-sc-1yzlivq-0 PaxWidgetstyles__ContentWrapperDiv-gv3w6r-1 ixtNEy\']//div[2]//span[contains(text(),'-')]")
	private WebElement Adults;

public Hotelspage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
	
}
public void radiobutton()
{
	try
	{
		verifyElementpresent(radiobutton);
		mouseover(radiobutton);
		radiobutton.click();
		log.info("Radio button click Success");
	}
	catch(Exception e)
	{
		log.error("Radio button click Failed");
	}
}

public void calendar()
{
	try
	{
		verifyElementpresent(calendar);
		mouseover(calendar);
		calendar.click();
		log.info("Calendar selected");
	}
	catch(Exception e)
	{
		log.error("Calendar selection failed");
	}

}
public void Search()
{
	try
	{
		verifyElementpresent(Search);
		Search.sendKeys("Ooty");
		Search.click();
		log.info("City search success");
	}
	catch(Exception e)
	{
		log.error("City search Failed");
	}

}

public void Ooty()
{
	try
	{
		verifyElementpresent(Ooty);
		Ooty.click();
		log.info("Ooty selection success");
	}
	catch(Exception e)
	{
		log.error("Ooty selection Failed");
	}
}

public void  List()
{
	try
	{
		verifyElementpresent(List);
		mouseover(List);
		List.click();
	}
	catch(Exception e)
	{
		
	}
}
public void TrendingCities()
{
	verifyElementpresent(TrendingCities);
	TrendingCities.click();
}

public void CheckinArrow() 	
{
	try
	{
		verifyElementpresent(CheckinArrow);
		CheckinArrow.click();
		log.info("Checkin calender Arrow clicked");
		
	}	
	catch (Exception e)
	{
		log.error("Arrow click failed");
	}
}
public void Activedate()
{
	try
	{
		verifyElementpresent(Activedate);
		Activedate.click();
		log.info("checkin date selected1");
	}
	catch (Exception e)
	{
		log.error("chekin date selection failed1");
	}
}
public void outactivedate()
{
	try
	{
		verifyElementpresent(outactivedate);
		outactivedate.click();
		log.info("checkout date selected1");
	}
	catch (Exception e)
	{
		log.error("checkout date selection failed1");
	}
}
public void Adults()
{
	try
	{
		verifyElementpresent(Adults);
		Adults.click();
		log.info("Adults count adjusted");
	}
	catch (Exception e)
	{
		log.error("Adults count adjustment failed");
	}
}

public void Done()
{
	verifyElementpresent(Done);
	Done.click();
}

public void Hotels()
{
	verifyElementpresent(Hotels);
	Hotels.click();
}
public void India()
{
	verifyElementpresent(India);
	India.click();
}
public void International()
{
	verifyElementpresent(International);
	International.click();
}

public void CheckinDate()
{
	try
	{
		verifyElementpresent(CheckinDate);
		CheckinDate.click();
		log.info("checkin date selected");
	}
	catch (Exception e)
	{
		log.error("checkin date selection failed");
	}
}
public void  CheckoutDate()
{
	try
	{
		verifyElementpresent( CheckoutDate);
		 CheckoutDate.click();
		 log.info("checkout date selected");
	}
	catch (Exception e)
	{
		log.error("checkout date failed to select");
	}
	
}
public void guestsandRooms()
{
	 verifyElementpresent( guestsandRooms);
	 guestsandRooms.click();
}

public void SearchHotels()
{
	try
	{
		verifyElementpresent( SearchHotels);
		 SearchHotels.click();
		 log.info("Hotel search clicked");
	}
	catch (Exception e)
	{
		log.error("Hotel search click failed");
	}
	
}


}










