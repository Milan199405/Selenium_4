package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;
	static ElementUtil elUtil;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elUtil = new ElementUtil(driver);
		driver.get("https://www.spicejet.com/");

		By elementLocator = By.xpath("//div[text() = 'Add-ons']");
		moveToElement(elementLocator);
	}

	public static void moveToElement(By locator) {
		Actions action = new Actions(driver);
		WebElement targetElement = elUtil.getElement(locator);
		action.moveToElement(targetElement).build().perform();
	}
}
