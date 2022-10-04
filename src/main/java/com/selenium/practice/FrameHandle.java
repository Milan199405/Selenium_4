package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://londonfreelance.org/courses/frames/index.html");

		driver.switchTo().frame("main");
//		driver.switchTo().frame(2);
//		driver.switchTo().frame(driver.findElement(By.name("main")));

		WebElement header = driver.findElement(By.tagName("h2"));
		
//		driver.switchTo().defaultContent();
		
		System.out.println(header.getText());
        System.out.println(driver.getTitle());

		driver.quit();

	}

}
