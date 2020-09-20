package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(HomePage.class);

    private static By hdrLogin = By.className("example");
    private static By logoutAlert = By.id("flash");
    private static By txtUsername = By.id("username");
    private static By txtPassword = By.id("password");
    private static By btnSubmit = By.className("radius");

    public static void setTxtEmail(String username) {
        getDriver().findElement(txtUsername).sendKeys(username);
    }

    public static void setTxtPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickSubmit() {
        getDriver().findElement(btnSubmit).click();
    }

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(hdrLogin).isDisplayed();
    }

    public static boolean isAlertDisplayed() {
        return getDriver().findElement(logoutAlert).isDisplayed();
    }

    public static String getAlertMessage() {
        return getDriver().findElement(logoutAlert).getText();
    }
}
