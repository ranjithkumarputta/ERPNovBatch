package InvoiceManagerDemo.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class ListProductsPage  {

    private String updateProductName = "VodafoneMobile";


   private WebDriver driver;
   public ListProductsPage( WebDriver webDriver) {

       driver = webDriver;
    }

//=======================================

    public void ClickEditProduct() {

         driver.findElement(By.xpath("(//a[@title='Edit Product'])[1]")).click();
    }

    public void VerifyUpdateProductPage(){

        String actualUpdatePage = driver.findElement(By.xpath("//div[contains(@class, 'page-head')]")).getText();
        String expectedUpdatePage = "Update Product"+"\n"+"Please update the information below.";
        Assert.assertEquals(expectedUpdatePage, actualUpdatePage);

    }
//==========================================


    public void UpdateDetails(){

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(updateProductName);
        driver.findElement(By.id("details")).clear();
        driver.findElement(By.id("details")).sendKeys(updateProductName);
        driver.findElement(By.id("price")).clear();
        driver.findElement(By.id("price")).sendKeys("90.0");
    }
    public void ClickUpdateProductBtn(){

        driver.findElement(By.name("submit")).click();
    }

    public void VerifyProductUpdated()  {


        String actualProductUpdatedMessage = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        String expectedProductUpdatedMessage = "×"+"\n"+"Product successfully updated";
        Assert.assertEquals(actualProductUpdatedMessage, expectedProductUpdatedMessage);

    }

    //=========================================

    public void ProductSearchAndClick(){

        driver.findElement(By.id("search_table")).sendKeys(updateProductName);
        driver.findElement(By.id("search_table")).sendKeys(Keys.ENTER);

    }
    public void VerifyProductSearch() throws InterruptedException {
        Thread.sleep(2000);
        String actualSearchProduct = driver.findElement(By.xpath("(//table/tbody/tr/td[@class='sorting_1'])[1]")).getText();
        String expectedSearchProduct = updateProductName;
        Assert.assertEquals(actualSearchProduct, expectedSearchProduct);
    }

}
