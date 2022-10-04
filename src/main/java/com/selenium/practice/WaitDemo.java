package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait1.pollingEvery(null);
		 wait1.ignoring(null);
		 wait1.withMessage("");
		 
		 wait1.until(null);
		
		
		  FluentWait<WebDriver> wait2 = new  FluentWait<WebDriver>(driver);
		  wait2.withTimeout(null);
		  wait2.pollingEvery(null);
		  wait2.ignoring(null);
		  wait2.withMessage("");
		  
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(null));
		 
//		Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2))
//				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class)
//				.withMessage("No Element Found.. ");
//
//		wait3.until(ExpectedConditions.visibilityOfElementLocated(null));
		  
		 Wait<WebDriver> wait4 = new WebDriverWait(driver, Duration.ofSeconds(5))
				                     .withTimeout(null)
				                     .pollingEvery(null)
				                     .ignoring(null)
				                     .withMessage("");
			 
         wait4.until(null);
	}

}
