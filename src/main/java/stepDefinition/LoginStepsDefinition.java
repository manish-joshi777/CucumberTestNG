package stepDefinition;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepsDefinition extends BaseClass {

    LoginPage loginPage;
    HomePage homePage = new HomePage();
    @Given("user open browser")
    public void user_open_browser() {
        System.out.println(" open browser");
        initialization();
    }

    @Then("user is on login page")
    public void user_is_on_login_page() {
        System.out.println(" login page");
        loginPage = new LoginPage();
        String title = loginPage.getTitle();
        Assert.assertEquals(title, "Cogmento CRM");
    }

    @Then("user login in app")
    public void user_login_in_app() {

        System.out.println(" login app");
        homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("userPassword"));
    }

    @Then("validate homepage title")
    public void validate_homepage_title() {
        System.out.println(" validate");
        String title = homePage.getTitle();
        Assert.assertEquals(title, "Cogmento CRM");
    }

    public void checkStash(){
        System.out.println("check stash");
        System.out.println("check stash");
    }

    public void stashCommit(){}

}
