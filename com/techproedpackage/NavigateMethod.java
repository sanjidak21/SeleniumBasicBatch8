package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        Thread.sleep(1000); // pauses the thread for the given millsecs
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.close(); close current tab
        driver.quit(); // will quit the whole browser

    }
}
