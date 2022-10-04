package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yatra {

	public static WebDriver driver;

	private By departFrom = By.id("BE_flight_origin_city");
	private By goingTo = By.id("BE_flight_arrival_city");
	private static By agree = By.xpath("//button[text() = 'Ok,I Agree']");
	private By originFirstOption = By.xpath("//div[@class = 'ac_results origin_ac']/ul//li[1]");
	private By destinationFirstOption = By.xpath("//div[@class = 'ac_results dest_ac']/ul//li[1]");
	private By originDate = By.id("BE_flight_origin_date");

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.yatra.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(agree).click();

		Yatra yatra = new Yatra();
    	yatra.searchOnewayFlight("Bhubaneswar", "goa");

	}

	public void searchOnewayFlight(String departFrom, String goingTo) throws InterruptedException {

		driver.findElement(this.departFrom).click();
		Thread.sleep(2000);

		driver.findElement(this.departFrom).sendKeys(departFrom);
		Thread.sleep(2000);

		driver.findElement(originFirstOption).click();
		Thread.sleep(2000);

		driver.findElement(this.goingTo).sendKeys(goingTo);
		Thread.sleep(2000);

		driver.findElement(destinationFirstOption).click();
		Thread.sleep(2000);

		driver.findElement(originDate).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.id("27/08/2022")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//a[@title = 'Non Stop Flights']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("BE_flight_flsearch_btn")).click();
	    Thread.sleep(1000);

	}
	
	

}
