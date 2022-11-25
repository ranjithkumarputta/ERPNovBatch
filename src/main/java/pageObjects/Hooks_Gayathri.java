package com.erp.demo.pageObjects;

import org.junit.After;
import org.junit.Before;

public class Hooks extends CommonFunctions {

    @Before
    public void executeBefore(){
        openBrowser();
    }

   @After
    public void executeAfter(){

        closeBrowser();
   }


}
