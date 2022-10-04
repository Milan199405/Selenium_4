package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImagesUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.amazon.com/");

		ElementUtil elUtil = new ElementUtil(driver);

		By imgLocator = By.tagName("img");
		int count = elUtil.getElementsCount(imgLocator);
		System.out.println("Total img available in the webpage => " + count);
		elUtil.printElementsText(elUtil.getAttributeValues(imgLocator, "alt"));

		driver.quit();
	}

	/*
	 * public static List<WebElement> getElements(By locator) { return
	 * driver.findElements(locator); }
	 * 
	 * public static int imgCount(By locator) { return getElements(locator).size();
	 * }
	 * 
	 * public static List<String> getAttributeList(By locator, String attrName) {
	 * List<String> actualAttrList = new ArrayList<String>(); List<WebElement>
	 * elements = getElements(locator); for (WebElement e : elements) {
	 * actualAttrList.add(e.getAttribute(attrName)); } return actualAttrList; }
	 */

}
