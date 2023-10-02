package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;

public class D03_currenciesStepDef
{
    P03_homePage homePage = new P03_homePage();
    @Given("Select Euro currency from the dropdown list on the top left of home page")
    public void changeCurrency(){
        homePage.selectCurrency("Euro");
    }

    @Then("verify Euro Symbol is shown on the products displayed in Home page")
    public void verifyEuroSymbolIsShownOnTheProductsDisplayedInHomePage() {
        homePage.checkOnCurrency();
//        homePage.products();
    }
}

