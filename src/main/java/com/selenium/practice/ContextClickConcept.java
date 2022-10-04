package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {
	static WebDriver driver;
	static ElementUtil elUtil;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elUtil = new ElementUtil(driver);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		By rightClickMe = By.xpath("//span[text() = 'right click me']");
		contextClick(rightClickMe);
	}

	public static void contextClick(By locator) {
		Actions action = new Actions(driver);
		WebElement element = elUtil.getElement(locator);
		action.contextClick(element).build().perform();;
	}
}
