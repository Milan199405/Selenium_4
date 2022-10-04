package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
	static ElementUtil elUtil;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elUtil = new ElementUtil(driver);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		/*
		 * selectChoice("choice 1", "choice 2", "choice 2 1", "choice 2 2",
		 * "choice 2 3", "choice 3", "choice 4", "choice 5", "choice 6", "choice 6 1",
		 * "choice 6 2", "choice 6 2 1", "choice 6 2 2", "choice 6 2 3", "choice 7");
		 */
	selectChoice("choice 7 7");

	}

	public static void selectChoice(String... value) {
		By dropDownLink = By.xpath("//h3[text() = 'Multi Selection']/parent::div//button[contains(@id, 'ArrowBtn')]");
		By dropDownValue = By
				.xpath("(//div[contains(@id, 'DropDownContainer')])[1]//li/span[@class = 'comboTreeItemTitle']");

		elUtil.doClick(dropDownLink);
		List<WebElement> choiceList = elUtil.getElements(dropDownValue);
		boolean flag = true;
		for (WebElement e : choiceList) {
			if (value[0].equalsIgnoreCase("all")) {
				flag = false;
				e.click();
			} else if (!value[0].equalsIgnoreCase("all")) {
				String choice = e.getText();
				for (int i = 0; i < value.length; i++) {

					if (choice.equals(value[i])) {
						flag = false;
						e.click();
					}
				}

			}
		}

		if (flag) {
			System.out.println("Please provide correct value...");
		}
	}

}
