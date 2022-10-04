package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static ElementUtil elUtil;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://makemysushi.com/404?");

		elUtil = new ElementUtil(driver);

		By links = By.tagName("a");

//		elUtil.printAllHrefWithCount(links);
		elUtil.printAnonymousLinksWithCount(links);

		driver.quit();

	}

	

}
