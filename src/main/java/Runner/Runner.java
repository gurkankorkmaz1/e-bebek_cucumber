package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true,
        features = "src\\test\\resources\\features\\askd.feature",
        glue = "steps",
        dryRun = false
)

public class Runner extends AbstractTestNGCucumberTests {

}
