package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksTextUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.amazon.com/");

		ElementUtil elUtil = new ElementUtil(driver);
		By links = By.tagName("a");
		int count = elUtil.getElementsCount(links);
		System.out.println("Total visible links are => " + count);
		elUtil.printElementsText(elUtil.getElementsTextList(links));

		if(elUtil.getElementsTextList(links).contains("Interest-Based Ads")) {
			System.out.println("Test PASS");
		}
		
		driver.quit();
	}

	/*
	 * public static int getElementsCount(By locator) { return
	 * driver.findElements(locator).size(); }
	 * 
	 * public static List<String> getElementsTextList(By locator) { List<String>
	 * textList = new ArrayList<String>(); List<WebElement> elementList =
	 * driver.findElements(locator); for (WebElement e : elementList) { String text
	 * = e.getText(); if (!text.isEmpty()) { textList.add(e.getText()); }
	 * 
	 * } return textList; }
	 * 
	 * public static void printElementsText(List<String> list) { for (String s :
	 * list) { System.out.println(s); } }
	 */
}
