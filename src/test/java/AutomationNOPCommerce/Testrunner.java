package AutomationNOPCommerce;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions( features = "src/test/features",
            tags = "@smoke3,@smoke1",
            plugin = "html:target/cucumber-reports")
    public class Testrunner {

    }

