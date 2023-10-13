package CucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/CucumberTest/features",
        glue = {"CucumberTest/stepdefs"},
       // dryRun = true,
        plugin = "pretty",
        monochrome = false
)

public class TestRunner {

}
