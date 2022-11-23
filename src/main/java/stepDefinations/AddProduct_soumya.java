package com.addnewproduct.stepdefinitions;

import com.addnewproduct.pages.AddproductPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddProduct extends CommonFunctions{
    AddproductPage pages = new AddproductPage();
    @Given("^User should login to the home page of IM$")
    public void user_should_login_to_the_home_page_of_IM() throws Throwable {
        pages.loginHome(driver);
    }

    @Given("^user click the Add Product of left side panel$")
    public void user_click_the_Add_Product_of_left_side_panel() throws Throwable {
        pages.addproductNavigation(driver);

    }
    @When("^user enter the ValidValues  in the new Product Page$")
    public void user_enter_the_ValidValues_in_the_new_Product_Page() throws Throwable {
        pages.validValues(driver);

    }
    @Then("^User should assert success message from new product page$")
    public void user_should_assert_success_message_from_new_product_page() throws Throwable {
        pages.successmessageDisplay(driver);

    }

    @When("^user enter the InValidValues  in the new Product Page$")
    public void user_enter_the_InValidValues_in_the_new_Product_Page() throws Throwable {
            pages.invalidValues(driver);
    }
    @When("^user click the Add Product button in new product page$")
    public void user_click_the_Add_Product_button_in_new_product_page() throws Throwable {
        pages.addproductButtonClick(driver);
    }

    @Then("^User should assert error message from new product page$")
    public void user_should_assert_messege_from_new_product_page() throws Throwable {
        pages.errormessageDisplay(driver);
    }

}
