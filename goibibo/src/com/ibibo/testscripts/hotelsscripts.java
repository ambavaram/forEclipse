package com.ibibo.testscripts;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.goibibo.generic.BaseTest;
import com.goibibo.pompages.Homepage;
import com.goibibo.pompages.Hotelspage;

import com.goibibo.pompages.SearchPage;



public class hotelsscripts extends BaseTest

{
	Homepage hp=null;	
	Hotelspage htlp=null;
	SearchPage sp=null;
	
	
	@Test()
	public void Tc_01_searchhotel()
	{
		hp=new Homepage(driver);
		htlp=new Hotelspage(driver);
		sp= new SearchPage(driver);
	
		try
		{
	        hp.Hotels();
	        htlp.Hotels();
	        htlp.radiobutton();
	        htlp.Search();
	        htlp.Ooty();
	        htlp.CheckinDate();
	        htlp.CheckinArrow();
	        Thread.sleep(2000);
	        htlp.Activedate();
	        Thread.sleep(2000);
	        htlp.outactivedate();
	        Thread.sleep(2000);
	        htlp.guestsandRooms();
	        htlp.Adults();
	        Thread.sleep(1000);
	        htlp.Done();
	        htlp.SearchHotels();
	        Thread.sleep(1000);
	        sp.FirstHotel();
	        Thread.sleep(2000);
	        sp.name();
	        Thread.sleep(3000);
	        sp.viewRoomOptions();
	        Thread.sleep(3000);
	        sp.selectRoom();
	        sp.Title();
	        sp.Firstname();
	        sp.Lastname();
	        sp.EmailAddress();
	        sp.phonenumber();
	        sp.proceedpaymentoptions();
	        sp.cardnumber();
	        sp.nameoncard();
	        sp.ExpiryDate();
	        sp.addressline();
	        sp.Zipcode();
	        sp.City();
	        sp.State();
	        sp.Mobilenumber();
	        Thread.sleep(1000);
	        sp.cvvno();
	        Thread.sleep(3000);
	        sp.pay();
	        Thread.sleep(30000);
	      
		}
		catch(Exception e)
		{
			
		}
	
	}
	
	@Test()
	public void Tc_03_searchhotel()
	{
		hp=new Homepage(driver);
		htlp=new Hotelspage(driver);
		sp= new SearchPage(driver);
		try
		{
			  hp.Hotels();
		      htlp.Hotels();
		      htlp.radiobutton();
		      htlp.Search();
		      htlp.Ooty();
		      htlp.CheckinDate();
		//     htlp.CheckinArrow();
		      Thread.sleep(2000);
		      htlp.Activedate();
		      Thread.sleep(2000);
		      htlp.outactivedate();
		      Thread.sleep(2000);
		      htlp.guestsandRooms();
		      htlp.Adults();
		      Thread.sleep(1000);
		      htlp.Done();
		      htlp.SearchHotels();
		      Thread.sleep(1000);
		      sp.FirstHotel();
		      sp.name();
		      sp.name();
		      Thread.sleep(3000);
		      sp.viewRoomOptions();
		      Thread.sleep(5000);
		      sp.Location();
		      Thread.sleep(5000);
		      sp.guestreviews();
		      Thread.sleep(5000);
		      sp.questionanswers();
		      Thread.sleep(2000);
		      sp.hotelpolicies();
		      Thread.sleep(3000);
		      sp.roomoptions();
		      Thread.sleep(2000);
		      sp.img();
		      Thread.sleep(3000);
			  TakesScreenshot ts=(TakesScreenshot)driver;
			  File source=ts.getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(source, new File("./ScreenShots/Screen.png"));
			  System.out.println("The ScreenShot is Taken");
			  Thread.sleep(5000);
		}
		catch(Exception e)
		{
		
		}
	}

	@Test()
	public void Tc_04_searchhotel()
	{
		hp=new Homepage(driver);
		htlp=new Hotelspage(driver);
		sp= new SearchPage(driver);
		try
		{
			 hp.Hotels();
		     htlp.Hotels();
		     htlp.radiobutton();
		     htlp.Search();
		     htlp.Ooty();
		     htlp.CheckinDate();
		     htlp.CheckinArrow();
		     Thread.sleep(2000);
		     htlp.Activedate();
		     Thread.sleep(2000);
		     htlp.outactivedate();
		     Thread.sleep(2000);
		     htlp.guestsandRooms();
		     htlp.Adults();
		     Thread.sleep(1000);
		     htlp.Done();
		     htlp.SearchHotels();
		     Thread.sleep(3000);
		     sp.payAtHotel();
		     Thread.sleep(2000);
		     sp.PriceRange();
		     Thread.sleep(2000);
			 sp.CustomerRatings();
			 Thread.sleep(3000);
		     sp.VerifyFilters();
		     Thread.sleep(3000);
		    /* TakesScreenshot ts1=(TakesScreenshot)driver;
		     File source=ts1.getScreenshotAs(OutputType.FILE);
		     FileUtils.copyFile(source, new File("./ScreenShots/Screen.png"));
		     System.out.println("The ScreenShot is Taken");
		     Thread.sleep(3000);*/
		}
		catch(Exception e)
		{
			
		}
	}
}

