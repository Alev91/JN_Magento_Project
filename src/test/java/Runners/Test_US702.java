package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/US702_Login.feature"},
        glue = {"StepDefinitions"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class Test_US702 extends AbstractTestNGCucumberTests {

}
