package com.practice.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodConcept {
	@BeforeMethod()
	public void userCreation() {
		System.out.println("Before Method");
	}

	
	 /** BM Approach
	  * 
	  *    *    Before Method
                   Test 1
                After Method
                
                Before Method
                  Test 2
                After Method
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

	@AfterMethod()
	public void deleteUser() {
		System.out.println("After Method");
	}
}

