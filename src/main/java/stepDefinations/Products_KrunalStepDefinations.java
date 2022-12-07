package InvoiceManagerDemo.steps;

import InvoiceManagerDemo.pages.HomePage;
import InvoiceManagerDemo.pages.ListProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.bouncycastle.asn1.x509.Holder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Products extends CommonFunction {

HomePage homePage = new HomePage(driver);
ListProductsPage listProductsPage = new ListProductsPage(driver);




    @Given("^User is on the InvoiceManager home page$")
    public void user_is_on_the_InvoiceManager_home_page() throws Throwable {
        homePage.load();
        homePage.signIn();
        homePage.signInVerify();
        homePage.load();
        homePage.VerifyHomePage();


    }

    @When("^User clicks on Products menu$")
    public void user_clicks_on_Products_menu() throws Throwable {

        homePage.ClickProductsMenu();

    }

    @And("^User clicks on list products submenu$")
    public void user_clicks_on_list_products_submenu() throws Throwable {
        //Thread.sleep(2000);
        homePage.ClickListProducts();


    }

    @Then("^User should be open list products page$")
    public void user_should_be_open_list_products_page() throws Throwable {
        //Thread.sleep(2000);
        homePage.VerifyListProductsPage();     //driver.get("http://3.13.126.58/AMS3.0/products");

    }
//======================== TC02
    @Given("^User is on list products page$")
    public void user_is_on_list_products_page() throws Throwable {

        homePage.load();
        homePage.signIn();
        homePage.signInVerify();
        homePage.load();
        homePage.VerifyHomePage();
        homePage.ClickProductsMenu();
        homePage.ClickListProducts();
        homePage.VerifyListProductsPage();
    }

    @When("^User clicks on edit product button in action column$")
    public void user_clicks_on_edit_product_button_in_action_column() throws Throwable {

        listProductsPage.ClickEditProduct();
      }

    @Then("^user will be navigated to update product page$")
    public void user_should_be_open() throws Throwable {

        listProductsPage.VerifyUpdateProductPage();
    }
//=======================================TC03
    @Given("^User is on update product page$")

    public void user_is_on_update_product_page() throws Throwable {

        homePage.load();
        homePage.signIn();
        homePage.signInVerify();
        homePage.load();
        homePage.VerifyHomePage();
        homePage.ClickProductsMenu();
        homePage.ClickListProducts();
        homePage.VerifyListProductsPage();
        listProductsPage.ClickEditProduct();
        listProductsPage.VerifyUpdateProductPage();
    }

    @When("^User edits valid Name, Details and Price$")
    public void user_edit_valid_Name_Details_and_Price() throws Throwable {

        listProductsPage.UpdateDetails();
    }

    @And("^User clicks on update product button$")
    public void user_clicks_on_update_product_button() throws Throwable {

        listProductsPage.ClickUpdateProductBtn();
    }

    @Then("^User should get \"([^\"]*)\" message$")
    public void user_should_get_message(String arg1) throws Throwable {

     listProductsPage.VerifyProductUpdated();
     }

// =======================TC4
    @Given("^User is on list product page$")
    public void user_is_on_list_product_page() throws Throwable {
        homePage.load();
        homePage.signIn();
        homePage.signInVerify();
        homePage.load();
        homePage.VerifyHomePage();
        homePage.ClickProductsMenu();
        homePage.ClickListProducts();
        listProductsPage.ClickEditProduct();
        listProductsPage.VerifyUpdateProductPage();
        listProductsPage.UpdateDetails();
        listProductsPage.ClickUpdateProductBtn();
        listProductsPage.VerifyProductUpdated();
    }

    @When("^User enter updated product in search input box$")
    public void user_enter_updated_product_in_search_input_box() throws Throwable {

        listProductsPage.ProductSearchAndClick();
    }

    @Then("^Updated product should be appear in the list$")
    public void updated_product_should_be_appear_in_the_list() throws Throwable {

        listProductsPage.VerifyProductSearch();

    }




}
