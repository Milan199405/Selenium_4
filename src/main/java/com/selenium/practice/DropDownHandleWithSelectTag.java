package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		By countryDropdownLocator = By.id("Form_submitForm_Country");
//		WebElement countryDropdownElement = getElement(countryDropdownLocator);

//		Select select = new Select(countryDropdownElement);
//		select.selectByIndex(1);
//		select.selectByVisibleText("India");
//		select.selectByValue("India");
		
		doSelectByIndex(countryDropdownLocator, 1);
		doSelectByVisibleText(countryDropdownLocator, "India");
		doSelectByValue(countryDropdownLocator, "Bahrain");
		

		Thread.sleep(2000);
		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		WebElement element = getElement(locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void doSelectByVisibleText(By locator, String visibleText) {
		WebElement element = getElement(locator);
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectByValue(By locator, String attrValue) {
		WebElement element = getElement(locator);
		Select select = new Select(element);
		select.selectByValue(attrValue);
	}
}
