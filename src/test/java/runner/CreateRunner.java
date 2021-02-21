package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/Create.feature"})
         //tags = "@CreateSuccessful",
         //glue = "stepdefinition"

public class CreateRunner {
}
