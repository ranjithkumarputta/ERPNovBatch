//package InvoiceMgrDemo.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonFunctions_Radha {
    @Before
    public void executeBefore()
    {

        openBrowser();
    }
    @After
    public void executeAfter()
    {
        closeBrowser();
    }
}
