package StepDefination;

import DataFiles.Data;
import Pages.P01Registeration;
import Pages.P02Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class S02Login {
    P01Registeration registeration;
    P02Login login;
    SoftAssert softAssert = new SoftAssert();

    @Before
    public void initLogin () {
        registeration = new P01Registeration(Hooks.driver);
        login = new P02Login(Hooks.driver);
        registeration.clickOnUserIcon();
    }

    @Given ("user Enter User Name")
    public void enterUserName () {
        login.enterUserName(Data.userName);
    }
    @And ("Enter Password")
    public void enterPassword () {
        login.enterPassword(Data.password);
    }
    @And ("Click on Sign In button")
    public void clickOnSignInBtn() {
        login.pressOnLoginBtn();
    }
    @Then ("Login is success")
    public void checkOnLogin () {
        softAssert.assertEquals(registeration.getUserName() , Data.userName);
        softAssert.assertAll();
    }

}
