package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/testdesign","src/test/resources/demo"},
        glue = {"stepdefinition","hooks"},
        tags = "@smoketest",
        plugin = {"pretty"}
)


public class SmokeTestRunner {
}
