package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		By language = By.xpath("//div[@id = 'SIvCob']/a");

		List<WebElement> languageList = driver.findElements(language);
		for (WebElement e : languageList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("मराठी")) {
				e.click();
				break;
			}
		}
	}

}
