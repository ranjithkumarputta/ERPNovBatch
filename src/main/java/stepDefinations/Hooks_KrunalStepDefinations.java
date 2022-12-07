package InvoiceManagerDemo.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends CommonFunction {


    @Before
    public void executeBefore() {
        openBrowser();
    }

    @After
    public void executeAfter() {

       closeBrowser();

    }
}




