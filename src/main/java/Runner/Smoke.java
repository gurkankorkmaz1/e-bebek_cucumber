package Runner;

import com.cucumber.listener.Reporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        },
        //plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html",
        features = "src\\test\\resources\\features\\askd.feature",
        glue = "steps",
        dryRun = false,
        tags = "@Smoke"
)
public class Smoke extends AbstractTestNGCucumberTests {
        @AfterClass
        public static void afterClass(){
                Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

                Reporter.setSystemInfo("Intern: ", "Gurkan Korkmaz");
                Reporter.setSystemInfo("App Nmae: ","Kirapyurdu test");
                Reporter.setSystemInfo("Operating System Info: ",System.getProperty("os.name"));
                Reporter.setTestRunnerOutput("Test execution Cucumber report");
        }
}
