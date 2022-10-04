package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By username = By.id("input-email1");

		// Case - 1
//		driver.findElement(username).sendKeys("Milan");

		// Case - 2
		List<WebElement> fields = driver.findElements(username);
		for (WebElement e : fields) {
			e.sendKeys("Milan");
		}
		System.out.println(fields.size());
		Thread.sleep(3000);
		driver.quit();
	}

}
