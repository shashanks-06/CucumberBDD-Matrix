package Shashank.WebAutomation.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

//    1. By Locators:
    private By emailIdField = By.id("email");
    private By passwordField = By.id("passwd");
    private By submitBtnField = By.id("SubmitLogin");
    private By forgotPasswordField = By.linkText("Forgot your password?");

//    2. Constructor of the Page class
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

//  3. page actions: features(behaviour) of the page the form of methods

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean isForgotPasswordLinkExist(){
        return driver.findElement(forgotPasswordField).isDisplayed();
    }

    public void enterUsername(String username){
        driver.findElement(emailIdField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLogin(){
        driver.findElement(submitBtnField).click();
    }

}
