package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Examples;
import org.example.pages.P03_homePage;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("In the search Bar, User Search for {string}")
    public void inTheSearchBarUserSearchFor(String item) {

        homePage.searchWord(item);


    }

    @When("User go to home Page and Click on Search Bar")

    public void clickOnSrchBar(){

    }


    @And("User Clicks on Search Bar")
    public void ClickSearchbar() {
        homePage.searchButton();
    }

    @Then("User go to List of {string}")
    public void userGoToListOf(String Examples) {
        homePage.items(Examples);
    }
    @And("User clicks on each {string}")
    public void userClicksOnEach(String item) {

        homePage.clickOnItem();
    }
    @Then("User verify existence for Sku")
    public void userVerifyExistenceForSku() {
        homePage.ContainSku();

    }


}
