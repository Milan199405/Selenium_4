package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	static WebDriver driver;
    static ElementUtil elUtil;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elUtil = new ElementUtil(driver);
		driver.get("https://ui.freecrm.com/");

		Thread.sleep(5000);

		String name = "Bivas Kumar Mishra";
		By email = By.name("email");
		By password = By.name("password");
		By login = By.xpath("//div[text() = 'Login']");

		elUtil.doSendKeys(email, "manas25pradhan@gmail.com");
		elUtil.doSendKeys(password, "Milan@12345");

		Thread.sleep(5000);

		elUtil.doClick(login);

		Thread.sleep(3000);

		driver.navigate().to("https://ui.freecrm.com/contacts");

		Thread.sleep(5000);

		selectContactByName(name);
		String address = getContactAddressByName(name);
		System.out.println(address);

		Thread.sleep(2000);
		driver.quit();
	}

	public static void selectContactByName(String name) {
		By contactName = By.xpath("//table//td/a[text() = '" + name + "']/parent::td/preceding-sibling::td//input");
		Actions action = new Actions(driver);
		WebElement clickableElement = driver.findElement(contactName);
		action.click(clickableElement).perform();
	}

	public static String getContactAddressByName(String name) {
		By contactName = By.xpath("(//table//td/a[text() = '" + name + "']/parent::td/following-sibling::td)[position() = 1]");
        return elUtil.doGetText(contactName);
	}

}
