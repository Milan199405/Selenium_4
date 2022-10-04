package com.practice.test;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void demoTest_1() {
//		String s = null;
		int i = 9 / 0;
//		System.out.println(s.charAt(0));
		System.out.println("Result - " + i);
		
	}
}
