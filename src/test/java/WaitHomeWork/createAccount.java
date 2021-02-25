package test.java.WaitHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class createAccount {
    By signInLinkLocator = By.id("nav-link-accountList-nav-line-1");
    //By signInButtonLocator = By.linkText("Sign in");
    By createAmazoneAccountLocator = By.id("createAccountSubmit");
    By continueCreateAmazoneAccountButtonLocator = By.id("continue");

    By textAlertNameFieldLocator = By.xpath("//div[contains(text(),'Enter your name')]"); // div[contains(text(),'Enter your email')]
    By textAlertEmailFieldLocator = By.xpath("//div[contains(text(),'Enter your email')]");
    By textAlertPasswordFieldLocator = By.xpath("//div[contains(text(),'Enter your password')]");

    By fieldNameLocator = By.id("ap_customer_name");
    By fieldEmailLocator = By.id("ap_email");
    By fieldPasswordLocator = By.id("ap_password");


    @Test
    public  void CreateAccountAllFiledsIsEmpty() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String expectedAlertNameField = "Enter your name";
        String expectedAlertEmailField = "Enter your email";
        String expectedAlertPasswordField = "Enter your password";

        driver.findElement(signInLinkLocator).click(); // Click on "sign In" link
        //Thread.sleep(5000);
        driver.findElement(createAmazoneAccountLocator).click(); // Click on "Create your amazone account" button first page

        driver.findElement(continueCreateAmazoneAccountButtonLocator).click(); // Click on "Create your amazone account", all fields are empty
        //Thread.sleep(5000);
        WebElement nameAlert = driver.findElement(textAlertNameFieldLocator);
        WebElement emailAlert = driver.findElement(textAlertEmailFieldLocator);
        WebElement passwordAlert = driver.findElement(textAlertPasswordFieldLocator);

        String actualAlertNameField = nameAlert.getText();
        String actualAlertEmailField = emailAlert.getText();
        String actualAlertPasswordField = passwordAlert.getText();

        assertEquals(expectedAlertNameField, actualAlertNameField);
        assertEquals(expectedAlertEmailField, actualAlertEmailField);
        assertEquals(expectedAlertPasswordField, actualAlertPasswordField);

       // assertEquals(expectedStatus, actualdStatus);
    }

    @Test
    public  void CreateAccountRePasswordIsEmpty() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.findElement(signInLinkLocator).click(); // Click on "sign In" link
        //driver.findElement(signInButtonLocator).click(); // Click on "sign In" button
        //Thread.sleep(5000);
        driver.findElement(createAmazoneAccountLocator).click(); // Click on "Create your amazone account" button first page

        driver.findElement(fieldNameLocator).click();
        driver.findElement(fieldNameLocator).sendKeys("Mikhailo");

        driver.findElement(fieldEmailLocator).click();
        driver.findElement(fieldEmailLocator).sendKeys("Mikhailo@gmail.com");

        driver.findElement(fieldPasswordLocator).click();
        driver.findElement(fieldPasswordLocator).sendKeys("123456qwerty654321");

        driver.findElement(continueCreateAmazoneAccountButtonLocator).click(); // Click on ""Create your amazone account" after fill in fields




        //assertEquals(expectedStatus, actualdStatus);
    }
}
