package test.java.HomeworkWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class OpenPage {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // open browserin max size

        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);

        //driver.quit();

        //p[text()='Today's Deals']
    }
}
