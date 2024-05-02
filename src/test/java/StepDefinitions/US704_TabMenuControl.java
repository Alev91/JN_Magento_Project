package StepDefinitions;

import Pages.US704_LocaterClass;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class US704_TabMenuControl {
    US704_LocaterClass lc=new US704_LocaterClass();
    @When("User move to the element in locaterclass")
    public void userMoveToTheElementInLocaterclass(DataTable button) {
        List<String> strButtonList = button.asList(String.class);


        for (int i = 0; i < strButtonList.size(); i++) {
            WebElement linkWebElemnt = lc.getWebElement(strButtonList.get(i));
            Actions actions = new Actions(GWD.getDriver());
            actions.moveToElement(linkWebElemnt).build().perform();
        }
    }

    @Then("User move to the Element in the locatorClass and click on the element")
    public void userMoveToTheElementInTheLocatorClassAndClickOnTheElement(DataTable button) throws InterruptedException {
        List<String> strButtonList = button.asList(String.class);


        for (int i = 0; i < strButtonList.size(); i++) {
            WebElement linkWebElemnt = lc.getWebElement(strButtonList.get(i));
            Actions actions = new Actions(GWD.getDriver());
         //   lc.wait.until(ExpectedConditions.elementToBeClickable(linkWebElemnt));
            Thread.sleep(2);
            actions.moveToElement(linkWebElemnt).click().build().perform();
        }
    }

    @And("Product Items should be displayed")
    public void productItemsShouldBeDisplayed(DataTable button) {
        List<String> strButtonList = button.asList(String.class);

        for (int i = 0; i < strButtonList.size(); i++) {
            WebElement linkWebElemnt = lc.getWebElement(strButtonList.get(i));
            lc.verifyContainsText(linkWebElemnt, "Items");
        }



    }

    @Then("Navigate back to the homepage")
    public void navigateBackToTheHomepage() {
        GWD.getDriver().navigate().to("https://magento.softwaretestingboard.com/");
    }


}
