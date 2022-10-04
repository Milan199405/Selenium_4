package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyWaitDemo {
	
	private static By btn = By.id("a");

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		WebElement btn1 =   driver.findElement(By.id("a"));
		WebElement btn2 =   driver.findElement(By.id("a"));
		WebElement btn3 =   driver.findElement(By.id("a"));
		WebElement btn4 =   driver.findElement(By.id("a"));
		
		
	//	Thread.sleep(10000);
		
   //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// part 1 provide time using Duration class
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // presenceOfElementLocated (Dom)
        
        // visibilityOfElementLocated (Dom + Page)
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click(); // part 2 - El + Action
        
        
        
        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
        		                    .withTimeout(Duration.ofSeconds(10));
        
        wait1.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();
		
	
		
		
		

	}

}
