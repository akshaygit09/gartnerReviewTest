package com.qa.gartner.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.gartner.base.BasePage;
import com.qa.gartner.pages.ReviewPage;

public class ReviewPageTest {
	BasePage basePage ;
	WebDriver driver ;
	ReviewPage reviewPage ;
	Properties prop ;
	
	@BeforeMethod
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.intialisation(prop);
		reviewPage = new ReviewPage(driver);
		
	}
	
	
	@Test(priority=1,  description="review page title test")
	public void loginPageTitleTest() {
		String title = reviewPage.getReviewPageTitle();
		Assert.assertEquals(title, "Review");
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown() {
		basePage.quitBrowser();
	}
	

}
