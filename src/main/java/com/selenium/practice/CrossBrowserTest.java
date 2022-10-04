package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	static String browser = "chrome";
    static WebDriver driver;
	public static void main(String[] args) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://google.co.in");
			return;
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://amazon.in");
			return;
		} else {
			System.out.println("Wrong browser name..");
		}
	}
}
