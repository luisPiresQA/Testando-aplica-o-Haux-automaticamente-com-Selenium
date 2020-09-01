package org.example.utils;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaciaDriver {
    protected static WebDriver driver;

    @BeforeClass
    public static void inicializarMetodo() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pasta1\\Documents\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("localhost:8080/login");
    }

    @After
    public void finalizar() {
        driver.quit();
    }
}