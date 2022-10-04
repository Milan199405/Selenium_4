package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWebTableHandle {
	static WebDriver driver;
	static ElementUtil elUtil;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/sri-lanka-in-india-2021-22-1278665/india-vs-sri-lanka-1st-test-1278682/full-scorecard");

		elUtil = new ElementUtil(driver);

		String bowlerName = getIndianBatterWicketTakerName("Mayank Agarwal");
        System.out.println(bowlerName);
		driver.quit();

	}

	public static String getIndianBatterWicketTakerName(String batterName) {

		By wicketTaker = By.xpath("//table[@class = 'table batsman']//a[text() = '" + batterName
				+ "']/parent::td/following-sibling::td/span");
		By scoreCard = By.xpath("//div[text() = 'Scorecard']");
		By indianInnings = By.xpath("//h5[text() = 'India 1st INNINGS ']");

		
		elUtil.doClick(scoreCard);
		elUtil.doClick(indianInnings);
	    return  elUtil.doGetText(wicketTaker);
		

	}

}
