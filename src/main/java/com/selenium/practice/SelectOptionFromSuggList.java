package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionFromSuggList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		By searchField = By.id("search_query_top");
		driver.findElement(searchField).sendKeys("Dress");
		Thread.sleep(3000);

		List<WebElement> searchResultList = driver.findElements(By.xpath("//div[@class = 'ac_results']//li"));

		for (WebElement e : searchResultList) {
			String text = e.getText();
			if (text.equals("Summer Dresses > Printed Chiffon Dress")) {
				e.click();
				break;
			}
		}

		WebElement clickedElement = driver.findElement(By.xpath("//h1[@itemprop='name']"));
		String text = clickedElement.getText();
		if (text.equals("Printed Chiffon Dress")) {
			System.out.println("Test pass...");
		}

		driver.quit();
	}

}
