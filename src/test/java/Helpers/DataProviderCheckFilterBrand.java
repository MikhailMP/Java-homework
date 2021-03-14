package test.java.Helpers;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DataProviderCheckFilterBrand {
    @DataProvider(name = "mydata")
    public  Object [][] DProvider(){
        return new Object[][]{

                {"Acer", By.xpath("//li[@id= 'p_89/Acer']//span")},
        };
    }
}
