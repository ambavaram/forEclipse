package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.goibibo.generic.Basepage;


public class SearchPage extends Basepage
{

	@FindBy(xpath="//div[@class='HotelCardstyles__OuterWrapperDiv-sc-1s80tyk-0 eXWmAQ']")
	private WebElement FirstHotel;
	
	@FindBy(xpath="//button[@class='Button-aqcosj-4 BookingWidgetstyles__ViewRoomOptionsButton-sc-1tsb1-12 dtPKBr']")
	  private WebElement viewRoomOptions;

	@FindBy(xpath="//button[@class='RoomFlavorstyles__ButtonWrapper-sc-1btnl3r-18 dKUmyJ']")
	private WebElement selectRoom;
	
	@FindBy(xpath="//select[@class='PersonalProfile__NameEnterSelect-sc-1r9ak8b-9 bOfOHT']")
	private  WebElement Title;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@placeholder='Enter Last Name']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@placeholder='Enter Email Address']")
	private WebElement EmailAddress;
	
	@FindBy(xpath="//input[@placeholder='Enter Phone Number']")
	private WebElement phonenumber;
	
	@FindBy(xpath="//button[@class='GuestDetailBlock__CustomButton-sc-6dnm3n-12 fKiqlm']")
	private WebElement proceedpaymentoptions;
	
	@FindBy(xpath="//input[@name='cardnumber']")
	private WebElement cardnumber;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement nameoncard;
	
	@FindBy(xpath="//input[@placeholder='MM / YY']")
	private WebElement ExpiryDate;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement cvvno;
	
	@FindBy(xpath="//div[@class='col-md-8 col-sm-8 col-xs-8']")
	private WebElement pay;
	
	@FindBy(xpath="//input[@class='normalsection inputMedium cr_crd_add']")
	private WebElement addressline;
	
	@FindBy(xpath="//input[@class='normalsection inputMedium cr_crd_zip']")
	private WebElement Zipcode;
	@FindBy(xpath="//input[@class='normalsection inputMedium cr_crd_city']")
	private WebElement City;
	@FindBy(xpath="//input[@class='normalsection inputMedium cr_crd_state']")
	private WebElement State;
	@FindBy(xpath="//select[@class='newsection cr_crd_country']")
	private WebElement Country;
	@FindBy(xpath="//input[@class='form-control inputMedium cr_crd_phone']")
	private WebElement Mobilenumber;
	@FindBy(xpath="//span[@class='HotelName__HotelNameText-sc-1bfbuq5-1 eqwGIS']")
	private WebElement name;
	@FindBy(xpath="//a[@href='#location']")
	private WebElement Location;
	@FindBy(xpath="//a[@ href='#guest-reviews']")
	private WebElement guestreviews;
	@FindBy(xpath="//a[@href='#QnA']")
	private WebElement questionanswers;
	@FindBy(xpath="//a[@href='#hotel-policies']")
	private WebElement hotelpolicies;
	@FindBy(xpath="//div[@class='Layouts__Column-sc-1yzlivq-1 Roomstyles__Column-sc-1ivl7fs-0 Roomstyles__RoomImageWrapper-sc-1ivl7fs-5 blVabg']")
	private WebElement img;
	@FindBy(xpath="//a[@href='#rooms']")
	private WebElement roomoptions;
	@FindBy(xpath="//span[contains(text(),'Pay At Hotel')]")
    private WebElement payAtHotel;
	@FindBy(xpath="//span[contains(text(),'6000')]")
	private WebElement  PriceRange;
	@FindBy(xpath="//div[@class='Filtersstyles__AverageReviewWrapper-bkjigy-3 ilybwq']")
	private WebElement CustomerRatings;
	@FindBy(xpath="//div[@class='Filtersstyles__AppliedFiltersWrapperDiv-bkjigy-10 jfzibo']")
	private WebElement VerifyFilters;
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void FirstHotel()
	{
		try
		{
		verifyElementpresent(FirstHotel);
		Thread.sleep(2000);
		FirstHotel.click();
		log.info("First hotel from search selected");
	
		}
		catch (Exception e)
		{
			log.error("First hotel selection failed");
		}
	
	}
	 
	
	public void viewRoomOptions()
	{
		try
		{
		switchBrowser();
		verifyElementpresent(viewRoomOptions);
		viewRoomOptions.click();
		log.info("Room option clicked");
		}
		catch (Exception e)
		{
			log.error("Room option click failed");
		}
	}
	
	
	
	public void name()
	{try
	{
		switchBrowser();
		verifyElementpresent(name);
		name.getText();
		System.out.println(name.getText());
		log.info("the hotel name selected");
	}
	catch(Exception e)
	{
		log.error("name not selected");
	}
	}

	public void selectRoom()
	{
		try
		{
		verifyElementpresent(selectRoom);
		selectRoom.click();
		log.info("Room selected");
		}
		catch (Exception e)
		{
			log.error("Room selection failed");
		}
	}
	public void Title()
	{
		try
	{
		verifyElementpresent(Title);
		Title.click();
		Thread.sleep(2000);
		Select title=new Select(Title);
	     title.selectByIndex(1);	
	     Title.click();
		log.info("title slected ");
		
	}
catch(Exception e)
{
	log.error("title selected failed ");
}
}
	public void Firstname()
	{
		verifyElementpresent(Firstname);
		Firstname.sendKeys("mahalakshmi");		  
	}
	    public void Lastname()
	    {
	    	verifyElementpresent(Lastname);
	    	Lastname.sendKeys("peddisetti");
	   	
	    }
	   
	    public void EmailAddress()
	    {
	    	verifyElementpresent(EmailAddress);
	    	EmailAddress.sendKeys("mahalakshmi.peddisetti@gmail.com");    	
	      }
	    
	    public void phonenumber()
	    {
	    	verifyElementpresent(phonenumber);
	    	phonenumber.sendKeys("8008503723"); 	
	    }
	    
public void proceedpaymentoptions()
{
	verifyElementpresent(proceedpaymentoptions);
	proceedpaymentoptions.click();
}
public void cardnumber()
{
	verifyElementpresent(cardnumber);
	cardnumber.sendKeys("4012888888881881");
}

public void nameoncard()
{
	verifyElementpresent(nameoncard);
	nameoncard.sendKeys("mahalakshmi");
}
public void ExpiryDate()
{
	verifyElementpresent(ExpiryDate);
	ExpiryDate.sendKeys("09/22");
}
public void cvvno()
{
	try
	{
		verifyElementpresent(cvvno);
		cvvno.sendKeys("987");
		log.info("CVV number accepted");
	}
	catch(Exception e)
	{
		log.error("CVV failed");
	}
}
public void pay()
{
	try
	{
		verifyElementpresent(pay);
		pay.click();
		log.info("Pay button clicked");
	}
	catch(Exception e)
	{
		log.error("Pay button click failed");
	}
}
public void addressline()
{
	verifyElementpresent(addressline);
	 addressline.sendKeys("prakashnagar");
}
public void Zipcode()
{
	verifyElementpresent(Zipcode);
	Zipcode.sendKeys("522601");
}
public void City()
{
	verifyElementpresent(City);
	City.sendKeys("narasaraopet");	
}
public void State()
{
	verifyElementpresent(State);
	State.sendKeys("andhrapradesh");	
}
public void Country() 
{
	try
{
	verifyElementpresent(Country);
	Country.click();
	Select country=new Select(Country);
    country.selectByValue("India");	
    Country.click();
    log.info("country selected");
}
catch(Exception e)
{
	log.error("country not selected");
}
}
public void Mobilenumber()
{
	verifyElementpresent(Mobilenumber);
	Mobilenumber.sendKeys("8008503723");	
}
public void Location()
{  
	verifyElementpresent(Location);
	Location.click();
	System.out.println("location is displayed");
}
public void guestreviews()
{
	verifyElementpresent(guestreviews);
	guestreviews.click();
	System.out.println("guestreviews displayed");	
}
public void questionanswers()
{
	verifyElementpresent(questionanswers);
	questionanswers.click();
	System.out.println("questions and answers displayed");
}
public void hotelpolicies()
{
	verifyElementpresent(hotelpolicies);
	hotelpolicies.click();
	System.out.println("hotel policies displayed");
}
public void roomoptions()
{ try
{
	verifyElementpresent(roomoptions);
	roomoptions.click();
	log.info("roomoptiond displayed");
}
catch(Exception e)
{
	log.error("room options not clicked");
}
}
public void img()
{
	verifyElementpresent(img);
	img.click();
}
public void payAtHotel()
{
	try
		{
			verifyElementpresent(payAtHotel);
			mouseover(payAtHotel);
			payAtHotel.click();
			log.info("payhotel filter selected");
		}
	catch(Exception e)
		{
			log.error("payhotel filter selection failed");
		}
}	
public void  PriceRange()
{
	try
	{
		verifyElementpresent( PriceRange);
		 PriceRange.click();
		 log.info("PriceRange filter is slected");
	}
	catch(Exception e)
	{
		log.error("PriceRange filter not selected");
	}
}

public void CustomerRatings()
{
	try
	{
		verifyElementpresent(CustomerRatings);
		CustomerRatings.click();
		log.info("Customer Ratings Filter is selected");
	}
	catch (Exception e)
	{
		log.error("Customer Ratings Filter failed");
	}
}
public void VerifyFilters() 
{
	try
	{
		verifyElementpresent(VerifyFilters);
		VerifyFilters.getText();
		System.out.println(VerifyFilters.getText());
		log.info("Verify Filter is success");
	}
	catch  (Exception e)
	{
		log.error("Verify Filter Failed");
	}
}
}
	    
	    
	    
	    
	    
	    
	    
	

	
	

