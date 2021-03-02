package test.java.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private final By searchFieldLocator = By.id("twotabsearchtextbox");
    private final By searchButtonLocator = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public  void openPage(){
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(searchFieldLocator));
    }

    public void clickSearchField(){
        driver.findElement(searchFieldLocator).click(); // Click on search field
    }

    public void clickSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator));
        driver.findElement(searchButtonLocator).click(); // Click on search field button
    }

    public void fillDataToSearchField(String searchCondition){
        driver.findElement(searchFieldLocator).sendKeys(searchCondition);
    }
}
