package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		// driver.close();
		driver.quit();
		System.out.println("Hello Selenium");
		driver.getCurrentUrl();
	}

}
