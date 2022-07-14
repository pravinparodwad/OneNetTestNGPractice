package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchFlipkart {
	  @Test
	  public void login() {
		  System.out.println("Flipkart login test...");
	  }
	  
	  @Test
	  public void searchItem() {
		  System.out.println("Flipkart search test...");
	  }
		
	  @BeforeClass
	  public void launchBrowser() {
	  System.out.println("Launch the browser and Login on Flipkart..."); }
	  
	  @AfterClass
	  public void closeBrowser() {
	  System.out.println("Logout of the application close browser on Flipkart...");
	  }
		 

}
