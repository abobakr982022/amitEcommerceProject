package StepDefination;

import DataFiles.Data;
import GeneralMethods.JsonDataReaderForRegisteration;
import Pages.P01Registeration;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class S01Registeration {
    P01Registeration registeration ;
    SoftAssert softAssert = new SoftAssert();




    @Before
    public void initRegisterationPage () {
        registeration = new P01Registeration(Hooks.driver);
    }

    @DataProvider (name = "registerationData")
    public Object[][] registerationDataProvider () throws IOException {
        return JsonDataReaderForRegisteration.getData();
    }

    @Given("user click to user icon")
    public void clickOnUserIcon () {
        registeration.clickOnUserIcon();
    }

    @And ("Click On Create Account Button")
    public void clickOnCreateAccountBtn () {
        registeration.clickOnCreateNewAccountBtn();
    }

    @When("enter the user name")
    public void FillUserName () {
        registeration.enterUserName(Data.userName);
    }

    @And("enter the email")
    public void fillEmail () {
        registeration.enterEmail(Data.Email);
    }

    @And ("enter the password")
    public void fillPassword () {
        registeration.enterPassword(Data.password);
    }
    @And ("confirm his password")
    public void confirmPassword () {
        registeration.enterConfirmPassword(Data.password);
    }

    @And ("enter his first name and last name")
    public void enterFirstNameAndLastName () {
        registeration.enterFirstName(Data.firstName);
        registeration.enterLastName(Data.lastName);
    }

    @And ("enter his phone number")
    public void fillPhoneNumber () {
        registeration.enterPhoneNumber(Data.phoneNumber);
    }

    @And ("enter his country")
    public void enterCountry () {
        registeration.enterCountry(Data.country);
    }

    @And ("enter his city")
    public void enterCity () {
        registeration.enterCity(Data.city);
    }

    @And ("enter his address")
    public void enterAddress () {
        registeration.enterAddress(Data.address);
    }

    @And ("enter his state and postal code")
    public void enterPostalCodeAndState () {
        registeration.enterPostalCode(Data.postalCode);
        registeration.enterState(Data.state);
    }

    @And ("agree on policy")
    public void checkOnPolicy () {
        registeration.checkOnAgreeCheckBox();
    }

    @And ("click on Register button")
    public void clickOnRegisterationBtn () {
        registeration.clickOnRegisterBtn();
    }

    @Then("the user is registered successfully")
    public void assertUserName () {
        softAssert.assertEquals(registeration.getUserName() , Data.userName );
        softAssert.assertAll();
    }

}
