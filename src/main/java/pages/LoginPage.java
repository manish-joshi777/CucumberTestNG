package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    //Page Factory : OR (Object repository)
    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//div[contains(@class, 'submit')]")
    WebElement loginBtn;

    //initializing the page objects
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //action
    public String getTitle(){
        return driver.getTitle();
    }

    public HomePage login(String userName, String pass){
        email.sendKeys(userName);
        password.sendKeys(pass);
        loginBtn.click();

        return new HomePage();
    }
}
