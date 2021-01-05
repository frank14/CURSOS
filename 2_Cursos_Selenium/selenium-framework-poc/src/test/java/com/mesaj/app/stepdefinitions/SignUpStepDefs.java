package com.mesaj.app.stepdefinitions;

import com.mesaj.app.pageobjects.SignUpPageObject;
import com.mesaj.app.pageobjects.SignUpServices;
import com.mesaj.app.util.RandomEmailGenerator;
import com.mesaj.app.util.RandomNumberGenerator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefs {

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/windows/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        SignUpServices signUpPageObject = new SignUpServices(driver);
        signUpPageObject.go("http://demo.automationtesting.in/Register.html");
        signUpPageObject.writeFirstName("Francisco");
        signUpPageObject.writeLastName("Cabezas");
        signUpPageObject.writeAddress("Barrio nuevo bosque conjunto residencia nuevo bosque casa 9C");
        signUpPageObject.writeEmail(RandomEmailGenerator.get());
        signUpPageObject.writePhone(RandomNumberGenerator.get());
        signUpPageObject.selectMale();
        signUpPageObject.selectHobbieOne();
        signUpPageObject.selectHobbiethree();
        signUpPageObject.selectSkill("SQL");
        signUpPageObject.selectCountry("Colombia");
        signUpPageObject.selectBirthDay("14");
        signUpPageObject.selectBirthMonth("January");
        signUpPageObject.selectBirthYear("1994");
        signUpPageObject.writePassword("P@ssw0rd");
        signUpPageObject.writeConfirmPassword("P@ssw0rd");

        signUpPageObject.clickOnSubmit();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }

    @When("^He sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("^He should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }

}
