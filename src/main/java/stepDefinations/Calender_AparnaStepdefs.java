package org.aparna;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.aparna.HelperClass.*;
import static org.aparna.Hooks.driver;

public class Stepdefs {

    @Given("I open the browser")
    public void iOpenTheBrowser() {
        driver.manage().window().maximize();
    }

    @And("I login to URL {string} with email {string} and password {string}")
    public void iLoginToURLWithEmailAndPassword(String url, String email, String pass) {
        driver.get(url);
        driver.findElement(By.name("identity")).sendKeys("admin@gic.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Admin123");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
    }

    @And("I navigate to home URL{string}")
    public void iNavigateToHomeURL(String arg0) {
        driver.get("http://3.13.126.58/AMS3.0/home");
    }

    @When("I click on calender")
    public void iClickOnCalender() {
        String calenderlinkXpath = "//*[@id=\"topbar\"]/div/nav/ul[2]/li[2]/a";
        driver.findElement(By.xpath(calenderlinkXpath)).click();

    }

    @Then("It should load calender page")
    public void itShouldLoadCalenderWithCurrentMonth() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h2"));
        //Assertions.assertEquals("Calendar", element.getText());
        Assertions.assertTrue(element.getText().contains("Calendar"));

    }

    @Then("Current month is shown")
    public void currentMonthIsShown() {
        String monthLabelXPath = "//*[@id=\"calendar\"]/div[1]/div[3]/h2";
        WebElement element = driver.findElement(By.xpath(monthLabelXPath));
        String expected = getCurrentMonth() + " " + getCurrentYear();
        Assertions.assertEquals(expected, element.getText());

    }




    @And("I click week button on calender page")
    public void iClickWeekButtonOnCalenderPage() {
        driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[2]")).click();
    }

    @Then("It should reflect current week with correct format")
    public void itShouldReflectCurrentWeekWithFormat() {
        WebElement element = driver.findElement(By.cssSelector("#calendar > div.fc-toolbar > div.fc-center > h2"));

        Assertions.assertEquals(getFormattedWeek(), element.getText());

    }


    @And("I click day button on calender page")
    public void iClickDayButtonOnCalenderPage() {

        driver.findElement(By.cssSelector("#calendar > div.fc-toolbar > div.fc-right > div > button.fc-agendaDay-button.fc-button.fc-state-default.fc-corner-right")).click();
    }

    @Then("It should reflect current day with correct format")
    public void itShouldReflectCurrentDayWithCorrectFormat() {
        WebElement element = driver.findElement(By.cssSelector("#calendar > div.fc-toolbar > div.fc-center > h2"));

        Assertions.assertEquals(getFormattedDay(), element.getText());


    }

    @And("I click month button on calender page")
    public void iClickMonthButtonOnCalenderPage() {
        driver.findElement(By.cssSelector("#calendar > div.fc-toolbar > div.fc-right > div > button.fc-month-button.fc-button.fc-state-default.fc-corner-left.fc-state-active")).click();

    }

    @Then("It should reflect current month with correct format")
    public void itShouldReflectCurrentMonthWithCorrectFormat() {
        WebElement element = driver.findElement(By.cssSelector("#calendar > div.fc-toolbar > div.fc-center > h2"));
        Assertions.assertEquals(getFormattedMonth(), element.getText());


    }


}
