package com.mesaj.app.pageobjects.CreateAccountPageObject;

import com.mesaj.app.util.base.PageBase;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ProgramaDeInteresPageObject extends PageBase {

    @Autowired
    public ProgramaDeInteresPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//mat-select[@id='mat-select-0']")
    private WebElement typeInscriptionSelectbox;


}
