package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// -> //table[@id='customers']//tr[1]/th[1]
		// -> //table[@id='customers']//tr[1]/th[2]
		// -> //table[@id='customers']//tr[1]/th[3]

		// -> //table[@id='customers']//tr[2]/td[1]
		// -> //table[@id='customers']//tr[2]/td[2]
		// -> //table[@id='customers']//tr[2]/td[2]

		// -> //table[@id='customers']//tr[3]/td[1]
		// -> //table[@id='customers']//tr[3]/td[2]
		// -> //table[@id='customers']//tr[3]/td[3]

		String xpathBefore = "//table[@id='customers']//tr[";
		String xpathAfterTh = "]/th[";
		String xpathAfterTd = "]/td[";
		
		int tableHeaderSize = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		int tableRowSize = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();


		for (int i = 1; i <= tableRowSize; i++) {
			for (int j = 1; j <= tableHeaderSize; j++) {
				if (i == 1) {
					String tableHeader = driver.findElement(By.xpath(xpathBefore + i + xpathAfterTh + j + "]"))
							.getText();
					System.out.print(tableHeader + "  ");
					continue;
				}

				String tableBody = driver.findElement(By.xpath(xpathBefore + i + xpathAfterTd + j + "]")).getText();
				System.out.print(tableBody + "  ");

			}
			System.out.println("\n");
		}

		driver.quit();
	}

}
