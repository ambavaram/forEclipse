package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.generic.Basepage;

public class Flightspage  extends Basepage
{

@FindBy(xpath="//h1[contains(text(),'Domestic and International Flights')]")
private WebElement DomesticandInternationalFlights;

@FindBy(id="oneway")
private WebElement oneway;

@FindBy(id="roundTrip")
private WebElement roundTrip;

@FindBy(id="multiCity")
private WebElement multiCity;

@FindBy(id="gosuggest_inputSrc")
private WebElement gosuggest_inputSrc;

@FindBy(id="gosuggest_inputDest")
private WebElement gosuggest_inputDest;

@FindBy(id="departureCalendar" )
private WebElement departureCalendar;

@FindBy(id="returnCalendar")
private WebElement returnCalendar;

@FindBy(xpath="//span[contains(text(),'Traveller')]")
private WebElement Traveller;

@FindBy(id="gi_search_btn")
private WebElement gisearchbtn;

@FindBy(id="student_fare_check")
private WebElement studentfarecheck;

public Flightspage(WebDriver driver) 
{
	super(driver);
	PageFactory.initElements(driver, this);
}
public void DomesticandInternationalFlights()
{
	verifyElementpresent(DomesticandInternationalFlights);
	DomesticandInternationalFlights.click();
}
public void  oneway()
{
	verifyElementpresent(oneway);
	  oneway.click();	
}
public void roundTrip()
{
	verifyElementpresent( roundTrip);
	 roundTrip.click();	
}
public void multiCity()
{
	verifyElementpresent(multiCity);
	multiCity.click();
}
public void gosuggest_inputSrc()
{
	verifyElementpresent(gosuggest_inputSrc);
	gosuggest_inputSrc.click();
}
public void gosuggest_inputDest()
{
	verifyElementpresent(gosuggest_inputDest);
	gosuggest_inputDest.click();
}

public void departureCalendar()
{
	verifyElementpresent(departureCalendar);
	departureCalendar.click();
}

public void returnCalendar()
{
	verifyElementpresent(returnCalendar);
	returnCalendar.click();
}
public void Traveller()
{
	verifyElementpresent(Traveller);
	Traveller.click();
}
public void gisearchbtn()
{
	verifyElementpresent(gisearchbtn);
	gisearchbtn.click();
}

public void studentfarecheck()
{
	verifyElementpresent(studentfarecheck);
	studentfarecheck.click();
}

}
