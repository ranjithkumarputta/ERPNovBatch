package paymentreport.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import paymentreport.pageobject.Paymentreportpage_anu;


public class paymentreport_anustepdefinition extends commonfunction_anu{
    private Paymentreportpage_anu paymentreportpage_anu = new Paymentreportpage_anu();
    @Given("^customer should navigate to IM Home Page$")
    public void customer_should_navigate_to_IM_Home_Page() throws Throwable {
        paymentreportpage_anu.login(driver);
    }
    @And("^Click on reports from left panel$")
    public void click_on_reports_from_left_panel() throws Throwable {
        paymentreportpage_anu.clickreportsfromleftpanel(driver);
    }
    @And("^Click on Payment reports$")
    public void click_on_Payment_reports() throws Throwable {
        paymentreportpage_anu.clickonpaymentreport(driver);

    }
    @When("^user enter all required filed of new payment report$")
    public void user_enter_all_required_filed_of_new_payment_report() throws Throwable {
        paymentreportpage_anu.enterrequiredfieldofpaymentreport(driver);

    }
    @When("^Click submit button$")
    public void click_submit_button() throws Throwable {
        paymentreportpage_anu.clicksubmit(driver);

    }
    @Then("^User should validate the reports generated based on the user request$")
    public void user_should_validate_the_reports_generated_based_on_the_user_request() throws Throwable {
         //Thread.sleep(5000);
         String actualresult = "Invoice_Role";
         String expectedresult = paymentreportpage_anu.getresulttitle(driver);
         Assert.assertEquals(actualresult,expectedresult);
    }
}


