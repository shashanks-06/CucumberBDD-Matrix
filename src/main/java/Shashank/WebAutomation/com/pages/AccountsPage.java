package Shashank.WebAutomation.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage {

    private final WebDriver driver;

    //    1. By Locators:
    private final By accountsSection = By.cssSelector(".myaccount-link-list span");
    private final By addMyFirstAddressField = By.xpath("//a[@title=\"Add my first address\"]//span");


    //    2. Constructor of the Page class
    public AccountsPage(WebDriver driver) {
        this.driver = driver;
    }


    //  3. page actions: features(behaviour) of the page the form of methods

    public int getAccountsSectionCount(){
        return driver.findElements(accountsSection).size();
    }

    public List<String> getAccountsSectionList(){
        List<String> accountsList = new ArrayList<>();
        List<WebElement> accountsHeadersList = driver.findElements(accountsSection);

        for(WebElement element : accountsHeadersList){
            String text = element.getText();
            System.out.println(text);
            accountsList.add(text);
        }

        return accountsList;

    }

}
