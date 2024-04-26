package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "email_address")
    public WebElement emailAddress;

    @FindBy(css = "input[id='password']")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement confirmPassword;

    @FindBy(xpath = "//span[text()='Create an Account']")
    public WebElement buttonCreateAnAccount;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(id = "send2")
    public WebElement signInButton;






}
