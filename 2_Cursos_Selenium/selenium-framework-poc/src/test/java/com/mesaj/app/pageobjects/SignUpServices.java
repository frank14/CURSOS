package com.mesaj.app.pageobjects;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.enums.Hobbie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {

    @Autowired
    private SignUpPageObject signUpPageObject;

    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPageObject.getFirstNameTextbox()));
        this.signUpPageObject.getFirstNameTextbox().sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        this.signUpPageObject.getLastName().sendKeys(lastName);
    }

    public void writeAddress(String address) {
        this.signUpPageObject.getAddress().sendKeys(address);
    }

    public void writeEmail(String email) {
        this.signUpPageObject.getEmailAddress().sendKeys(email);
    }

    public void writePhone(String phone) {
        this.signUpPageObject.getPhone().sendKeys(phone);
    }

    private void selectMale() {
        this.signUpPageObject.getGenderMale().click();
    }

    private void selectFemale() {
        this.signUpPageObject.getGenderFemale().click();
    }

    private void selectHobbieOne() {
        this.signUpPageObject.getHobbiesOne().click();
    }

    private void selectHobbieTwo() {
        this.signUpPageObject.getHobbiesTwo().click();
    }

    private void selectHobbieThree() {
        this.signUpPageObject.getHobbiesThree().click();
    }

    public void selectSkill(String skill) {
        new Select(this.signUpPageObject.getSkill()).selectByValue(skill);
    }

    public void selectCountry(String country) {
        new Select(this.signUpPageObject.getCountry()).selectByValue(country);
    }

    public void selectBirthDay(String day) {
        new Select(this.signUpPageObject.getDateOfBrithDay()).selectByValue(day);
    }

    public void selectBirthMonth(String month) {
        new Select(this.signUpPageObject.getDateOfBrithMonth()).selectByValue(month);
    }

    public void selectBirthYear(String year) {
        new Select(this.signUpPageObject.getDateOfBrithYear()).selectByValue(year);
    }

    public void writePassword(String password) {
        this.signUpPageObject.getPassword().sendKeys(password);
    }

    public void writeConfirmPassword(String password) {
        this.signUpPageObject.getConfirmPassword().sendKeys(password);
    }

    public void clickOnSubmit() {
        this.signUpPageObject.getSubmit().click();
    }

    public void selectGender(Gender gender) {
        if (gender == Gender.female){
            selectFemale();
        } else {
            selectMale();
        }
    }

    public void selectHobbie(Hobbie hobbie) {
        if (hobbie == Hobbie.hockey){
            selectHobbieOne();
        }
        if (hobbie == Hobbie.movies){
            selectHobbieTwo();
        }
        if (hobbie == Hobbie.cricket){
            selectHobbieThree();
        }
    }

}
