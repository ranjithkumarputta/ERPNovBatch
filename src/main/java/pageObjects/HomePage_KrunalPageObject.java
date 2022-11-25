package InvoiceManagerDemo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class HomePage{


    private WebDriver driver;

    public HomePage(WebDriver webDriver) {
        driver = webDriver;
    }


    public void load() {

        driver.get("http://3.13.126.58/AMS3.0/home");
    }

    public void signIn() {

        driver.findElement(By.id("inputEmail")).sendKeys("admin@gic.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Admin123");
        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();


    }

    public void signInVerify() {

        String expectedValue = "Logged In Successfully";
        String actualValue = driver.findElement(By.xpath("//div//p[contains(text(), 'Logged In Successfully')]")).getText();
        Assert.assertEquals(expectedValue, actualValue);


    }

    public void VerifyHomePage() {

        String expectedHomePage = "Welcome to Invoice Manager!"+"\n"+"()";

        String actualHomePage= driver.findElement(By.xpath("//div[@class='page-head']/h2[@class='pull-left']")).getText();
        Assert.assertEquals(expectedHomePage, actualHomePage);
    }

    public void ClickProductsMenu() {

        driver.findElement(By.xpath("//a[@class='mm_products']")).click();
    }

    public void ClickListProducts() {

        driver.findElement(By.id("products_index")).click();
    }

    public void VerifyListProductsPage() {

        // driver.findElement(By.id("products_index")).click();
    }
}





