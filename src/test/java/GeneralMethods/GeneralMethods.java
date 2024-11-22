package GeneralMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeneralMethods {
  private static WebDriver driver ;

  WebDriverWait wait;
  public void waitTillButtonClickable(WebDriver driver , By locator){
      wait = new WebDriverWait(driver , Duration.ofSeconds(10));
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

  }

  public void selectFromDropDownList (WebDriver driver , By locator , String visibleText) {
      Select select = new Select(driver.findElement(locator));
      select.selectByVisibleText(visibleText);
  }
}
