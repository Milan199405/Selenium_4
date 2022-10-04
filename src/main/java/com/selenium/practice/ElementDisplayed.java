package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/login");

		By email = By.id("input-email");
		ElementUtil elUtil = new ElementUtil(driver);
		Boolean flag = elUtil.isElementExist(email);
		if (flag) {
			System.out.println("Element is displayed...");
		}

		driver.quit();
	}

	/*
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); }
	 * 
	 * public static Boolean isElementExist(By locator) { return
	 * getElement(locator).isDisplayed(); }
	 */
}
