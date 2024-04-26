package StepDefinitions;

import Pages.US706_DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US706_Product {
    US706_DialogContent dc2 = new US706_DialogContent();

    @When("User should be Login")
    public void userShouldBeLogin() {

        System.out.println("username ve şifre gönderildi");


        dc2.mySendKeys(dc2.id, "javanator1905@gmail.com");
        dc2.mySendKeys(dc2.pass, "Javanator1905!");
        dc2.myClick(dc2.sign);
    }


    @Then("User Succesfully Logined")
    public void user_should_login_successfully() {
        System.out.println("Siteye girildiği kontrol edildi");


        dc2.verifyContainsText(dc2.myaccount, "Welcome");
    }


    @And("Element Click on Dialog")
    public void clickOnTheElementInDialog(DataTable butonlar) throws InterruptedException {
        List<String> strButtonList = butonlar.asList(String.class);

        for (int i = 0; i < strButtonList.size(); i++) {
            WebElement linkWebElemnt = dc2.getWebElement(strButtonList.get(i));
            Thread.sleep(2000);
            dc2.myClick(linkWebElemnt);
        }
    }


    @And("Element Send Keys Diolog")
    public void userSendingTheKeysInDialog(DataTable textBoxVeYazilar) {
        List<List<String>> listTxtYazi = textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt = dc2.getWebElement(listTxtYazi.get(i).get(0));
            txtBoxWebElemnt.clear();
            dc2.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
        }
    }



    @Then("User should be see your order number")
    public void userShouldBeSeeYourOrderNumber() {
        dc2.verifyContainsText(dc2.orderNumber, "Your order number is: ");

    }


}