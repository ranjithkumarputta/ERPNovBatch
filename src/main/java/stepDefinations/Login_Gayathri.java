package com.erp.demo.steps;

import com.erp.demo.pageObjects.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login extends CommonFunctions {


    @Given("^I am on the IM login page$")
    public void i_am_on_the_IM_login_page() throws Throwable {
        openBrowser();

        driver.get("http://3.13.126.58/AMS3.0/auth/login/");

    }
    @When("^I enter \"([^\"]*)\" in the email field$")
    public void i_enter_in_the_email_field(String email) throws Throwable {
        driver.findElement(By.id("inputEmail")).sendKeys(email);

    }

    @When("^I enter \"([^\"]*)\" in the password field$")
    public void i_enter_in_the_password_field(String pwd) throws Throwable {
        driver.findElement(By.id("inputPassword")).sendKeys(pwd);

    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

    }

    @Then("^I should see a title \"([^\"]*)\"$")
    public void i_should_see_a_title(String title) throws Throwable {
        String expectedValue = title;
        String actualValue = driver.findElement(By.xpath("//a[contains(text(),'Invoice Manager')]")).getText();

        Assert.assertEquals(expectedValue,actualValue);
    }

    @Then("^I should see a label \"([^\"]*)\"$")
    public void i_should_see_a_label(String arg1) throws Throwable {
        String expectedValue = "Logged In Successfully";
        String actualValue = driver.findElement(By.xpath("//p[contains(text(),'Logged In Successfully')]")).getText();

        Assert.assertEquals(expectedValue,actualValue);

    }

}
