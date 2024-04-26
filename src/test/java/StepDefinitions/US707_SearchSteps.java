package StepDefinitions;


import Pages.US707_SearchFunctionality;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US707_SearchSteps {
    US707_SearchFunctionality us7=new US707_SearchFunctionality();
    @When("User enters product valid id number in the search box")
    public void userEntersProductValidIdNumberInTheSearchBox() {
        us7.mySendKeys(us7.searchBox,"MT07");
        new Actions(GWD.getDriver()).sendKeys(Keys.ENTER).build().perform();
    }

    @And("User should be able to verify product id number")
    public void userShouldBeAbleToVerifyProductIdNumber() {
        us7.verifyContainsText(us7.confirmingId,"MT07");
    }

    @When("User enters invalid product id number in the search box")
    public void userEntersInvalidProductIdNumberInTheSearchBox() {
        us7.mySendKeys(us7.searchBox,"MT071");
        new Actions(GWD.getDriver()).sendKeys(Keys.ENTER).build().perform();
    }

    @And("A warning messagge must occur on the screen")
    public void aWarningMessaggeMustOccurOnTheScreen() {
        us7.verifyContainsText(us7.invalidTextMessage,"Your search returned no results.");

    }
}
