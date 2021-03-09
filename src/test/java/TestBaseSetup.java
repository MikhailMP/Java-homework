package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.java.Helpers.Screenshot;

import java.io.IOException;


public class TestBaseSetup {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void BeforeMetodTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) throws IOException {
        Screenshot screenshot = new Screenshot(driver);
        screenshot.makeScreenshot(testResult);
        driver.quit(); // закроет все вкладки
    }
}
