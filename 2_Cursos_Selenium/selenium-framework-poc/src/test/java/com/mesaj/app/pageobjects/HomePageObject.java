package com.mesaj.app.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class HomePageObject extends PageBase {

    @Autowired
    public HomePageObject(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[@id='kt_quick_user_toggle']")
    private WebElement profileButton;

    @FindBy(xpath = "//a[@class='btn btn-light-primary btn-bold' and contains(., 'Cerrar sesión')]")
    private WebElement logOutButton;

}
