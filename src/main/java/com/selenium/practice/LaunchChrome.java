package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in");
        String title = driver.getTitle();

        if (title.equals("Google")) {
            System.out.println("PASS - correct title");
        } else {
            System.out.println("FAIL - incorrect title" + title);
        }
        driver.quit();
    }
}
