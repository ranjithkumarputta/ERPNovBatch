package kud.adduser.po.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kud.adduser.po.pageobject.AddUserPage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AddUser extends Commonfunctions{

    private AddUserPage addUserPage;
    @Given("^User Launch Chrome browser And User opens URL http://(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)/AMS(\\d+)\\.(\\d+)/home$")
    public void user_Launch_Chrome_browser_And_User_opens_URL_http_AMS_home(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
        addUserPage=new AddUserPage(driver);
        addUserPage.loadApplication();
    }

    @When("^User enters Email as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_Email_as_and(String Email, String Password) throws Throwable {
        addUserPage.enterEmailAndPassword(Email,Password);

    }

    @When("^Click on login$")
    public void click_on_login() throws Throwable {
        addUserPage.login();
    }

    @Then("^User can view Dashboard$")
    public void user_can_view_Dashboard() throws Throwable {
        addUserPage.dashboard();

    }

    @When("^User click on Users menu$")
    public void user_click_on_Users_menu() throws Throwable {
  addUserPage.userMenu();


    }

    @When("^clicks Add New User button$")
    public void clicks_Add_New_User_button() throws Throwable {
     addUserPage.addNewUserButton();
    }

    @Then("^User can view Add New User page$")
    public void user_can_view_Add_New_User_page() throws Throwable {
    addUserPage.viewAddNewUsertxt();
    }

    @When("^User enters New User information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_New_User_information_and(String FirstName, String LastName, String Company, String Phone, String NewEmailAddress, String UserPassword, String UserConfirmPassword) throws Throwable {
        addUserPage.userEntersNewUserInfo(FirstName,LastName,Company,Phone,NewEmailAddress,UserPassword,UserConfirmPassword);
    }

    @When("^click on Add User button$")
    public void click_on_Add_User_button() throws Throwable {
        addUserPage.clickAddUserBtn();


    }

    @Then("^user can view added searching  their \"([^\"]*)\"$")
    public void user_can_view_added_searching_their(String FirstName) throws Throwable {
        addUserPage.userCanSearch(FirstName);


    }

    @When("^user clicks on logout button$")
    public void user_clicks_on_logout_button() throws Throwable {
       addUserPage.userClicksLogoutBtn();


    }

    @Then("^user should logout$")
    public void user_should_logout() throws Throwable {
    addUserPage.userToLogout();
    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" details$")
    public void user_enters_and_details(String NewloginEmail, String Newpassword) throws Throwable {

        addUserPage.userEnterNewEmailAndPassword(NewloginEmail,Newpassword);
    }

    @Then("^new user should login successfully$")
    public void new_user_should_login_successfully() throws Throwable {
        addUserPage.newUserShouldLogin();

    }

    @Then("^close browser$")
    public void close_browser() throws Throwable {
     closeBrowser();

    }


}
