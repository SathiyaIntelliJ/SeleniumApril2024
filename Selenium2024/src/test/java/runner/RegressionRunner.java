package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
   features = {"src/test/resources/testdesign"},
   glue = {"stepdefinition","hooks"},
        tags = "@multiple",
        plugin = {"pretty"}
)

public class RegressionRunner
{

}
