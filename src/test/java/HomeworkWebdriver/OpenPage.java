package test.java.HomeworkWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class OpenPage {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        By linkTodayDeal = By.linkText("Today's Deals");
        ///By buttonTodayDealV2 = By.xpath("//a[text()='Customer Service']");
        By confirmButton = By.cssSelector("span[class='a-button-inner']");
        By priceFirstProduct = By.cssSelector("span[class='gb-font-size-medium inlineBlock unitLineHeight dealPriceText']");

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // open browserin max size

        driver.get("https://www.amazon.com/");
        //Thread.sleep(5000);
        WebElement firstButton = driver.findElement(confirmButton);
        firstButton.click();

        WebElement getTodayLink = driver.findElement(linkTodayDeal);
        getTodayLink.click();

        WebElement getPrice = driver.findElement(priceFirstProduct);
        String price = getPrice.getText();

        String[] array = price.split("-");
        String firstPart = array[0].trim();
        String secondPart = array[1].trim();

        String minimumPrice = firstPart.substring(1, firstPart.length());
        String maximumPrice = secondPart.substring(1, secondPart.length());


        System.out.println("Maximum price: " + maximumPrice + ","  + "\n" + "minimum price: " + minimumPrice);
        driver.quit(); // закроет все вкладки

    }
}
