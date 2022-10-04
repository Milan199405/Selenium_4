package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementToBeClickable {
	
	private static By button = By.xpath("(//button[@type = 'button'])[position() = 4]");

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		Boolean flag = wait.until(ExpectedConditions.urlToBe("https://naveenautomationlabs.com/opencart/index.php?route=product/search"));
		if(flag) {
			System.out.println("Clicked......");
		}

	}

}
