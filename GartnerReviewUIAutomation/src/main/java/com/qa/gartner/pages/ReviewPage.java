package com.qa.gartner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.gartner.base.BasePage;
import com.qa.gartner.util.Constants;
import com.qa.gartner.util.ElementsUtil;

public class ReviewPage extends BasePage {
	WebDriver driver ;
	ElementsUtil elementsUtil ;
	
	By reviewText = By.xpath("//div[@class='table_header' and contains(text(),'Review Text')]");
	By reviewRating = By.xpath("//div[@class='table_header' and contains(text(),'Review Rating')]");
	By reviewLanguage = By.xpath("//div[@class='table_header' and contains(text(),'Review Language')]");
	By duplicateCheck = By.xpath("//div[@class='table_header' and contains(text(),'Is a Duplicate')]");

	//Constructor of pageClass
	
	public ReviewPage(WebDriver driver) {
		this.driver = driver ;
		elementsUtil = new ElementsUtil(driver);
	}
	
	//pageActions
	
	/** 
	 *  Method created to get Page Title
	 * @return Page Title
	 */
	public String getReviewPageTitle() {
		return elementsUtil.waitForPageTitle(Constants.REVIEW_PAGE_TITLE);
	}
	public void fetchText() {
		elementsUtil.dogetText(reviewText);
		elementsUtil.dogetText(reviewRating);
		elementsUtil.dogetText(reviewLanguage);
		elementsUtil.dogetText(duplicateCheck);

			}
	

}
