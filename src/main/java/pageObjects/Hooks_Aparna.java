package org.aparna;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();

    }

    @Before
    public void before() {
        System.out.println("Before hook");
        driver = new ChromeDriver();
    }


    @After
    public void after() {
        System.out.println("After hook");
        driver.quit();
    }
}
