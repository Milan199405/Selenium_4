package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.co.in");
		driver.navigate().to("http://amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();

		String title = driver.getTitle();
		System.out.println(title);

		driver.navigate().refresh();
		driver.quit();
	}

}
