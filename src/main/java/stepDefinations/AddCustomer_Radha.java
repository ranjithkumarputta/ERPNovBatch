//package InvoiceMgrDemo.steps;

//import InvoiceMgrDemo.pages.AddCustomer_RadhaPageObject;
//import InvoiceMgrDemo.pages.Login_RadhaPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddCustomer_Radha extends CommonFunctions_Radha {

    public Login_RadhaPageObject pageObj = new Login_RadhaPageObject();
    public AddCustomer_RadhaPageObject pageObj1= new AddCustomer_RadhaPageObject();



    @Given("^I am on login page$")
    public void i_am_on_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


    }

    @When("^I enter email <\"([^\"]*)\">$")
    public void i_enter_email(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj.setUserName(arg1);
    }

    @When("^passwd as <\"([^\"]*)\">$")
    public void passwd_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj.setPassword(arg1);

    }

    @Then("^i click on login button$")
    public void i_click_on_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj.loginClick();

    }


    //--------------------login
    @Given("^I click on Add Customer in Customers$")
    public void i_click_on_Add_Customer_in_Customers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.customerClick();

    }

    @When("^I enter customer details \"([^\"]*)\"$")
    public void i_enter_customer_details(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addCustomer(arg1);
    }

    @When("^Person as \"([^\"]*)\"$")
    public void person_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addContactPerson(arg1);

    }

    @When("^Mail as \"([^\"]*)\"$")
    public void mail_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addEmail(arg1);

    }
    @When("^Phone as \"([^\"]*)\"$")
    public void phone_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addPhone(arg1);
    }

    @When("^LAddress as \"([^\"]*)\"$")
    public void laddress_as(String arg1) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        pageObj1.addAddress(arg1);
    }
    @When("^City as \"([^\"]*)\"$")
    public void city_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addCity(arg1);

    }

    @When("^county as \"([^\"]*)\"$")
    public void county_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addCounty(arg1);

    }

    @When("^postcode as \"([^\"]*)\"$")
    public void postcode_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addPostcode(arg1);

    }

    @When("^country as \"([^\"]*)\"$")
    public void country_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addCountry(arg1);

    }

    @Then("^I should see title as \"([^\"]*)\"$")
    public void i_should_see_title_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObj1.addCustomerClick(arg1);


    }


}
