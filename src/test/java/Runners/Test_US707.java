package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features ={"src/test/java/FeatureFiles/US707_SearchFunctionality.feature"},
        glue = {"StepDefinitions"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Test_US707 extends AbstractTestNGCucumberTests {

}
