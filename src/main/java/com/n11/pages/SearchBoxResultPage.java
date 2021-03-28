package com.n11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBoxResultPage extends BasePage{
    WebDriver driver;
    By titleDescription = By.className("giybi-category-title");

    public SearchBoxResultPage(WebDriver driver) {
        super(driver);
    }



    public String getsearchResult(){
        return driver.findElement(titleDescription).getText();
    }

}
