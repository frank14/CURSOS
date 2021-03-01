package com.mesaj.app.pageobjects;

import com.mesaj.app.util.base.PageBase;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class LoginPageObject extends PageBase {

    @Autowired
    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@formcontrolname='username']")
    private WebElement usernameTextbox;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//button[@class='btn roboto-ligth buttons-login' and contains(., 'Entrar')]")
    private WebElement submit;

    @FindBy(xpath = "//button[@class='btn roboto-ligth buttons-login' and contains(., 'Inscribirse')]")
    private WebElement register;

}
