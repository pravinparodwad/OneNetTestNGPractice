package com.test;

import org.testng.annotations.BeforeSuite;

public class SetupClass {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup the data for login");
	}

}
