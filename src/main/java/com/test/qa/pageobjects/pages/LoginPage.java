package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {
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
}
