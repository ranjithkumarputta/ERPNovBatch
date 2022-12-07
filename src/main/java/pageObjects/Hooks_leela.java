package kud.adduser.po.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonfunctions{
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
