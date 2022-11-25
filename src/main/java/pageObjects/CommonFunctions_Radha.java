//package InvoiceMgrDemo.steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

    public static WebDriver driver;

    public static String url="http://3.13.126.58/AMS3.0/home";

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
    public void closeBrowser()
    {
        driver.quit();
        // driver.close();
    }
}
