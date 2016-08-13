package com.tirebuyer.pages;

import com.tirebuyer.automation.GenericMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

/**
 * Created by divi on 8/9/2016.
 */
public class ResultsPage {

    final WebDriver driver;

    @FindBy(xpath = ("//*[@id='main']//li[@class='active' and text()='Tire Results']"))
    @CacheLookup
    public WebElement results_label;

    @FindBy(xpath =("//*[@id='main']//a[@class='show-detail-btn visible-xs']"))
    @CacheLookup
    public List<WebElement> moreDetails_links;

    public ResultsPage(WebDriver driver)

    {
        this.driver = driver;
    }

    public void clickOnMoreResultsLinkByProductRowNumber(int rownumber)
    {
        ProductPage productpage = PageFactory.initElements(driver, ProductPage.class);
        //((AndroidDriver)driver).scrollTo(moreDetails_links.get(rownumber-1).getText());
      //  System.out.println("SIZE"+moreDetails_links.size());
                GenericMethods.click(moreDetails_links.get(rownumber-1));
        GenericMethods.waitForElementToAppear(driver,productpage.addtoCart_btn);


    }


}
