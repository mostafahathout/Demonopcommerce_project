package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.example.pages.P01_register;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {

    P01_register register = new P01_register();


    @Given("user go to register page")
    public void goRegisterPage()
    {

register.registerlink().click();


    }

    @And("user select gender type")
    public void userSelectGenderType() {


            register.selectGender();


    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {

        register.entersFirstName("automation","tester");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        register.Bithday("18");
        register.BirthMonth("7");
        register.BirthYear("1995");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
 register.enterEmail("test4@example.com");
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
register.enterPassword("P@ssw0rd");
register.enterPassword2("P@ssw0rd");
    }

    @And("user clicks on register button")
       public void enterRegister(){

    Hooks.driver.findElement(By.id("register-button")).click();
}
    SoftAssert soft = new SoftAssert();


    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
    register.registerCompleted();

    }
}
