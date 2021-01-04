package com.mesaj.app.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageObject {

    final WebDriver driver;

    public SignUpPageObject(WebDriver driver) {
        this.driver = driver;
    }

    final By firstNameTextbox = By.xpath("//input[@ng-model='FirstName']");

    final By lastName = By.xpath("//input[@ng-model='LastName']");

    final By address = By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea");

    final By emailAddress = By.xpath("//input[@type='email']");

    final By phone = By.xpath("//input[@type='tel']");

    final By genderMale = By.xpath("//input[@value='Male']");

    final By genderFemale = By.xpath("//input[@value='Female']");

    final By hobbiesOne = By.xpath("//input[@value='Cricket']");

    final By hobbiesTwo = By.xpath("//input[@value='Movies']");

    final By hobbiesThree = By.xpath("//input[@value='Hockey']");

    final By skill = By.id("Skills");

    final By country = By.id("countries");

    final By dateOfBrithYear = By.id("yearbox");

    final By dateOfBrithMonth = By.xpath("//select[@ng-model='monthbox']");

    final By dateOfBrithDay = By.id("daybox");

    final By password = By.id("firstpassword");

    final By confirmPassword = By.id("secondpassword");

    final By submit = By.id("submitbtn");

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstname){
        this.driver.findElement(this.firstNameTextbox).sendKeys(firstname);
    }

    public void writeLastName(String lastName){
        this.driver.findElement(this.lastName).sendKeys(lastName);
    }

    public void writeAddress(String address){
        this.driver.findElement(this.address).sendKeys(address);
    }

    public void writeEmail(String email){
        this.driver.findElement(this.emailAddress).sendKeys(email);
    }

    public void writePhone(String phone){
        this.driver.findElement(this.phone).sendKeys(phone);
    }

    public void selectMale(){
        this.driver.findElement(this.genderMale).click();
    }

    public void selectFemale(){
        this.driver.findElement(this.genderFemale).click();
    }

    public void selectHobbieOne(){
        this.driver.findElement(this.hobbiesOne).click();
    }

    public void selectHobbieTwo(){
        this.driver.findElement(this.hobbiesTwo).click();
    }

    public void selectHobbiethree(){
        this.driver.findElement(this.hobbiesThree).click();
    }

    public void selectSkill(String skill){
        new Select(this.driver.findElement(this.skill)).selectByValue(skill);
    }

    public void selectCountry(String country){
        new Select(this.driver.findElement(this.country)).selectByValue(country);
    }

    public void selectBirthDay(String day){
        new Select(this.driver.findElement(this.dateOfBrithDay)).selectByValue(day);
    }

    public void selectBirthMonth(String month){
        new Select(this.driver.findElement(this.dateOfBrithMonth)).selectByValue(month);
    }

    public void selectBirthYear(String year){
        new Select(this.driver.findElement(this.dateOfBrithYear)).selectByValue(year);
    }

    public void writePassword(String password){
        this.driver.findElement(this.password).sendKeys(password);
    }

    public void writeConfirmPassword(String password){
        this.driver.findElement(this.confirmPassword).sendKeys(password);
    }

    public void clickOnSubmit(){
        this.driver.findElement(submit).click();
    }

}
