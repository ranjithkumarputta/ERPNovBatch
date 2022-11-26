package kud.adduser.po.pageobject;

import cucumber.api.java.gl.E;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.security.PrivateKey;

public class AddUserPage {
    private WebDriver driver;
    @FindBy(id="inputEmail")
    private WebElement emailTxt;

    @FindBy(id="inputPassword")
    private WebElement passwordTxt;

    @FindBy(css = "body > div > div > div > div > div.widget.worange > div.widget-content > div > form > div:nth-child(4) > div.col-lg-9 > button")
    private WebElement loginBtn;

    @FindBy(xpath="/html/body/div[2]/div/nav/ul/li[5]/a/i")
    private WebElement userMenuBtn;

   @FindBy(id="auth_create_user")
    private WebElement addUserNewBtn;

   @FindBy(id="first_name")
   private WebElement firstNameTxt;

   @FindBy(id="last_name")
   private  WebElement lastNameTxt;

   @FindBy(id="company")
   private WebElement companyTxt;

    @FindBy(css="#phone")
    private WebElement phoneTxt;

    @FindBy(css = "#email")
    private WebElement newEmailAddress;

    @FindBy(css="#password")
    private WebElement newUserPassword;

    @FindBy(css ="#password_confirm")
    private WebElement newUserConfirmPassword;

    @FindBy(css = "body > div.mainbar > div.matter > div.container > form > div:nth-child(10) > div > input")
    private WebElement clickAddUserBtn;

    @FindBy(css="#fileData_filter > label > input")
    private WebElement userCanSearch;

    @FindBy(xpath = "//*[@id=\"topbar\"]/div/nav/ul[1]/li/a")
    private WebElement userClicksLogoutBtn;

    @FindBy(xpath = "//*[@id=\"topbar\"]/div/nav/ul[1]/li/ul/li[2]/a")
    private WebElement userToLogout;

    @FindBy(id = "inputEmail")
    private WebElement enterNewEmailtxt;

    @FindBy(id = "inputPassword")
    private WebElement enterNewPasswordtxt;
    public AddUserPage(WebDriver webDriver){
        driver=webDriver;
        PageFactory.initElements(driver,this);

    }

    public void loadApplication(){
        driver.get("http://3.13.126.58/AMS3.0/home");
    }
    public void enterEmailAndPassword(String Email, String Password){

        emailTxt.sendKeys(Email);
        passwordTxt.sendKeys(Password);

    }
    public void login()
    {
     loginBtn.click();
    }
    public void dashboard()
    {
        driver.get("http://3.13.126.58/AMS3.0/home");
    }
    public void  userMenu(){

        userMenuBtn.click();
    }

    public  void addNewUserButton(){

        addUserNewBtn.click();

    }

    public void viewAddNewUsertxt(){
        //String expectedValue = "Add New User";
       // String actualValue = driver.findElement(By.cssSelector("body > div.mainbar > div.page-head > h2")).getText();
       // Assert.assertEquals(expectedValue,actualValue);
        System.out.println("Title of the webpage is : " +driver.getTitle());

    }
    public void userEntersNewUserInfo(String FirstName, String LastName, String Company, String Phone, String NewEmailAddress, String UserPassword, String UserConfirmPassword){
        firstNameTxt.sendKeys(FirstName);
        lastNameTxt.sendKeys((LastName));
        companyTxt.sendKeys(Company);
        phoneTxt.sendKeys(Phone);
        newEmailAddress.sendKeys(NewEmailAddress);
        newUserPassword.sendKeys(UserPassword);
        newUserConfirmPassword.sendKeys(UserConfirmPassword);

    }

    public void clickAddUserBtn(){
         clickAddUserBtn.click();
        driver.get("http://3.13.126.58/AMS3.0/auth/users");
    }
    public void userCanSearch(String FirstName){
        userCanSearch.sendKeys(FirstName);

    }

    public void userClicksLogoutBtn(){
        userClicksLogoutBtn.click();
    }

    public void userToLogout(){
        userToLogout.click();
    }
    public void userEnterNewEmailAndPassword(String NewloginEmail, String Newpassword){
        enterNewEmailtxt.sendKeys(NewloginEmail);
        enterNewPasswordtxt.sendKeys(Newpassword);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();

    }
    public void newUserShouldLogin(){
        driver.get("http://3.13.126.58/AMS3.0/home");
    }
}
