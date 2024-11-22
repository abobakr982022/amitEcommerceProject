package Pages;

import GeneralMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class P01Registeration {
    private static WebDriver driver;


    public P01Registeration (WebDriver driver) {
        this.driver = driver;
    }

    GeneralMethods methods = new GeneralMethods();

    // 1- Locators
    By userIcon = By.id("hrefUserIcon");
    By createNewAccountBtn = By.xpath("//a[text()='CREATE NEW ACCOUNT']");
    By userName = By.xpath("//input[@name='usernameRegisterPage']");
    By email = By.xpath("//input[@name='emailRegisterPage']");
    By password = By.xpath("//input[@name='passwordRegisterPage']");
    By confirmPassword = By.xpath("//input[@name='confirm_passwordRegisterPage']");
    By firstName = By.xpath("//input[@name='first_nameRegisterPage']");
    By lastName = By.xpath("//input[@name='last_nameRegisterPage']");
    By phoneNumber = By.xpath("//input[@name='phone_numberRegisterPage']");
    By country = By.xpath("//select[@name='countryListboxRegisterPage']");
    By city = By.xpath("//input[@name='cityRegisterPage']");
    By address = By.xpath("//input[@name='addressRegisterPage']");
    By state = By.xpath("//input[@name='state_/_province_/_regionRegisterPage']");
    By postalCode = By.xpath("//input[@name='postal_codeRegisterPage']");
    By iAgreeCheck = By.xpath("//input[@name='i_agree']");
    By registerBtn = By.id("register_btn");

    By userNameAssertion = By.xpath("//a//span[@class='hi-user containMiniTitle ng-binding']");


    // 2- Methods
    public void clickOnUserIcon () {
        methods.waitTillButtonClickable(driver,userIcon);
        driver.findElement(userIcon).click();
    }

    public void clickOnCreateNewAccountBtn () {
        methods.waitTillButtonClickable(driver,createNewAccountBtn);
        driver.findElement(createNewAccountBtn).click();
    }

    public void enterUserName (String username) {
        driver.findElement(userName).sendKeys(username);
    }

    public void enterEmail (String email) {
        driver.findElement(this.email).sendKeys(email);
    }

    public void enterPassword (String password) {
        driver.findElement(this.password).sendKeys(password);
    }

    public void enterConfirmPassword (String confirmPassword) {
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
    }

    public void enterFirstName (String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
    }

    public void enterLastName (String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
    }

    public void enterPhoneNumber (String phoneNumber) {
        driver.findElement(this.phoneNumber).sendKeys(phoneNumber);
    }

    public void enterCountry (String country) {
        methods.selectFromDropDownList(driver,this.country,country);
    }

    public void enterCity (String city) {
        driver.findElement(this.city).sendKeys(city);
    }

    public void enterAddress (String address) {
        driver.findElement(this.address).sendKeys(address);
    }

    public void enterState (String state) {
        driver.findElement(this.state).sendKeys(state);
    }

    public void enterPostalCode (String postalCode) {
        driver.findElement(this.postalCode).sendKeys(postalCode);
    }

    public void checkOnAgreeCheckBox () {
        if (!driver.findElement(iAgreeCheck).isSelected()){
            driver.findElement(iAgreeCheck).click();
        }
    }

    public void clickOnRegisterBtn () {
        methods.waitTillButtonClickable(driver,registerBtn);
        driver.findElement(registerBtn).click();
    }

    public String getUserName () {
        return driver.findElement(userNameAssertion).getText();
    }





}
