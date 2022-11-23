package com.addnewproduct.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonFunctions{
    @Before
    public void executeBefore(){
        openBrowser();

    }
    @After
    public void executeAfter(){
        closeBrowser();

    }
}
