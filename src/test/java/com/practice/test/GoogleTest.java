package com.practice.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test()
	public void urlTest() {

		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("www.google.com"));
	}

	// enabled = false
	@Test()
	public void titleTest() {

		String url = driver.getTitle();
		Assert.assertTrue(url.contains("Google"));
	}
}
