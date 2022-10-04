package com.practice.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestngAnnotations {

	@BeforeSuite()
	public void databaseConnection() {
		System.out.println("Before Suite");
	}

	@BeforeTest()
	public void userCreation() {
		System.out.println("Before Test");
	}

	@BeforeClass()
	public void launchBrowser() {
		System.out.println("Before Class");
	}

	@BeforeMethod()
	public void userLogin() {
		System.out.println("Before Method");
	}
	
	/*
	 * Before Suite
       Before Test
       Before Class
       
                       Before Method
                           Test 1
                        After Method
                        
                       Before Method
                           Test 2
                        After Method
                        
       After Class
       After Test
       After Suite
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
	public void userLogout() {
		System.out.println("After Method");
	}

	@AfterClass()
	public void closeBrowser() {
		System.out.println("After Class");
	}

	@AfterTest()
	public void deleteUser() {
		System.out.println("After Test");
	}

	@AfterSuite()
	public void discoonectDatabase() {
		System.out.println("After Suite");
	}
}
