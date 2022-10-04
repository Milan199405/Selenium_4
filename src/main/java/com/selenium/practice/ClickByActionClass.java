package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickByActionClass {
	static WebDriver driver;
	static ElementUtil elUtil;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elUtil = new ElementUtil(driver);
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By elLocator = By.xpath("(//a[text() = 'Register'])[2]");
        doClickByActionClass(elLocator);
	}

	public static void doClickByActionClass(By locator) {
         Actions action = new Actions(driver);
         WebElement targElement = elUtil.getElement(locator);
         
         // Case - 1
//         action.click(targElement).perform();
         
         // Case - 2
         action.moveToElement(targElement).click().build().perform();
	}
}
