package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Search.feature",
               tags = {"@SearchSuccessful"},
               glue = "stepdefinition")

public class SearchRunner {
}
