package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.rediff.com/");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		driver.findElement(By.xpath("(//p[@id='signin_info']/a)[position() = 1]")).click();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("login1")).sendKeys("DEMO");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
