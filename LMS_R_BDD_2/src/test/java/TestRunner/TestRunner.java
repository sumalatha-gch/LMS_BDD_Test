package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (tags = "",
				features = {"src/test/resources/features"},
				glue = {"StepDefinition",},
				plugin = {"pretty", "html:target/htmreport.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
}
