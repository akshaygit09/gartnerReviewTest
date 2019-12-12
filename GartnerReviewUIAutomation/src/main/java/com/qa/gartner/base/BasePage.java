package com.qa.gartner.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Akshay Bhatia
 *
 */
public class BasePage {
	public static WebDriver driver ;
	public Properties prop ;
	/**
	 * 
	 * @return this method return webdriver instance
	 * @throws InterruptedException 
	 */
	public WebDriver intialisation(Properties prop) {		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		return driver ;
			
	}
	/**
	 * This method is used to define the properties
	 * @return properties prop reference 
	 */
	public Properties initialize_properties() {
		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "/src/main/java/com/qa/gartner/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return prop ;	
	}
	
	public void quitBrowser() {
		try {
		driver.quit();
		}
		catch (Exception e) {
			System.out.println("some exception occured while quitting browser");

		}
	}
	public void closeBrowser() {
		try {
			driver.close();}
			catch (Exception e) {
				System.out.println("some exception occured while closing browser");

			}	
		}
	
	}
