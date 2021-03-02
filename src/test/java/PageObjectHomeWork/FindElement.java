package test.java.PageObjectHomeWork;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.PO.HomePage;
import test.java.PO.SearchResultPage;
import test.java.TestBaseSetup;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FindElement extends TestBaseSetup
{
    HomePage homePage;
    SearchResultPage searchResultPage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage(driver);
        homePage.openPage();
        searchResultPage = new SearchResultPage(driver);
    }

        @Test
    public void findIphone(){
            String searchCondition_1 = "iPhone";
            homePage.clickSearchField();
            homePage.fillDataToSearchField(searchCondition_1);
            homePage.clickSearchButton();

            for(WebElement res: searchResultPage.getElementList()){
                assertTrue(res.getText().toLowerCase().contains(searchCondition_1.toLowerCase()));
            }

        }

    @Test
    public void findSamsung(){
        String searchCondition_2 = "Samsung";
        homePage.clickSearchField();
        homePage.fillDataToSearchField(searchCondition_2);
        homePage.clickSearchButton();

        //List<WebElement> searchBlock = searchResultPage.getElementTextBlockResult();

        for(WebElement res: searchResultPage.getElementList()){
            assertTrue(res.getText().toLowerCase().contains(searchCondition_2.toLowerCase()));
        }

    }

    @Test (dataProvider = "DProvider")
    public void findItemWithDataProvider(String searchItem){
        homePage.clickSearchField();
        homePage.fillDataToSearchField(searchItem);

        homePage.clickSearchButton();
        List<WebElement> searchBlock = searchResultPage.getElementList();

        for(WebElement res: searchBlock){
            assertTrue(res.getText().toLowerCase().contains(searchItem.toLowerCase()));
        }

    }
    @DataProvider
    public  Object [][] DProvider(){
        return new Object[][]{
                {"iPhone"},
                {"Samsung"}
        };
    }
}
