package test.java.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPage extends BasePage {

    private final By getResultLocator = By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }


    public List<WebElement> getElementList(){
        wait.until(ExpectedConditions.presenceOfElementLocated(getResultLocator));
        List<WebElement> searchBlock = driver.findElements(getResultLocator);
        return searchBlock;
    }
}
