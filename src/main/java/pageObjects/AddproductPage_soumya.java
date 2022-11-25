package com.addnewproduct.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AddproductPage {
    public void loginHome(WebDriver driver){
        driver.get("http://3.13.126.58/AMS3.0/home");
        driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("admin@gic.com");
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Admin123");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
        driver.get("http://3.13.126.58/AMS3.0/home");
    }
    public void addproductNavigation(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[3]/a")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        driver.findElement(By.xpath("//*[@id=\"products_add\"]")).click();
    }
    public void addproductButtonClick(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/form/div[4]/div/input")).click();
    }
    public void validValues(WebDriver driver) {
        String[] validvalues ={"Laptop" ,"Microsoft" ,"50000"};
        driver.findElement(By.id("name")).sendKeys(validvalues[0]);
        driver.findElement(By.id("details")).sendKeys(validvalues[1]);
        driver.findElement(By.id("price")).sendKeys(validvalues[2]);

    }
    public void invalidValues(WebDriver driver) {
        String[] invalidvalues ={"car" ,"HondaCity" ,"ABCD"};
            driver.findElement(By.id("name")).sendKeys(invalidvalues[0]);
            driver.findElement(By.id("details")).sendKeys(invalidvalues[1]);
            driver.findElement(By.id("price")).sendKeys(invalidvalues[2]);

        }
    public void successmessageDisplay(WebDriver driver) {
        String messege = driver.findElement(By.xpath("/html/body/div[3]/div[2]")).getText();
        if(messege.contains("success")){
            System.out.println("'Add New Product' Page Accepting Valid Values ");
        }
        else{
            System.out.println("Add New Product Page Accepting InValid Values ");
        }
    }
    public void errormessageDisplay(WebDriver driver) {
        String messege = driver.findElement(By.xpath("/html/body/div[3]/div[2]")).getText();
        if(messege.contains("success")){
            System.out.println("'Add New Product' Page Accepting Invalid Values ");
        }
        else{
            System.out.println("Add New Product Page Accepting Valid Values ");
        }

    }
   }
