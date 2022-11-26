package InvoiceManagerDemo.steps;

import InvoiceManagerDemo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Home extends CommonFunction {

    HomePage homePage = new HomePage(driver);

    @Given("^user opens home page url with chrome browser$")
    public void user_opens_home_page_url_with_chrome_browser() throws Throwable {
        homePage.load();
    }

    @When("^user enter valid credentials$")
    public void user_enter_valid_credentials() throws Throwable {
        homePage.signIn();
        homePage.signInVerify();
    }

    @Then("^user should be open homepage$")
    public void user_should_be_open_homepage() throws Throwable {
        homePage.load();
        homePage.VerifyHomePage();
    }
    @Then("^user should be open homepage$")
    public void user_should_be_open_homepage() throws Throwable {
        homePage.load();
        homePage.VerifyHomePage();
    }

    @Then("^user should be open homepage$")
    public void user_should_be_open_homepage() throws Throwable {
        homePage.load();
        homePage.VerifyHomePage();
    }

    @Then("^user should be open homepage$")
    public void user_should_be_open_homepage() throws Throwable {
        homePage.load();
        homePage.VerifyHomePage();
    }
}
