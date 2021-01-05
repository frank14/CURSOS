package com.mesaj.app.stepdefinitions;

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
    public void pepito_wants_to_have_an_account() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/windows/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        SignUpServices signUp = new SignUpServices(driver);
        signUp.go("http://demo.automationtesting.in/Register.html");
        signUp.writeFirstName("Francisco");
        signUp.writeLastName("Cabezas");
        signUp.writeAddress("Barrio nuevo bosque conjunto residencia nuevo bosque casa 9C");
        signUp.writeEmail(RandomEmailGenerator.get());
        signUp.writePhone(RandomNumberGenerator.get());
        signUp.selectMale();
        signUp.selectHobbieOne();
        signUp.selectHobbiethree();
        signUp.selectSkill("SQL");
        signUp.selectCountry("Colombia");
        signUp.selectBirthDay("14");
        signUp.selectBirthMonth("January");
        signUp.selectBirthYear("1994");
        signUp.writePassword("P@ssw0rd");
        signUp.writeConfirmPassword("P@ssw0rd");

        signUp.clickOnSubmit();

        Thread.sleep(10000);
        
        driver.quit();

    }

    @When("^He sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("^He should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }

}
