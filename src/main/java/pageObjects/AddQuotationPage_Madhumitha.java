package invoicemanager1.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class AddQuotationPage {

    private WebDriver driver;
    private String downloadPath = "C:\\Users\\krish\\Downloads";
    private String fileName = "Quotation";

    public AddQuotationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void loadApplication() {
        driver.get("http://3.13.126.58/AMS3.0/auth/login");
    }


    public void login(String email, String password) {
        // Enter the email and password needed for logging into the application.
        driver.findElement(By.id("inputEmail")).sendKeys(email);
        driver.findElement(By.id("inputPassword")).sendKeys(password);
    }


    public void clickOnButton(String buttonText) {
        driver.findElement(By.xpath("//button[contains(text(), '" + buttonText + "')]")).click();
    }


    public void loadAddQuotationPage() {
        driver.get("http://3.13.126.58/AMS3.0/sales/add_quote");
    }


    public void selectQuotationDate(String month, String day, String hour, String minutes) {
        String xPathForDate = "//*[@id=\"date\"]";
        WebElement date = waitForElementVisibilityByXPath(xPathForDate);
        date.click();

        while (true) {
            // Traverse to the required month by clicking the Next Arrow until the required month is reached.
            WebElement monthElement = driver.findElement(By.xpath("/html/body/div[8]/div[3]/table/thead/tr[1]/th[2]"));

            String monthText = monthElement.getText();
            if (monthText.equals(month)) {
                // Required month is now reached and hence can exit the while loop now.
                break;
            } else {
                // Keep clicking the Next Arrow until the required month is reached.
                WebElement nextArrow = driver.findElement(By.xpath("/html/body/div[8]/div[3]/table/thead/tr[1]/th[3]"));
                nextArrow.click();
            }
        }

        // Required month has been reached in the above while loop. Now the required day needs to be clicked.
        WebElement dayElement = driver.findElement(By.xpath("//body[1]/div[8]/div[3]/table[1]/tbody[1]/tr/td[contains(text()," + day + ")]"));
        dayElement.click();

        // Once the required Day has been clicked above, the required Hour will need to be selected.
        WebElement hourElement = null;
        int hourInt = Integer.parseInt(hour); // Since input hour is in String, converting it to int here to check in the next step on whether it is above 12.

        // Check if the input hour is above 12 (e.g. if its is 18 then we need to select 6 from the PM hour elements)
        // If hour is above 12 (e.g. 18) then deduct 12 from it to get the hour in pm format (6pm)
        if(hourInt > 12) {
            int pmHour = hourInt - 12;

            // Once the hour in pm format (e.g. 6 pm instead of 18) is obtained, converted it back to string to use it in the XPath below.
            hour = String.valueOf(pmHour);
            hourElement = driver.findElement(By.xpath("//body[1]/div[8]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[2]/span[contains(text()," + hour + ")]"));
        } else {
            // If the input hour is less than or equal to 12 then no need to deduct 12, since it will be the same in am format.
            // E.g. 8 hours will be the same as 8 am.
            hourElement = driver.findElement(By.xpath("//body[1]/div[8]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/span[contains(text()," + hour + ")]"));
        }

        // By now the hour in am or pm format will be selected. Now click.
        hourElement.click();

        // Now select the minutes
        WebElement minuteElement = driver.findElement(By.xpath("//span[contains(text()," + minutes + ")]"));
        minuteElement.click();

    }


    public void selectCompany(String company) {
        String divElementId = "billing_company_chosen";
        String dropDownOptionsXpath ="//div[@id='billing_company_chosen']/div/ul/li";
        selectDropDownOption(company,divElementId,dropDownOptionsXpath);
    }


    public void generateReference() {
        WebElement referenceNumber = driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/span[1]/i[1]"));
        referenceNumber.click();
    }


    public void selectCustomer(String customer) {
        String divElementId = "customer_chosen";
        String dropDownOptionsXpath ="//div[@id='customer_chosen']/div/ul/li";
        selectDropDownOption(customer,divElementId,dropDownOptionsXpath);
    }


    public void selectExpiryDate(String expiryMonth, String expiryDay) {
        String expiryDateXpath = "//*[@id=\"expiry_date\"]";
        WebElement expiryDate = waitForElementVisibilityByXPath(expiryDateXpath);
        expiryDate.click();

        while (true) {
            WebElement monthElement = driver.findElement(By.xpath("/html/body/div[9]/div[3]/table/thead/tr[1]/th[2]"));
            String monthText = monthElement.getText();

            if (monthText.equals(expiryMonth)) {
                break;
            } else {
                WebElement nextArrow = driver.findElement(By.xpath("/html/body/div[9]/div[3]/table/thead/tr[1]/th[3]"));
                nextArrow.click();
            }
        }

        WebElement dayElement = driver.findElement(By.xpath("//body[1]/div[9]/div[3]/table[1]/tbody[1]/tr/td[contains(text()," + expiryDay + ")]"));
        dayElement.click();
    }


    public void selectTax(String tax) {
        String divElementId = "order_tax_chosen";
        String dropDownOptionsXpath ="//div[@id='order_tax_chosen']/div/ul/li";
        selectDropDownOption(tax,divElementId,dropDownOptionsXpath);
    }


    public void selectStatus(String status) {
        String divElementId = "status_chosen";
        String dropDownOptionsXpath ="//div[@id='status_chosen']/div/ul/li";
        selectDropDownOption(status,divElementId,dropDownOptionsXpath);
    }

    public void sendCustomerDetails(String quantity, String productDescription, String unitPrice) {
        driver.findElement(By.id("quantity-1")).sendKeys(quantity);
        driver.findElement(By.id("product-1")).sendKeys(productDescription);
        driver.findElement(By.id("price-1")).sendKeys(unitPrice);
    }


    public void clickAddQuotationButton() {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[11]/input[1]")).click();
    }


    public void assertQuotationFromFirstRow(String expectedCompany, String expectedCustomer, String expectedStatus, String expectedDate) {
        WebElement firstRowCompany = waitForElementVisibilityByXPath("//table[@id='fileData']/tbody[1]/tr[1]/td[2]");
        WebElement firstRowCustomer = waitForElementVisibilityByXPath("//table[@id='fileData']/tbody[1]/tr[1]/td[5]");
        WebElement firstRowStatus = waitForElementVisibilityByXPath("//table[@id='fileData']/tbody[1]/tr[1]/td[9]/div[1]/small[1]/span[1]");
        WebElement firstRowDate = waitForElementVisibilityByXPath("//table[@id='fileData']/tbody[1]/tr[1]/td[1]");

        Assert.assertEquals(expectedCompany, firstRowCompany.getText());
        Assert.assertEquals(expectedCustomer, firstRowCustomer.getText());
        Assert.assertEquals(expectedStatus, firstRowStatus.getText());
        Assert.assertEquals(expectedDate, firstRowDate.getText());
    }


    public void assertFileDownload() {
        WebElement actionsElement = driver.findElement(By.xpath("//table[@id='fileData']/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]"));
        actionsElement.click();

        WebElement downloadElement = driver.findElement(By.xpath("//table[@id='fileData']/tbody[1]/tr[1]/td[10]/div/div/ul/li[4]/a"));
        downloadElement.click();

        Assert.assertTrue(isFileDownloaded(downloadPath, fileName));
        System.out.println("The File Download is Asserted successfully");
    }


    private WebElement waitForElementVisibilityByXPath(String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        return webElement;
    }


    private void selectDropDownOption(String selectedOption, String divElementId,String dropDownOptionsXpath) {
        // Find the Div element that contains the Anchor tag and click the Div element. Then the dropdown options will appear.
        WebElement divElement = driver.findElement(By.id(divElementId));
        divElement.click();

        // Find the list of drop-down options by traversing to the elements listing the options.
        // Here, the options were in Div (having the anchor tag)/Div/ul/li
        List<WebElement> dropDownElements = driver.findElements(By.xpath(dropDownOptionsXpath));

        for (WebElement dropDownElement : dropDownElements) {
            if (selectedOption.equals(dropDownElement.getText())) {
                dropDownElement.click();
                break;
            }
        }

    }


    private boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();
        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().contains(fileName) && dir_contents[i].getName().contains("pdf")) {
                flag = true;
                return flag;
            }
        }

        return flag;
    }

}
