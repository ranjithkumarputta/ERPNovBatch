package invoicemanager1.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import invoicemanager1.pages.AddQuotationPage;

public class AddQuotationSteps extends CommonFunctions {


    private String refNumber;
    private String compName;
    private String custName;
    private String quoStatus;

    private AddQuotationPage addQuotationPage;

    @Given("^I am on the login page in Invoice Manager Application$")
    public void i_am_on_the_login_page_in_Invoice_Manager_Application() throws Throwable {

        addQuotationPage = new AddQuotationPage(driver);
        addQuotationPage.loadApplication();
    }

    @And("^I enter a valid \"([^\"]*)\" and \"([^\"]*)\" and click the Login Button$")
    public void iEnterAValidAndAndClickTheLoginButton(String email, String password) throws Throwable {

        addQuotationPage.login(email, password);
        addQuotationPage.clickOnButton("Login");

    }

    @When("^I Navigate to the Add quotation page in Sales Menu in Invoice Manager$")
    public void i_Navigate_to_the_Add_quotation_page_in_Sales_Menu_in_Invoice_Manager() throws Throwable {

        addQuotationPage.loadAddQuotationPage();

    }

    @And("^I select a \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" from Date$")
    public void iSelectAAndFromDate(String month, String day, String hour, String minutes) throws Throwable {

        addQuotationPage.selectQuotationDate(month, day, hour, minutes);

    }


    @And("^I select a \"([^\"]*)\" from My Billing Company$")
    public void iSelectAFromMyBillingCompany(String company) throws Throwable {

            addQuotationPage.selectCompany(company);
    }



    @When("^I click on the Reference no button to generate the reference number$")
    public void i_click_on_the_Reference_no_button_to_generate_the_reference_number() throws Throwable {

        addQuotationPage.generateReference();

    }

    @And("^I select \"([^\"]*)\" from Customer dropdown box$")
    public void iSelectFromCustomerDropdownBox(String customer) throws Throwable {

        addQuotationPage.selectCustomer(customer);

    }


    @And("^I select a \"([^\"]*)\" and \"([^\"]*)\" from Expiry Date$")
    public void iSelectAAndFromExpiryDate(String expiryMonth, String expiryDay) throws Throwable {

        addQuotationPage.selectExpiryDate(expiryMonth,expiryDay);

    }

    @And("^I select the \"([^\"]*)\" from Order Tax$")
    public void iSelectTheFromOrderTax(String tax) throws Throwable {

        addQuotationPage.selectTax(tax);

    }


    @And("^I select the \"([^\"]*)\" from Status dropdown box$")
    public void iSelectTheFromStatusDropdownBox(String status) throws Throwable {

        addQuotationPage.selectStatus(status);

    }

    @And("^I enter the \"([^\"]*)\" ,\"([^\"]*)\" \"([^\"]*)\" customer order details$")
    public void iEnterTheCustomerOrderDetails(String quantity, String productDescription, String unitPrice) throws Throwable {

        addQuotationPage.sendCustomerDetails(quantity, productDescription, unitPrice);

    }

    @Then("^I click on the Add Quotation button$")
    public void i_click_on_the_Add_Quotation_button() throws Throwable {
       addQuotationPage.clickAddQuotationButton();

    }


    @And("^I am able to see the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" in the first row of Quotations$")
    public void iAmAbleToSeeTheAndInTheFirstRowOfQuotations(String expectedCompany, String expectedCustomer, String expectedStatus, String expectedDate) throws Throwable {

        addQuotationPage.assertQuotationFromFirstRow(expectedCompany,expectedCustomer,expectedStatus,expectedDate);

    }
    @And("^I am able to download the quotation file as pdf$")
    public void iAmAbleToDownloadTheQuotationFileAsPdf() {

        addQuotationPage.assertFileDownload();

    }

}
