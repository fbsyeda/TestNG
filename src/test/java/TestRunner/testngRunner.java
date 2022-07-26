package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"Features"},
        glue = {"Stepdefinition"},
        tags = "@Regression1"
)
public class testngRunner extends AbstractTestNGCucumberTests
{

}

