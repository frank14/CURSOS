package com.mesaj.app.pageactions;

import com.mesaj.app.pageobjects.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginActions {

    @Autowired
    private LoginPageObject loginPageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeUserName(String username) {
        this.wait.until(ExpectedConditions.visibilityOf(this.loginPageObject.getUsernameTextbox()));
        this.loginPageObject.getUsernameTextbox().sendKeys(username);
    }

    public void writePassword(String password) {
        this.wait.until(ExpectedConditions.visibilityOf(this.loginPageObject.getPasswordTextbox()));
        this.loginPageObject.getPasswordTextbox().sendKeys(password);
    }

    public void clickOnSubmit() {
        this.loginPageObject.getSubmit().click();
    }

}
