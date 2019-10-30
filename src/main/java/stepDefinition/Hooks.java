package stepDefinition;

import base.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void before_scenario(){
        System.out.println(" before_scenario");
    }

    @After
    public void after_scenario(){
        System.out.println("after_scenario");
        driver.quit();
    }
}
