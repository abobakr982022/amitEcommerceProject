package Pages;

import GeneralMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02Login {
    private static WebDriver driver;


    public P02Login(WebDriver driver) {
        this.driver = driver;
    }
    GeneralMethods methods = new GeneralMethods();


    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By rememberMe = By.xpath("//input[@name='remember_me']");
    By signInBtn = By.id("sign_in_btn");

    public void enterUserName (String userName) {
        driver.findElement(this.userName).sendKeys(userName);
    }
    public void enterPassword (String password) {
        driver.findElement(this.password).sendKeys(password);
    }
    public void checkOnRememberMe () {
        if(!driver.findElement(rememberMe).isSelected()){
            driver.findElement(rememberMe).click();
        }
    }
    public void pressOnLoginBtn(){
        methods.waitTillButtonClickable(driver,signInBtn);
        driver.findElement(signInBtn).click();
    }


}
