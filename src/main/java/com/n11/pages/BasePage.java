package com.n11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    By searchBox = By.id("searchData");
    By btnSignIn = By.className("btnSignIn");
    By accountTitle = By.className("menuLink user");

    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    public LoginPage getLoginPage() {
        driver.findElement(btnSignIn).click();
        return new LoginPage(driver);
    }

    public String getAccountTitleText() {
        return driver.findElement(accountTitle).getText();
    }

    public void searchToBox(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword + Keys.ENTER);
    }

    public SearchBoxResultPage search(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword + Keys.ENTER);
        return new SearchBoxResultPage(driver);
    }
}
