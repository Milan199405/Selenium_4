package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessAndIncognito {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
//       co.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
