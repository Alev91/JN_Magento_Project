package StepDefinitions;

import Pages.US703_LocatorClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US703_AddAddress {

    US703_LocatorClass lc=new US703_LocatorClass();


    @And("Click on the Element in LocatorClass")
    public void clickOnTheElementInLocatorClass(DataTable buttons) {

        List<String> strButtonList= buttons.asList(String.class);

        for(int i=0;i< strButtonList.size();i++) {
            WebElement linkWebElemnt= lc.getWebElement(strButtonList.get(i));
            lc.myClick(linkWebElemnt);
        }
    }

    @And("User sending the Keys in LocatorClass")
    public void userSendingTheKeysInLocatorClass(DataTable textBoxInput) {

        List< List<String> > listTxtYazi= textBoxInput.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt= lc.getWebElement(listTxtYazi.get(i).get(0));
            lc.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
        }
    }

    @And("User select the Keys in LocatorClass")
    public void userSelectTheKeysInLocatorClass(DataTable selectDropdown) {

        List< List<String> > dropdownOptions = selectDropdown.asLists(String.class);

        for (int i = 0; i < dropdownOptions.size(); i++) {
            WebElement dropdownWebElement = lc.getWebElement(dropdownOptions.get(i).get(0));
            String optionToSelect = dropdownOptions.get(i).get(1);

            Select dropdown = new Select(dropdownWebElement);

            dropdown.selectByVisibleText(optionToSelect);
        }


    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        lc.verifyContainsText(lc.addressBook,"Address Book");
    }
}
