package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://whenwise.com/sign-in");

		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login-btn")).click();
		
	
		
		driver.navigate().to("https://whenwise.com/users/2835/edit");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.scrollPageDown("500");
		
		By baseEle_1 = By.xpath("//span[text() = 'Email on booking confirmation?']");
		By baseEle_2 = By.xpath("//span[text() = 'Accept SMS appointment reminder?']");
		
		driver.findElement(with(By.className("lever")).toRightOf(baseEle_1)).click();
		driver.findElement(with(By.className("lever")).toRightOf(baseEle_2)).click();
	}

}
