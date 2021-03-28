package com.n11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    WebDriver driver;

    By txtEmail=By.id("email");
    By txtPassword = By.id("password");
    By btnLoginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public HomePage login(String email, String password){
        driver.findElement(txtEmail).sendKeys(email);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLoginButton).click();
        return new HomePage(driver);

    }

}
