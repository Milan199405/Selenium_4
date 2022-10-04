package com.practice.test;

import org.testng.annotations.Test;

public class PriorityConcept {

	@Test
	public void demoTest_1() {
		System.out.println("Demo Test 1...");
	}

	@Test(priority = 0)
	public void demoTest_2() {
		System.out.println("Demo Test 2...");
	}

	@Test
	public void demoTest_3() {
		System.out.println("Demo Test 3...");
	}
}
