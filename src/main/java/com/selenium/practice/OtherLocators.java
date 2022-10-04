package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherLocators {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		ElementUtil elUtil = new ElementUtil(driver);
		
//		brUtil.launchUrl("https://classic.crmpro.com/index.html");
//		brUtil.launchUrl("https://www.freshworks.com/");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");

		// 1) By id

		// 2) By name
		/*
		 * By username = By.name("username"); elUtil.doSendKeys(username, "Rahul");
		 */

		// 3) By className
		/*
		 * By username = By.className("form-control");
		 * elUtil.doSendKeys(username,"Rahul");
		 */

		// 4) By tagName
		/*
		 * By username = By.tagName("h1"); String text = elUtil.doGetText(username);
		 * System.out.println(text);
		 */

		// 5) By linkText
		/*
		 * By link = By.linkText("Freshteam"); elUtil.doClick(link);
		 */

		// 6) By partialLinkText

		/*
		 * By link = By.partialLinkText("New");
		 * elUtil.doClick(link);
		 */
		
		// 7) By XPATH
		
		By firstname = By.xpath("//input[@id = 'input-firstname']");
		elUtil.doSendKeys(firstname, "Milan");
		
		// 8) By CSS Selector
		
		By lastname = By.cssSelector("#input-lastname");
		elUtil.doSendKeys(lastname, "Kumar");

		Thread.sleep(3000);
		driver.quit();
	}

}
