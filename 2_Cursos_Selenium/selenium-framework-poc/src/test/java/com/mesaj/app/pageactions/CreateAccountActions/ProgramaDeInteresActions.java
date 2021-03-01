package com.mesaj.app.pageactions.CreateAccountActions;

import com.mesaj.app.pageobjects.CreateAccountPageObject.ProgramaDeInteresPageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProgramaDeInteresActions {

    @Autowired
    private ProgramaDeInteresPageObject programaDeInteresPageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void go(String url) {
        this.driver.get(url);
    }

    public void clickOnTypeInscriptionSelect() {
        this.programaDeInteresPageObject.getTypeInscriptionSelectbox().sendKeys("a",Keys.ENTER);
    }

}
