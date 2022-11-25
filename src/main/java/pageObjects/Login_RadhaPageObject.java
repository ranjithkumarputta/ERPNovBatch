//package InvoiceMgrDemo.pages;

//import InvoiceMgrDemo.steps.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_RadhaPageObject extends CommonFunctions_Radha {

    public void getUserName(){}
    public void setUserName(String str){
        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys(str);
        //email.sendKeys("admin@gic.com");
    }
    public void getPassword(){}
    public void setPassword(String str){
        WebElement psword = driver.findElement(By.id("inputPassword"));
        psword.sendKeys(str);
        //psword.sendKeys("Admin123");
    }

    public void loginClick(){
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']"));
        button.click();
        driver.get(url);
    }

}
