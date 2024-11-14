package Shashank.WebAutomation.Nov14_2024;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFiles/file.feature",
        glue = {"Shashank.WebAutomation.Nov14_2024"},
        plugin = {"pretty", "html:target/Nov14_2024_Report/HtmlReport"})
public class Runner {

}
