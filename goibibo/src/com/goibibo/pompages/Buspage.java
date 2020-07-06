package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.generic.Basepage;

public class Buspage extends Basepage
{


	@FindBy(xpath="//h1[@class='font30 white lh1-5']")
       private WebElement Bookbusticketsonline;
	
	@FindBy(id="gi_source")
	 private WebElement From;
	
	@FindBy(id="gi_destination")
	private WebElement To;
	
	@FindBy(className="ico13 fl")
	private WebElement Depart;
	
	@FindBy(id="a_today")
	private WebElement Today;
	
	@FindBy(id="a_tomm" )
	private WebElement Tomorrow;
	
	@FindBy(id="gi_search_btn")
	private WebElement Getsetgo;
	
	public Buspage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void Bookbusticketsonline()
	{
		verifyElementpresent(Bookbusticketsonline);
		Bookbusticketsonline.click();
	}
	public void From()
	{
		verifyElementpresent(From);
		From.click();
	}
	public void To()
	{
		verifyElementpresent(To);
		To.click();
	}
	public void Depart()
	{
		verifyElementpresent(Depart);
		Depart.click();		
	}
	public void Today()
	{
		verifyElementpresent(Today);
		Today.click();
	}
	public void Tomorrow()
	{
		verifyElementpresent(Tomorrow);
		Tomorrow.click();
	}
	
	public void Getsetgo()
	{
		verifyElementpresent(Getsetgo);
		Getsetgo.click();
	}	
	
	
}
