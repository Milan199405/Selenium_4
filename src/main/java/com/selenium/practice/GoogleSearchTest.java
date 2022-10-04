package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		By searchField = By.name("q");
		driver.findElement(searchField).sendKeys("Sachin tendulkar");
		Thread.sleep(2000);

		List<WebElement> searchList = driver
				.findElements(By.xpath("//ul[@role = 'listbox']/li//div[@class = 'wM6W7d']/span"));
		for (WebElement e : searchList) {
			String text = e.getText();
			if (text.equals("sachin tendulkar stats")) {
				e.click();
				break;
			}
		}

		driver.quit();
	}

}
