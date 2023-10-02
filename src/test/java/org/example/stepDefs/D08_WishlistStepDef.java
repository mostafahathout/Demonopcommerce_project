package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();
    @Given("User Search products")

    public void userSearchForProducts() {
        homePage.FindProducts();
    }


    @When("user clicks on wish list button")
    public void wishlistButton(){
    homePage.clicksOnWLButton();

}


    @Then("success message is  displayed")
    public void successMessageIsDisplayed() {
homePage.successMsg();
    }

    @And("background color is green")
    public void backgroundColorIsGreen() {
homePage.verifyColor();
    }

    @And("user clicks on wish list tab to check on added items")
    public void userClicksOnWishListTabToCheckOnAddedItems() {
        homePage.wishlistTab();

    }




    @And("User wait to be sure product to add")
    public void userWaitToBeSureProductToAdd() {
        homePage.wishlistTab();

    }

    @And("User go to Wishlist Tab")
    public void userGoToWishlistTab() {
        homePage.GotoWishlist();

    }

    @Then("User make sure about the quantity added")
    public void userMakeSureAboutTheQuantityAdded() throws InterruptedException{
        homePage.AssertQuantity();
        System.out.println("pass");

    }
}


