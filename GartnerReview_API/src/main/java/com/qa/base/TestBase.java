package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	  public Properties prop;

	   public TestBase(){
	        prop = new Properties();
	       try {
	           FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"com/qa/config/config.properties");
	           prop.load(ip);
	       } catch (FileNotFoundException e) {
	           e.printStackTrace();
	       } catch (IOException e) {
	           e.printStackTrace();
	       }
	   }

}
