package com.test;

import org.testng.annotations.AfterSuite;

public class CleanupClass {
	/*
	 * 
	 * @AfterSuite public void cleanUp() {
	 * System.out.println("Cleanup and Teardown"); }
	 */

	/*
	 * public static void main (String args[]) throws Exception { try { assert
	 * false; System.out.println("t "); }catch(Error e) { System.out.println("C ");
	 * throw new Exception(); }finally { System.out.println("F "); } }
	 */

	public static void main (String args[]) {
		/*
		 * String s = "I am Pravin"; StringBuilder sb = new StringBuilder(s);
		 * System.out.println(sb.reverse());
		 *
		 *
		 */

		String s = "Let's meet l8r 2nite?";

		System.out.println(replacePureWord(s));
		//s = s.replaceAll("/^[a-z]+$/", "*");
		//System.out.println(s);


	}
	public static String replacePureWord(String test) {
		int len=test.length();

		StringBuilder outputString = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if(!(Character.isLetter(test.charAt(i)))) {
				outputString.append("*");
				outputString.append(test.charAt(i));
			}
		}
		return outputString.toString();
	}
}
