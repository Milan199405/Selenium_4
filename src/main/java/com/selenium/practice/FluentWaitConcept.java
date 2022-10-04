package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By email = By.id("input-email");
		By password = By.id("input-password");

		Wait<WebDriver> wait_1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(500));

		WebElement el_1 = wait_1.until(ExpectedConditions.visibilityOfElementLocated(email));
		el_1.sendKeys("Milan Kumar");

		WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait_2.pollingEvery(Duration.ofMillis(500));
		wait_2.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("sam@123");

	}
}
