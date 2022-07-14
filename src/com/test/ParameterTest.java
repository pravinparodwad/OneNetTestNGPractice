package com.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Parameters("myBrowser")
	@Test
	public void checkBrowser(String myBrowser) {
		if(myBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Initialize chrome driver...");
		}
		else {
			System.out.println("initialize INternet Explorer driver...");
			Assert.assertTrue(true);
		}
	}

}
