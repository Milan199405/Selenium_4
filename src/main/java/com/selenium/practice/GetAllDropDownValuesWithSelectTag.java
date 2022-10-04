package com.selenium.practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllDropDownValuesWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		By countryDropdownLocator = By.id("Form_submitForm_Country");
//		WebElement countryDropdownElement = driver.findElement(countryDropdownLocator);
//		Select select = new Select(countryDropdownElement);

//		  int count = 1;
//		  List<WebElement> countryOptions = select.getOptions();
//		  for(WebElement e: countryOptions) { 
//			  String text = e.getText();
//		  if(text.equals("- Select Country -")) continue;
//		  System.out.println(count +  "===>" + text);
//		  count++;
//		  }

		List<String> optionsValue = getAllDropDownValuesWithSelectTag(countryDropdownLocator);
		System.out.println("Total Size => " + optionsValue.size());

		int count = 1;
		for (String s : optionsValue) {
			if (s.equals("- Select Country -"))
				continue;
			System.out.println(count + "==> " + s);
			count++;
		}
		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getAllDropDownValuesWithSelectTag(By locator) {
		List<String> actualList = new ArrayList<String>();
		WebElement elemant = getElement(locator);
		Select select = new Select(elemant);
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			actualList.add(text);
		}

		return actualList;
	}
}
