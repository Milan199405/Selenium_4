package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	private WebDriver driver;

	/**
	 * This method is used for launch the browser.
	 * 
	 * @param browser
	 */
	public WebDriver launchBrowser(String browser) {
		driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Servers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Servers\\geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;

		} else {
			System.out.println("Wrong browser name..");
		}

		return driver;
	}

	public void launchUrl(String url) {
		if (url.contains("http")) {
			driver.get(url);
			return;
		} else {
			System.out.println("Please provide correct url with protocol (http or https).");
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
