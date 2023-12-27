package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
        glue = "StepDefinitions",
        monochrome = true,
                tags = "@three",
                plugin = {"pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"
})
public class TestngRunner extends AbstractTestNGCucumberTests {
}
