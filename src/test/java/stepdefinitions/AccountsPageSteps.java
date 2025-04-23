package stepdefinitions;

import Shashank.WebAutomation.com.pages.AccountsPage;
import Shashank.WebAutomation.com.pages.LoginPage;
import Shashank.WebAutomation.com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class AccountsPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AccountsPage accountsPage;

    @Given("user has already logged in to the application")
    public void userHasAlreadyLoggedInToTheApplication(DataTable dataTable) {

        List<Map<String, String>> credsList =  dataTable.asMaps();

        String username = credsList.get(0).get("username");
        String password = credsList.get(0).get("password");

        DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

        accountsPage = loginPage.doLogin(username, password);


    }

    @Given("user is on the Accounts Page")
    public void userIsOnTheAccountsPage() {
        
    }

    @Given("user is on Accounts page")
    public void userIsOnAccountsPage() {
        
    }

    @Then("user gets accounts section")
    public void userGetsAccountsSection(DataTable dataTable) {
        
    }

    @And("accounts section count should be {int}")
    public void accountsSectionCountShouldBe(int count) {
    }
}
