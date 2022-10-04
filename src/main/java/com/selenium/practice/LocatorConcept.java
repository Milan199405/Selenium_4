package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// 1) Simple Strategy

		/*
		 * driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("test@12345");
		 */

		// 2) WebElement Strategy

		/*
		 * WebElement email = driver.findElement(By.id("input-email")); WebElement
		 * password = driver.findElement(By.id("input-password"));
		 * email.sendKeys("test@gmail.com"); password.sendKeys("test@12345");
		 */

		// 3) By Locator Strategy

		/*
		 * By email = By.id("input-email"); By password = By.id("input-password");
		 * driver.findElement(email).sendKeys("test@gmail.com");
		 * driver.findElement(password).sendKeys("test@12345");
		 */

		// 4) By Locator With Wrapper Method Strategy - 1

		/*
		 * By email = By.id("input-email"); By password = By.id("input-password");
		 * getElement(email).sendKeys("test@gmail.com");
		 * getElement(password).sendKeys("test@12345");
		 */

		// 5) By Locator With Wrapper Method Strategy - 2

		/*
		 * By email = By.id("input-email"); By password = By.id("input-password");
		 * doSendKeys(email, "test@gmail.com"); doSendKeys(password, "test@12345");
		 */

		// 6) String Locator With Wrapper Method Strategy

		/*
		 * String email = "input-email"; String password = "input-password";
		 * doSendKeys(email,"test@gmail.com"); doSendKeys(password, "test@12345");
		 */

		// 7) Create A Utility Class For All The Wrapper Methods.

		String email = "input-email";
		String password = "input-password";

		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys("id", email, "test@gmail.com");
		elUtil.doSendKeys("id", password, "test@12345");

		driver.quit();
	}

	/*
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); }
	 * 
	 * public static void doSendKeys(By locator, String keys) {
	 * getElement(locator).sendKeys(keys); }
	 */

}
