package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/resources/Features/OpencartSeach.feature",
		glue = "stepdefinitions",
		plugin = {"pretty", "html:target/cucumber-reports" },
		monochrome = true
		)
public class RunTestNGTest extends AbstractTestNGCucumberTests {

}
