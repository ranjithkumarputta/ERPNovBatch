//package InvoiceMgrDemo.pages;

//import InvoiceMgrDemo.steps.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomer_RadhaPageObject extends CommonFunctions_Radha {

    WebDriverWait wait=new WebDriverWait(driver, 20);
    public void customerClick()
    {
        driver.findElement(By.xpath("//a[@class='mm_customers']")).click();
        System.out.println("Customers menu clicked");

        //Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='customers_add']")));


        driver.findElement(By.xpath("//a[@id='customers_add']")).click();
        System.out.println("Add new Customer menu clicked page");
    }


    public void addCustomer(String str)
    {
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys(str);
    }
    public void addContactPerson(String str)
    {
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(str);

    }
    public void addEmail(String str)
    {
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(str);
    }
    public void addPhone(String str)
    {
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(str);
    }
    public void addAddress(String str)
    {
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys(str);

    }
    public void addCity(String str)
    {
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(str);

    }
    public void addCounty(String str)
    {
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys(str);

    }
    public void addPostcode(String str)
    {
        driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys(str);

    }
    public void addCountry(String str)
    {
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys(str);

    }
    public void addCustomerClick(String str)
    {

        System.out.println("Before Button click");

        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        System.out.println("Button click");
        //Thread.sleep(10000);
        // wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(By.xpath()))
        String expectedValue = "\"" + str + "\"";
        System.out.println("expected value="+expectedValue);
        if (expectedValue.isEmpty())
        {
            String actualValue = driver.findElement(By.xpath("//div[@class='alert alert-success']]")).getText();

            System.out.println(actualValue);
            Assert.assertEquals(expectedValue, actualValue);
        }
        else
        {
            String actualValue = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
            System.out.println(actualValue);

        }

        // validation=//div[@class='alert alert-danger']
    }
}
