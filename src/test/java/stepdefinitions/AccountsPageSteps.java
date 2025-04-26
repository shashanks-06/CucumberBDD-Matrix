package stepdefinitions;

import Shashank.WebAutomation.com.pages.AccountsPage;
import Shashank.WebAutomation.com.pages.LoginPage;
import Shashank.WebAutomation.com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AccountsPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AccountsPage accountsPage;

    @Given("user has already logged in to the application")
    public void userHasAlreadyLoggedInToTheApplication(DataTable credTable) {

        List<Map<String, String>> credsList =  credTable.asMaps();

        String username = credsList.get(0).get("username");
        String password = credsList.get(0).get("password");

        DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

        accountsPage = loginPage.doLogin(username, password);


    }

    @Given("user is on the Accounts Page")
    public void userIsOnTheAccountsPage() {
        String title = accountsPage.getAccountsPageTitle();
        System.out.println("Accounts Page Title : " + title);
    }


    @Then("user gets accounts section")
    public void userGetsAccountsSection(DataTable sectionsTable) {

        List<String> expected_AccountsSectionList = sectionsTable.asList();
        System.out.println("Expected Accounts Section List : " + expected_AccountsSectionList);

        List<String> actual_AccountsSectionList = accountsPage.getAccountsSectionList();
        System.out.println("Actual Accounts Section List : " + actual_AccountsSectionList);

        Assert.assertTrue(expected_AccountsSectionList.containsAll(actual_AccountsSectionList));

    }

    @And("accounts section count should be {int}")
    public void accountsSectionCountShouldBe(int expectedSectionCount) {
        Assert.assertEquals(accountsPage.getAccountsSectionCount(), expectedSectionCount);
    }
}
