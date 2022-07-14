package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
	Properties prop;
	FileInputStream fis;
	File file;
	
	public ReadConfiguration() {
		file = new File(".\\configuration\\configuration.properties");
		prop = new Properties();
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getValueOfProperty(String propertyName) {
		String propertyValue = "";
		if(prop.containsKey(propertyName)) {
			propertyValue = prop.getProperty(propertyName);
		}
		
		return propertyValue;
	}
	
	
	public static void main(String args[]) {
		ReadConfiguration rc = new ReadConfiguration();
		System.out.println(rc.getValueOfProperty("URL"));
		System.out.println(rc.getValueOfProperty("username"));
		System.out.println(rc.getValueOfProperty("password"));
	}
}
