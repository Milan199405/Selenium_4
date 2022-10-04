package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropAction {

	static WebDriver driver;
	static ElementUtil elUtil;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elUtil = new ElementUtil(driver);
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		By sourceElement = By.id("draggable");
		By targetElement = By.id("droppable");
		dragAndDrop(sourceElement, targetElement);

	}

	public static void dragAndDrop(By sourceLocator, By targetLocator) {
		Actions action = new Actions(driver);
		WebElement sourceElement = elUtil.getElement(sourceLocator);
		WebElement targetElement = elUtil.getElement(targetLocator);

		// Case - 1
//       action.dragAndDrop(sourceElement, targetElement).build().perform();

		// Case - 2
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
	}
}
