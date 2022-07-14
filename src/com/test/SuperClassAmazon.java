package com.test;

import org.testng.annotations.BeforeTest;

public class SuperClassAmazon {

	@BeforeTest
	public void setup() {
		System.out.println("Amazon SuperClass setup method calls...");
	}
}
