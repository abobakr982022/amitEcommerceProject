package StepDefination;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest logger;
    public static ExtentHtmlReporter extent;


    @Before
    public void setup () {
//        extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "\\src\\test\\java\\TestReports\\Web-Automation On Chrome "+ GetCurrentTime() + " .html"));
//        report = new ExtentReports();
//        report.attachReporter(extent);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.get("https://advantageonlineshopping.com/");
        System.out.println("driver is : " + driver);
    }

    @After
    public void teardown(){
        driver.quit();}







}
