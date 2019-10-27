package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class SearchPOM extends CommonAPI {

    @FindBy(xpath = "//a[@class='td-desktop-search-show-btn']")
    public static WebElement search;

    public void validateSearchButtonClick() {
        search.click();
        TestLogger.log("Search bar clicked");
    }

    @FindBy(xpath = "//div[@class='td-search-container']//input[@placeholder='Search']")
    public static WebElement searchType;


    public void validateSearchButtonType() {
        searchType.sendKeys("Online Banking");
        Assert.assertEquals(searchType.isDisplayed(), true);
        TestLogger.log("Searched Online Banking");
    }

}
