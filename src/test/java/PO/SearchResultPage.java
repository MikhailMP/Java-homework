package test.java.PO;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPage extends BasePage {

    private final By getResultLocator = By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");
    protected Logger logger = LogManager.getLogger(SearchResultPage.class);
    private final By SeeMoreBrandLocator = By.cssSelector("a[aria-label='See more, Brand']");

//    private final By checkBoxHPBrandLocator = By.xpath("//li[@id= 'p_89/HP']//span");
//    private final By checkBoxAcerBrandLocator = By.xpath("//li[@id= 'p_89/Acer']//span");
//    private final By checkBoxLenovoBrandLocator = By.xpath("//li[@id= 'p_89/Lenovo']//span");
//    private final By checkBoxAsusBrandLocator = By.xpath("//li[@id= 'p_89/ASUS']//span");
//    private final By checkBoxDellBrandLocator = By.xpath("//li[@id= 'p_89/Dell']//span");
//    private final By checkBoxMicrosoftBrandLocator = By.xpath("//li[@id= 'p_89/Microsoft']//span");
//    private final By checkBoxAppleBrandLocator = By.xpath("//li[@id= 'p_89/Apple']//span");
//    private final By checkBoxCHUWIBrandLocator = By.xpath("//li[@id= 'p_89/CHUWI']//span");
//    private final By checkBoxSamsungBrandLocator = By.xpath("//li[@id= 'p_89/Samsung Electronics']//span");
//    private final By checkBoxMSIBrandLocator = By.xpath("//li[@id= 'p_89/MSI']//span");

    public SearchResultPage(WebDriver driver) {
        super(driver);
        logger.debug("Initialized Search Result page");
    }


    public List<WebElement> getElementList(){
        logger.info("Creating list of elements from search request");
        wait.until(ExpectedConditions.presenceOfElementLocated(getResultLocator));
        List<WebElement> searchBlock = driver.findElements(getResultLocator);

        logger.warn("Warn error");
        return searchBlock;
    }

    public void chooseCheckBoxBrand(By elementLocatore){
        logger.info("Choosing checkBox for laptop`s Brands ");
        wait.until(ExpectedConditions.elementToBeClickable(elementLocatore));
        driver.findElement(elementLocatore).click();
        logger.error("Error error");
    }

    public void tickSeeMoreBrand(){
        logger.info("Tick 'See more' for laptop`s Brands");
        wait.until(ExpectedConditions.elementToBeClickable(SeeMoreBrandLocator));
        driver.findElement(SeeMoreBrandLocator).click();
        logger.fatal("Fatal error");
    }

}
