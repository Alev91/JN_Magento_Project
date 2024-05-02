package StepDefinitions;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US704_TabMenu {
    public void US704_LocaterClass(){
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath = "//span[text()='Women']")
    public WebElement womenBtn;

    @FindBy(xpath = "//span[text()='Tops']")
    public WebElement topsBtn;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsBTN2;

    @FindBy(xpath = "//p[contains(text(),'Items')]")
    public WebElement productItems;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menBtn;

    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement bottomsBtn;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {

            case "topsBtn": return this.topsBtn;
            case "womenBtn": return this.womenBtn;
            case "menBtn": return this.menBtn;
            case "bottomsBtn": return this.bottomsBtn;
            case "productItems": return this.productItems;
            case "topsBTN2": return this.topsBTN2;
        }
        return null;
    }

}
