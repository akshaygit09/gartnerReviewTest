package com.qa.gartner.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.gartner.base.BasePage;

public class ElementsUtil extends BasePage{
	
	WebDriver driver ;
	
	public ElementsUtil(WebDriver driver) {
		this.driver = driver ;
	}
	
	public WebElement getElement(By locator) {
		WebElement element = null;
	
		try {
		element = driver.findElement(locator);
		}
		catch(Exception e) {
			System.out.println("some exception occured while creating WebElement" + locator);
	}
		return element ;
	}
		

	
	public String dogetText(By locator ) {
		String text = null ;
		try {
			text = getElement(locator).getText();
			}catch(Exception e) {
			System.out.println("some exception occured while getting text" + locator);
			}
		return text ;
	}
	
	public String waitForPageTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		}
	
	
	
}
