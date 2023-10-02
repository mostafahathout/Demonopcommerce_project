package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void loginPage(){

        login.loginlink();
    }


    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {

login.enterEmail_and_Password("test4@example.com","P@ssw0rd");
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.sumbitloign();
    }


    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
login.MyaccountTabIsdisapled();
        login.getCurrentURL();


    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1) {
        login.enterinvalidEmail_and_Password("test41@example.com","P@ssw0rd");

    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

login.errorMsg();

    }
}
