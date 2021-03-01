package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseSetup {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void BeforeMetodTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit(); // закроет все вкладки
    }
}
