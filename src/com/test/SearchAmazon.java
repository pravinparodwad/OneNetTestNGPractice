package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchAmazon extends SuperClassAmazon{
  @Test
  public void login() {
	  System.out.println("Amazon login test...");
  }
  
  @Test
  public void searchItem() {
	  printAmazon();
	  System.out.println("Amazon search test...");
  }
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("Launch the browser and Login on Amazon...");
  }
  @AfterTest
  public void closeBrowser() {
	  System.out.println("Logout of the application and Close Browser on Amazon...");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Amazon after method call...");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Amazon before method call...");
  }

  public void printAmazon() {
	  System.out.println("Amazon print method with no annotation...");
  }

}
