package test.java.PO;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    private final Logger logger = LogManager.getLogger(HomePage.class);
    private final By searchFieldLocator = By.id("twotabsearchtextbox");
    private final By searchButtonLocator = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        super(driver);
        logger.debug("Initialized Home page");
    }


    public  void openPage(){
        logger.info("Open home page");
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldLocator));
    }

    public void clickSearchField(){
        logger.info("Click on search field");
        driver.findElement(searchFieldLocator).click(); // Click on search field
    }

    public void clickSearchButton(){
        logger.info("Click on search button");
        wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator));
        driver.findElement(searchButtonLocator).click(); // Click on search field button
    }

    public void fillDataToSearchField(String searchCondition){
        logger.info("Add data to search field");
        driver.findElement(searchFieldLocator).sendKeys(searchCondition);
    }
}
