package test.java.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPage extends BasePage {

    private final By getResultLocator = By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");
    //private final By checkBoxBrandLocator = By.xpath("//ul[@aria-labelledby='p_89-title']//span[@class='a-label a-checkbox-label']");
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
    }


    public List<WebElement> getElementList(){
        wait.until(ExpectedConditions.presenceOfElementLocated(getResultLocator));
        List<WebElement> searchBlock = driver.findElements(getResultLocator);
        return searchBlock;
    }

//    public void chooseCheckBoxBrand(){
//        wait.until(ExpectedConditions.elementToBeClickable(checkBoxBrandLocator));
//        driver.findElement(checkBoxBrandLocator).click();
//    }

    public void chooseCheckBoxBrand(By elementLocatore){
        wait.until(ExpectedConditions.elementToBeClickable(elementLocatore));
        driver.findElement(elementLocatore).click();
    }

    public void tickSeeMoreBrand(){
        wait.until(ExpectedConditions.elementToBeClickable(SeeMoreBrandLocator));
        driver.findElement(SeeMoreBrandLocator).click();
    }

}
