package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Create an Account']")
    public WebElement createAnAccount;

    @FindBy(xpath = "//li[@class='authorization-link']/a")
    public WebElement signIn;

    @FindBy(css = "[data-ui-id='message-success']>div")
    public WebElement successfullyRegisteredControl;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement succesfullyLoginControl;

    @FindBy(css = "[data-ui-id='message-error']>div")
    public WebElement loginErrorMsg;
}
