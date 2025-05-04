package stepdefinitions;

import Shashank.WebAutomation.com.pages.AccountsPage;
import Shashank.WebAutomation.com.pages.LoginPage;
import Shashank.WebAutomation.com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
    private static String title;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AccountsPage accountsPage = new AccountsPage(DriverFactory.getDriver());

    @Given("User is on the Login Page")
    public void userIsOnTheLoginPage() {
        DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }

    @When("User gets the title of page")
    public void userGetsTheTitleOfPage() {

        title = loginPage.getLoginPageTitle();
//        title = accountsPage.getAccountsPageTitle();
        System.out.println("Page title is " + title);
    }

    @Then("Page title should be {string}")
    public void pageTitleShouldBe(String expectedTitleName) {

        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @Then("Forgot Your Password Link should be Displayed")
    public void forgotYourPasswordLinkShouldBeDisplayed() {

        Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
    }

    @When("User enters the username {string}")
    public void userEntersTheUsername(String username) {

        loginPage.enterUsername(username);
    }

    @And("User enters the password {string}")
    public void userEntersThePassword(String password) {

        loginPage.enterPassword(password);
    }

    @And("User clicks on Login Button")
    public void userClicksOnLoginButton() {

        loginPage.clickOnLogin();
    }


}
