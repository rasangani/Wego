package com.goquo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goquo.qa.base.TestBase;
import com.goquo.qa.pages.HomePage;
import com.goquo.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;


	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();

	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "Home | Hotels Platform","Home page title is matched");
	}
	
	@Test(priority=2)
	public void searchterm(){
		homePage.searchterm();
		homePage.calenderclick();
		homePage.paxsearch();
	}
	
	
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}
	
	

}
