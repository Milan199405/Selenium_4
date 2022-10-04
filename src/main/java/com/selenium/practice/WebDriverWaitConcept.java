package com.selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By username = By.id("input-emaill");
//        By password = By.id("input-password");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement usernameEL = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		usernameEL.sendKeys("abc@gmail.com");

		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeysWithWait(username, 5, "abc@gmail.com", 500);

	}

	public static void doSendKeys(By locator, long timeout, String val) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(val);

	}

	public static void doClick(By locator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
	}

	public static void doSendKeys(By locator, long timeout, String val, long intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(intervalTime));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(val);
	}

	public static WebElement getElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static List<WebElement> getElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

}
