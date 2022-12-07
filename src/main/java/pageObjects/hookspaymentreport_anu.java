package paymentreport.pageobject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import paymentreport.steps.commonfunction_anu;

public class hookspaymentreport_anu extends commonfunction_anu {

    @Before
    public void executebefore() {
        openbrowser();

    }
    @After
    public void executeafter() {
        closebrowser();

    }
}
