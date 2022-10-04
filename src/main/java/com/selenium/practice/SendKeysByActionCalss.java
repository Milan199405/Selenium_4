package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysByActionCalss {
	static WebDriver driver;
	static ElementUtil elUtil;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elUtil = new ElementUtil(driver);
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By email = By.name("email");
        dosendKeysByActionClass(email, "abc123@gmail.com");
	}

	public static void dosendKeysByActionClass(By locator, String value) {
          Actions actions = new Actions(driver);
          WebElement targetElement = elUtil.getElement(locator);
          
          // Case - 1
//          actions.sendKeys(targetElement, value).build().perform();
          
          // Case - 2
          actions.click(targetElement).sendKeys(value).build().perform();
	}
}
