package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.java.Helpers.Screenshot;

import java.io.IOException;


public class TestBaseSetup {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected boolean result;

    @BeforeMethod
    public void BeforeMetodTest(ITestContext testContext){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        testContext.setAttribute("driver", driver); // Добавляем driver для  калсса TestListener что бы там в метод можно было передать
        // этот driver и вкинуть его сделать скриншот
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) throws IOException {
//        Screenshot screenshot = new Screenshot(driver);
//        screenshot.makeScreenshot(testResult);
        driver.quit(); // закроет все вкладки
    }
}
