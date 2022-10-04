package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://amazon.in");
        String url = driver.getCurrentUrl();
        System.out.println("Page url - "+ url);
        driver.quit();
    }
}
