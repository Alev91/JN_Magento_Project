package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US703_LocatorClass extends Parent {

    public US703_LocatorClass() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "button[data-action='customer-menu-toggle']")
    public WebElement customerMenuDropdown;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    public WebElement manageAddresses;

    @FindBy(id = "telephone")
    public WebElement phoneNumber;

    @FindBy(id = "street_1")
    public WebElement inputAddressStreet1;

    @FindBy(id = "street_2")
    public WebElement inputAddressStreet2;

    @FindBy(id = "street_3")
    public WebElement inputAddressStreet3;

    @FindBy(id = "city")
    public WebElement inputAddressCity;

    @FindBy(css = "select[id='country']")
    public WebElement selectCountry;

    @FindBy(css = "select[id='region_id']")
    public WebElement selectRegion;

    @FindBy(id = "zip")
    public WebElement inputZipCode;

    @FindBy(css = "button[class='action save primary']")
    public WebElement buttonSaveAddress;

    @FindBy(css = "button[class='action primary add']")
    public WebElement buttonAddNewAddress;

    @FindBy(id = "primary_billing")
    public WebElement billingAddress;

    @FindBy(id = "primary_shipping")
    public WebElement shippingAddress;

    @FindBy(xpath = "//span[text()='Address Book']")
    public WebElement addressBook;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {

            case "customerMenuDropdown": return this.customerMenuDropdown;
            case "myAccount": return this.myAccount;
            case "manageAddresses": return this.manageAddresses;
            case "buttonAddNewAddress": return this.buttonAddNewAddress;
            case "phoneNumber": return this.phoneNumber;
            case "inputAddressStreet1": return this.inputAddressStreet1;
            case "inputAddressCity": return this.inputAddressCity;
            case "selectCountry": return this.selectCountry;
            case "selectRegion": return this.selectRegion;
            case "inputZipCode": return this.inputZipCode;
            case "buttonSaveAddress": return this.buttonSaveAddress;
            case "shippingAddress": return this.shippingAddress;

        }
        return null;
    }


}
