package com.practice.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {
	@Test
	public void elementVisibilityTest() {
//		driver.get("https://www.orangehrm.com/");
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());

	}
}
