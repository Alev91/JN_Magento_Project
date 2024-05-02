package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features ={"src/test/java/FeatureFiles/US705_AddCard.feature"},
        glue = {"StepDefinitions"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Test_US705 extends AbstractTestNGCucumberTests {

}
