package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.amazon.com/");

		ElementUtil elUtil = new ElementUtil(driver);
		By listItem = By.xpath("//div[@class='navFooterLinkCol navAccessibility']//li");
		List<WebElement> items = elUtil.getElements(listItem);
		System.out.println(items.size());
		for (WebElement e : items) {
			System.out.println(e.getText());
		}

		driver.quit();
	}

	/*
	 * public static List<WebElement> getElements(By locator) { return
	 * driver.findElements(locator); }
	 */
}
