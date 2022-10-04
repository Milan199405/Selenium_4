package com.practice.test;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void loginTest() {
		int a = 9/0;
		System.out.println("Login Test..." + a);
	}
	
	@Test(dependsOnMethods = {"loginTest"})
	public void registrationTest() {
		System.out.println("Registration Test...");
	}
}
