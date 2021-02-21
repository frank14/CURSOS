package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeServices {

    @Autowired
    private HomePageObject homePageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void go(String url) {
        this.driver.get(url);
    }

    public void clickOnProfileButton() {
        this.homePageObject.getProfileButton().click();
    }

    public void clickOnLogOutButton() {
        this.homePageObject.getLogOutButton().click();
    }

}
