package Shashank.WebAutomation.Nov14_2024;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefinition {
    WebDriver driver;
    String URL = "https://www.saucedemo.com/";

    @Given("Open Browser")
    public void open_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Then("Enter URL")
    public void enter_url() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("To Verify Page is Visible or Not")
    public void to_verify_page_is_visible_or_not() {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
    }

    @Then("Enter Username and Password")
    public void enter_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @Then("Click on Login button")
    public void click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

}
