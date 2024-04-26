package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.GWD;



public class US707_SearchFunctionality extends ParentPage {
    public US707_SearchFunctionality() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;


    @FindBy(xpath = "//span[@class='base']")
    public WebElement successMessage;
    @FindBy(xpath = "//div[@class='message notice']")
    public WebElement errorMessage;
    @FindBy(xpath = "//span[@class='base']")
    public WebElement confirmingId;
    @FindBy(xpath = "//div[contains(text(),'Your search returned no results.')]")
    public WebElement invalidTextMessage;

    public  WebElement getWebElement(String str){
        switch (str){
            case "search":return this.searchBox;
            case"succes":return this.successMessage;
            case "errorMessage":return this.errorMessage;
            case "confirmingId":return this.confirmingId;
            case "invalidTextMessage":return this.invalidTextMessage;
        }
        return null;
    }




}




