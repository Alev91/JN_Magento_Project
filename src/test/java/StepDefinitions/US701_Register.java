package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US701_Register {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @Given("Navigate to the Website Magento")
    public void navigateToTheWebsiteMagento() {
        GWD.getDriver().get(" https://magento.softwaretestingboard.com/");
    }

   @When ("Create new Customer Account,enter customer Data and click on the Create an Account button")
    public void createNewCustomerAccountEnterCustomerDataAndClickOnTheCreateAnAccountButton() {
        dc.myClick(dc.createAnAccount);
        ln.mySendKeys(ln.firstname,"Javanator");
        ln.mySendKeys(ln.lastname,"TechnoStudy");
        ln.mySendKeys(ln.emailAddress,"javanator1905@gmail.com");
        ln.mySendKeys(ln.password, "Javanator1905!");
        ln.mySendKeys(ln.confirmPassword,"Javanator1905!");
        ln.myClick(ln.buttonCreateAnAccount);

    }

    @Then("User should be successfully registered")
    public void userShouldBeSuccessfullyRegistered() {
        dc.verifyContainsText(dc.successfullyRegisteredControl,"Thank you for registering");
    }
}
