package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");

		String title = brUtil.getPageTitle();
		System.out.println(title);

		String pageUrl = brUtil.getPageUrl();
		System.out.println(pageUrl);

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");

		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(firstname, "Ram");
		elUtil.doSendKeys(lastname, "Krishna");
		elUtil.doSendKeys(email, "ramKrishna@gmail.com");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
	}
}
