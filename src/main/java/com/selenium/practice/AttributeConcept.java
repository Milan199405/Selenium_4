package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		ElementUtil elUtil = new ElementUtil(driver);
        By imgLocator = By.xpath("(//img[@class = 'landscape-image'])[13]");
        String attrVal = elUtil.getAttributeValue(imgLocator, "alt");
        System.out.println(attrVal);
        
        driver.quit();
	}

	/*
	 * public static WebElement getElement(By locator) { return
	 * driver.findElement(locator); }
	 * 
	 * public static String getAttributeValue(By locator, String attrName) { return
	 * getElement(locator).getAttribute(attrName); }
	 */
}
