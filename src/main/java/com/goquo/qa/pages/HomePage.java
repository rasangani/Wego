package com.goquo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goquo.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//input[@placeholder='Enter a destination']")
	@CacheLookup
	WebElement search;
	@FindBy(xpath = "//li[@id='react-autowhatever-1--item-1']")
	WebElement selectsearch;
	@FindBy(xpath = "//input[@id='startDate']")
	WebElement calender;
	@FindBy(xpath = ".//*[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//table/tbody/tr[5]/td[3]")
	WebElement checkindate;
	@FindBy(xpath = ".//*[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//table/tbody/tr[5]/td[4]")
	WebElement checkoutdate;
	@FindBy(xpath = "//*[@id='__next']/div/div/section/h1/div[1]/div/div[2]/div/div[1]/div[2]/div")
	WebElement paxclick;
	@FindBy(xpath = "//div[@class='noselect Modal__AdjusterBtn-cncv5d-6 hefZHv']")
	WebElement roomclick;
	@FindBy(xpath = ".//*[@data-id='searchBtn']")
	WebElement searchbutton;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean searchbox(){
		return search.isDisplayed();
	}
	
	public void searchterm(){
		search.click();
		search.sendKeys("ku");
		selectsearch.click();	
		
	}
	
	public void calenderclick(){
		calender.click();
		checkindate.click();
		checkoutdate.click();	
		
	}
	public void paxsearch(){
		paxclick.click();
		roomclick.click();
		searchbutton.click();	
		
	}
	
	
	
	
	
	

}
