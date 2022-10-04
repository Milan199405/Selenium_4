package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValueWithoutUsingSelectClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		By countryDropdownLocator = By.xpath("//select[@id = 'Form_submitForm_Country']/option");

		List<WebElement> countryList = driver.findElements(countryDropdownLocator);
		for (WebElement e : countryList) {
			String text = e.getText();
			if (text.equals("India")) {
				e.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
