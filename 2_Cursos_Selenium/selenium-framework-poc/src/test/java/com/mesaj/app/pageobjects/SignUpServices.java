package com.mesaj.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {

    @Autowired
    private SignUpPageObject signUpPageObject;

    private final WebDriver driver;

    @Autowired
    public SignUpServices(WebDriver driver) {
        this.driver = driver;
    }

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstname) {
        this.signUpPageObject.getFirstNameTextbox().sendKeys(firstname);
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

    public void selectMale() {
        this.signUpPageObject.getGenderMale().click();
    }

    public void selectFemale() {
        this.signUpPageObject.getGenderFemale().click();
    }

    public void selectHobbieOne() {
        this.signUpPageObject.getHobbiesOne().click();
    }

    public void selectHobbieTwo() {
        this.signUpPageObject.getHobbiesTwo().click();
    }

    public void selectHobbiethree() {
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

}
