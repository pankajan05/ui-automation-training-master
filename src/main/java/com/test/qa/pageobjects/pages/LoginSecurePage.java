package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {
    private static By hdrWelcome = By.className("example");
    private static By loginAlert = By.id("flash-messages");
    private static By loginAlertMessage = By.id("flash");
    private static By btnLogout = By.className("button secondary radius");

    public static boolean isLoginSecurePageDisplayed() {
        return getDriver().findElement(hdrWelcome).isDisplayed();
    }

    public static boolean isLoginAlertDisplayed() {
        return getDriver().findElement(loginAlert).isDisplayed();
    }

    public static boolean isLoginAlertMessageDisplayed() {
        return getDriver().findElement(loginAlertMessage).isDisplayed();
    }

    public static void clickLogout() {
        getDriver().findElement(btnLogout).click();
    }
}
