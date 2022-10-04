package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By email = By.id("input-email1");

		customWait(email, 5).sendKeys("Arun");

	}

	public static WebElement customWait(By locator, int timeout) {
		WebElement el = null;
		int attempt = 0;

		while (attempt < timeout * 2) {
			try {
				el = driver.findElement(locator);
				break;
			} catch (NoSuchElementException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {

				}
			}

			attempt++;
		}

		if (el == null) {
			System.out.println(
					"Element is not found in " + timeout + " seconds " + "with attempts of " + attempt + " times.");

		}

		return el;
	}

}
