package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.generic.Basepage;

public class Cabspage extends Basepage 
{

@FindBy(xpath="//span [contains(text(),'Outstation')]")
private WebElement Outstation;

@FindBy(xpath="//a[contains(text(),'Airport Cabs')]")
private WebElement Airportcabs;

@FindBy(xpath="//a [contains(text(),'One Way')]")
private WebElement Oneway;

@FindBy(xpath="//a [contains(text(),'Round Trip')]")
private WebElement RoundTrip;

@FindBy(xpath="//p [contains(text(),'Enter Pickup Location')]")
private WebElement pickuplocation;

@FindBy(xpath="//p[contains(text(),'Enter Drop Location')]")
private WebElement Droplocation;

@FindBy(xpath="//p [contains(text(),'Start Date')]")
private WebElement Startdate;

@FindBy(xpath="//p[contains(text(),'Start Time')]")
private WebElement Starttime;

@FindBy(xpath="//button[contains(text(),'Search Cabs')]")
private WebElement Searchcabs;
public Cabspage(WebDriver driver) 
{
	super(driver);
	PageFactory.initElements(driver,this);
}

public void Outstation()
{
	verifyElementpresent(Outstation);
	Outstation.click();
}
public void Airportcabs()
{
	verifyElementpresent( Airportcabs);
	 Airportcabs.click();
}
public void Oneway()
{
	verifyElementpresent(Oneway);
	Oneway.click();
}

public void RoundTrip()
{
	verifyElementpresent(RoundTrip);
	RoundTrip.click();
}
public void pickuplocation()
{
	verifyElementpresent(pickuplocation);
	pickuplocation.click();
}
public void Droplocation()
{
	verifyElementpresent( Droplocation);
	 Droplocation.click();
}
	public void Startdate()
	{
		verifyElementpresent(Startdate);
		Startdate.click();	
	}
	public void Starttime()
	{
		verifyElementpresent(Starttime);
		Starttime.click();	
	}
public void Searchcabs()
{
	verifyElementpresent(Searchcabs);
	Searchcabs.click();
}
}
