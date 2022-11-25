package paymentreport.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class Paymentreportpage_anu {
    public String custName =null;
    public void login(WebDriver driver) {
        String url = "http://3.13.126.58/AMS3.0/home";
        driver.get(url);
        driver.findElement(By.id("inputEmail")).sendKeys("admin@gic.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Admin123");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
        driver.get(url);
    }
    public void clickreportsfromleftpanel(WebDriver driver) {
        driver.findElement(By.xpath("//a[@class='mm_reports']")).click();
    }
    public void clickonpaymentreport(WebDriver driver) {
        driver.findElement(By.xpath("//a[@id='reports_payments']")).click();
    }
    public void enterrequiredfieldofpaymentreport(WebDriver driver) {
        WebElement divElement = driver.findElement(By.id("customer_chosen"));
        divElement.click();
        custName = "Testing (Invoice_Role)";
        List<WebElement> customer = driver.findElements(By.xpath("//ul[@class='chosen-results']/li"));
        System.out.println("Number of Status Options is: " + customer.size());
        int i = 0;
        for (WebElement customerdetails : customer) {
            System.out.println("Status " + i++ + " is: " + customerdetails.getText());
            if (custName.equals(customerdetails.getText())) {
                customerdetails.click();
                break;
            }
            driver.findElement(By.id("start_date")).sendKeys("17/11/22");
        }
    }
    public void clicksubmit(WebDriver driver){
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
    }
    public String getresulttitle(WebDriver driver){
       return driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div[3]/div[1]/div[1]/strong[1]")).getText();
    }
}
