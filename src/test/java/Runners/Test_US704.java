package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features ={"src/test/java/FeatureFiles/US704_TabMenuControl.feature"},
        glue = {"StepDefinitions"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Test_US704 extends AbstractTestNGCucumberTests {

}
