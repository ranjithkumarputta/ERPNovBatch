package invoicemanager1.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.cs.A;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonFunctions {

@Before
    public void executeBefore()
{
    OpenBrowser();

}
@After
public void executeAfter()
{
    CloseBrowser();

}











}
