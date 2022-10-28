package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");

		List<WebElement> nameList = driver.findElements(By.xpath("//td[contains(text(), 'Zorita Serrano')]"));

		String attr;

		while (true) {
			if (!(nameList.size() == 1)) {
				attr = driver.findElement(By.id("example_next")).getAttribute("class");
				driver.findElement(By.id("example_next")).click();
				nameList = driver.findElements(By.xpath("//td[contains(text(), 'Zorita Serrano')]"));

				if (attr.contains("disabled")) {
					System.out.println("Name not found");
					break;
				}

			} else {
				String position = driver.findElement(By.xpath(
						"//table[@id='example']/thead//th[2]/../..//following-sibling::tbody//tr/td[contains(text(), 'Zorita Serrano')]/../td[2]"))
						.getText();
				System.out.println(position);
				break;
			}
		}

	}
}
