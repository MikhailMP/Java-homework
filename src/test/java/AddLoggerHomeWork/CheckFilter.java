package test.java.AddLoggerHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.PO.HomePage;
import test.java.PO.SearchResultPage;
import test.java.TestBaseSetup;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class CheckFilter extends TestBaseSetup {
    String laptop = "laptop";
    //String brand = "HP";
    HomePage homePage;
    SearchResultPage searchResultPage;

    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage(driver);
        homePage.openPage();
        searchResultPage = new SearchResultPage(driver);
    }

    @Test (dataProvider = "DProvider")
    public void checkLaptopBrand(String brand, By locator) {
        homePage.clickSearchField();
        homePage.fillDataToSearchField(laptop);
        homePage.clickSearchButton();

        searchResultPage.tickSeeMoreBrand();
        searchResultPage.chooseCheckBoxBrand(locator);

        for(WebElement res: searchResultPage.getElementList()){
            assertTrue(res.getText().toLowerCase().contains(brand.toLowerCase()));
        }

    }

    @DataProvider
    public  Object [][] DProvider(){
        return new Object[][]{
                {"HP",By.xpath("//li[@id= 'p_89/HP']//span")}
//                {"Acer", By.xpath("//li[@id= 'p_89/Acer']//span")},
//                {"Lenovo", By.xpath("//li[@id= 'p_89/Lenovo']//span")},
//                {"ASUS", By.xpath("//li[@id= 'p_89/ASUS']//span")},
//                {"Dell" , By.xpath("//li[@id= 'p_89/Dell']//span")},
//                {"Microsoft", By.xpath("//li[@id= 'p_89/Microsoft']//span")},
//                {"Apple", By.xpath("//li[@id= 'p_89/Apple']//span")},
//                {"CHUWI", By.xpath("//li[@id= 'p_89/CHUWI']//span")},
//                {"Samsung", By.xpath("//li[@id= 'p_89/Samsung Electronics']//span")},
//                {"MSI", By.xpath("//li[@id= 'p_89/MSI']//span")}
        };
    }
}
