package com.practice.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	@Test
	public void titleTest() {
//		driver.get("https://www.amazon.in/");
		String url = driver.getTitle();
		Assert.assertTrue(url.contains("Online Shopping site in India:"));
	}
}
