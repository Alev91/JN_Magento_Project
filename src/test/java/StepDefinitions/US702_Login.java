package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US702_Login {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Then("Enter username and password and click on the sign in button")
    public void enterUsernameAndPasswordAndClickOnTheSignInButton() {
        dc.myClick(dc.signIn);
        ln.mySendKeys(ln.emailInput, "javanator1905@gmail.com");
        ln.mySendKeys(ln.passwordInput, "Javanator1905!");
        ln.myClick(ln.signInButton);
    }

    @And("User should be successfully logged in")
    public void userShouldBeSuccessfullyLoggedIn() {
        dc.verifyContainsText(dc.succesfullyLoginControl, "My Account");
    }

    @When("Enter invalid username and password and click on the sign in button")
    public void enterInvalidUsernameAndPasswordAndClickOnTheSignInButton() {
        dc.myClick(dc.signIn);
        ln.mySendKeys(ln.emailInput, "javanator@gmail.com");
        ln.mySendKeys(ln.passwordInput, "javanator1905!");
        ln.myClick(ln.signInButton);
    }

    @Then("User should receive an error message")
    public void userShouldReceiveAnErrorMessage() {
        dc.verifyContainsText(dc.loginErrorMsg, "The account sign-in was incorrect");
    }
}
