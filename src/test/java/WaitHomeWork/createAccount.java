package test.java.WaitHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class createAccount extends TestBaseSetup {

    By signInLinkLocator = By.id("nav-link-accountList-nav-line-1");
    By createAmazoneAccountLocator = By.id("createAccountSubmit");
    By continueCreateAmazoneAccountButtonLocator = By.id("continue");

    By textAlertNameFieldLocator = By.xpath("//div[contains(text(),'Enter your name')]");
    By textAlertEmailFieldLocator = By.xpath("//div[contains(text(),'Enter your email')]");
    By textAlertPasswordFieldLocator = By.xpath("//div[contains(text(),'Enter your password')]");
    By textAlertRePasswordFieldLocator = By.xpath("//div[contains(text(),'Type your password again')]");

    By fieldNameLocator = By.id("ap_customer_name");
    By fieldEmailLocator = By.id("ap_email");
    By fieldPasswordLocator = By.id("ap_password");
    By fieldRePasswordLocator = By.id("ap_password_check");

    String name = "Mikhailo";
    String email = "Mikhailo@gmail.com";
    String password = "123456qwerty654321";

    String expectedAlertNameField = "Enter your name";
    String expectedAlertEmailField = "Enter your email";
    String expectedAlertPasswordField = "Enter your password";
    String expectedAlertRePasswordField = "Type your password again";

    String expectedBorderColorEmptyField = "rgb(221, 0, 0)";
    

    @Test
    public  void CreateAccountAllFiledsIsEmpty() throws Exception{


        wait.until(ExpectedConditions.elementToBeClickable(signInLinkLocator));
        driver.findElement(signInLinkLocator).click(); // Click on "sign In" link

        wait.until(ExpectedConditions.elementToBeClickable(createAmazoneAccountLocator));
        driver.findElement(createAmazoneAccountLocator).click(); // Click on "Create your amazone account" button first page

        wait.until(ExpectedConditions.elementToBeClickable(continueCreateAmazoneAccountButtonLocator));
        driver.findElement(continueCreateAmazoneAccountButtonLocator).click(); // Click on "Create your amazone account", all fields are empty

        wait.until(ExpectedConditions.and(
                ExpectedConditions.presenceOfElementLocated(fieldNameLocator),
                ExpectedConditions.presenceOfElementLocated(fieldEmailLocator),
                ExpectedConditions.presenceOfElementLocated(fieldPasswordLocator)
        ));

        WebElement nameField = driver.findElement(fieldNameLocator);
        WebElement emailField = driver.findElement(fieldEmailLocator);
        WebElement passwordField = driver.findElement(fieldPasswordLocator);


        String actualBorderColorNameField = nameField.getCssValue("border-color");
        String actualBorderColorEmailField = emailField.getCssValue("border-color");
        String actualBorderColorPasswordField = passwordField.getCssValue("border-color");

        assertEquals(expectedBorderColorEmptyField, actualBorderColorNameField);  // Checking Name field border color is red
        assertEquals(expectedBorderColorEmptyField, actualBorderColorEmailField);  // Checking Email field border color is red
        assertEquals(expectedBorderColorEmptyField, actualBorderColorPasswordField); // Checking Password field border color is red

        WebElement nameAlert = driver.findElement(textAlertNameFieldLocator);
        WebElement emailAlert = driver.findElement(textAlertEmailFieldLocator);
        WebElement passwordAlert = driver.findElement(textAlertPasswordFieldLocator);

        String actualAlertNameField = nameAlert.getText();
        String actualAlertEmailField = emailAlert.getText();
        String actualAlertPasswordField = passwordAlert.getText();

        assertEquals(expectedAlertNameField, actualAlertNameField);         // Checking alert text below Name field
        assertEquals(expectedAlertEmailField, actualAlertEmailField);       // Checking alert text below Email field
        assertEquals(expectedAlertPasswordField, actualAlertPasswordField); // Checking alert text below Password field

    }

    @Test
    public  void CreateAccountRePasswordIsEmpty() throws Exception{

        wait.until(ExpectedConditions.elementToBeClickable(signInLinkLocator));
        driver.findElement(signInLinkLocator).click(); // Click on "sign In" link

        wait.until(ExpectedConditions.elementToBeClickable(createAmazoneAccountLocator));
        driver.findElement(createAmazoneAccountLocator).click(); // Click on "Create your amazone account" button first page

        wait.until(ExpectedConditions.and(
                ExpectedConditions.elementToBeClickable(fieldNameLocator),
                ExpectedConditions.elementToBeClickable(fieldEmailLocator),
                ExpectedConditions.elementToBeClickable(fieldPasswordLocator),
                ExpectedConditions.presenceOfElementLocated(textAlertRePasswordFieldLocator),
                ExpectedConditions.elementToBeClickable(continueCreateAmazoneAccountButtonLocator)
        ));

        driver.findElement(fieldNameLocator).click();
        driver.findElement(fieldNameLocator).sendKeys(name);

        driver.findElement(fieldEmailLocator).click();
        driver.findElement(fieldEmailLocator).sendKeys(email);

        driver.findElement(fieldPasswordLocator).click();
        driver.findElement(fieldPasswordLocator).sendKeys(password);

        driver.findElement(continueCreateAmazoneAccountButtonLocator).click(); // Click on "Create your amazone account" after filling in fields


        WebElement nameField = driver.findElement(fieldNameLocator);
        WebElement emailField = driver.findElement(fieldEmailLocator);
        WebElement passwordField = driver.findElement(fieldPasswordLocator);
        WebElement rePasswordField = driver.findElement(fieldRePasswordLocator);
        WebElement rePasswordAlert = driver.findElement(textAlertRePasswordFieldLocator);

        String actualBorderColorNameField = nameField.getCssValue("border-color");
        String actualBorderColorEmailField = emailField.getCssValue("border-color");
        String actualBorderColorPasswordField = passwordField.getCssValue("border-color");
        String actualBorderColorRePasswordField = rePasswordField.getCssValue("border-color");
        String actualAlertPasswordField = rePasswordAlert.getText();

        assertNotEquals(expectedBorderColorEmptyField, actualBorderColorNameField);     // Checking Name field border color is NOT red
        assertNotEquals(expectedBorderColorEmptyField, actualBorderColorEmailField);    // Checking Email field border color is NOT red
        assertNotEquals(expectedBorderColorEmptyField, actualBorderColorPasswordField); // Checking Password field border color is NOT red
        assertEquals(expectedBorderColorEmptyField, actualBorderColorRePasswordField);  // Checking Re-Password field border color is red
        assertEquals(expectedAlertRePasswordField, actualAlertPasswordField);           // Checking alert text below Re-Password field

    }
}
