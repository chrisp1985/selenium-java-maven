package com.test.selenium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

    WebDriver driver;

    @BeforeEach
    public void setupDriver() {
        this.driver = new ChromeDriver();
    }

    @Test
    public void myFirstTestCase() {
        driver.get("http://www.google.com");
    }
}
