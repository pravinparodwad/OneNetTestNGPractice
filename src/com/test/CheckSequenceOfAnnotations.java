package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckSequenceOfAnnotations {
	
	@AfterSuite
	public void aftersuiteTest() {
		System.out.println("After suite method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method method");
	}
	@Test
	public void actualTest() {
		System.out.println("Actual test method");
	}
	
	@BeforeSuite
	public void suiteTest() {
		System.out.println("Before suite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method method");
	}
}
