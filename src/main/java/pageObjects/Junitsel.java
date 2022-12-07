import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitsel {
    @Test
    public void testcase1(){
        System.out.println("testcase 1");
        String expresult = "\"Jeans\"";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.name("header-big-screen-search-box")).sendKeys( "jeans");
        driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button")).click();
        String actualresult = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/h1/span[1]")).getText();

        Assert.assertEquals(expresult,actualresult);





    }
}
