package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US706_DialogContent extends Parent {

    public US706_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name=\"login[username]\"]")
    public WebElement id;

    @FindBy(xpath = "//input[@name=\"login[password]\"]")
    public WebElement pass;
    @FindBy(xpath = "//span[text()='Sign In'][1]")
    public WebElement sign;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
    public WebElement myaccount;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[3]/div/a")
    public WebElement argus;

    @FindBy(xpath = "//*[@id=\"ui-id-5\"]")
    public WebElement Men;
    @FindBy(xpath = "//*[@id=\"ui-id-17\"]")
    public WebElement menTops;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public WebElement addCart;

    @FindBy(xpath = "//*[@id=\"option-label-size-143-item-169\"]")
    public WebElement large;

    @FindBy(xpath = "//*[@id=\"option-label-color-93-item-52\"]")
    public WebElement colorselect;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    public WebElement basket;

    @FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
    public WebElement checkOut;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button")
    public WebElement nextButton;
    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrder;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[3]/p[1]")
    public WebElement orderNumber;
    @FindBy(xpath = "//*[@id=\"ui-id-18\"]")
    public WebElement menBottoms;
    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "signIn": return this.signIn;
            case "id": return this.id;
            case "pass": return this.pass;
            case "sign": return this.sign;
            case "myaccount": return this.myaccount;
            case "argus": return this.argus;
            case "Men": return this.Men;
            case "menTops": return this.menTops;
            case "addCart": return this.addCart;
            case "large": return this.large;
            case "colorselect": return this.colorselect;
            case "basket": return this.basket;
            case "checkOut": return this.checkOut;
            case "nextButton": return this.nextButton;
            case "placeOrder": return this.placeOrder;
            case "orderNumber": return this.orderNumber;
            case "menBottoms": return this.menBottoms;

        }

        return null;
    }


}