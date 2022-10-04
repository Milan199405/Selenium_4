package com.practice.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestConcept {
	@BeforeTest()
	public void userCreation() {
		System.out.println("Before Test");
	}

	/**
	 * BT Approach
	 * 
	 * Before Test 
	 * 
	 *            Test 1 
	 *            Test 2 
	 *            
	 * After Test
	 * 
	 */

	@Test()
	public void titleTest() {
		System.out.println("Test 1");
	}

	@Test()
	public void urlTest() {
		System.out.println("Test 2");
	}

	@AfterTest()
	public void deleteUser() {
		System.out.println("After Class");
	}
}
