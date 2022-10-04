package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForNonWebElement {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("http://londonfreelance.org/courses/frames/index.html");

//		By register = By.xpath("//div[@class = 'list-group']/a[text()='Register']");
//		By signIn = By.xpath("//div[@class = 'cell']/input[@type = 'submit']");
		By header = By.xpath("//h1[text() = 'Example home page ' ]");
		ElementUtil elUtil = new ElementUtil(driver);

		switchToFrameWithWaitByNameOrId(5, "content");
		
//
//		driver.switchTo().frame("content");

		String text = elUtil.doGetText(header);
		System.out.println(text);

//		try {
//			Alert alert = switchToAlertWithWait(5);
//			String alertText = alert.getText();
//			if (alertText.equals("Please enter a valid user name")) {
//				System.out.println("Test Pass..");
//			} else {
//				System.out.println("Test Fail..");
//			}
//
//		} catch (TimeoutException e) {
//			System.out.println("Alert is not found in this current page..");
//		}

		driver.quit();
	}

	/**
	 * Wait For URL
	 **/
	public static Boolean checkUrlFractionWithWait(int timeout, String urlContains) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(urlContains));
	}

	public static Boolean checkUrlToBeWithWait(int timeout, String url) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlToBe(url));
	}

	/**
	 * Wait For Title
	 **/
	public static Boolean checkTitleContainsWithWait(int timeout, String titleContains) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleContains(titleContains));
	}

	public static Boolean checkTitleIsWithWait(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.titleIs(title));
	}

	/**
	 * Wait For Alert
	 **/

	public static Alert switchToAlertWithWait(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * Wait For Frames
	 **/

	public static WebDriver switchToFrameWithWaitByNameOrId(long timeout, String nameOrId) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	}

}
