package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D07_followUsStepDef {

        P03_homePage homePage = new P03_homePage();
        @Given("user opens facebook link")
       public void clickOnFb(){
homePage.clicksOnFb();

        }


    @Then("fb is opened in new tab")
    public void fbIsOpenedInNewTab() throws InterruptedException{
homePage.verifyFb();
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
            homePage.clicksOnTwitter();
    }

    @Then("Twiiter nopCommerce is opened in new tab")
    public void twiiterNopCommerceIsOpenedInNewTab() {
            homePage.clicksOnRss();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {

            homePage.clicksOnRss();
    }


    @Then("Rss is opened in new tab")
    public void rssIsOpenedInNewTab() {
        homePage.verifyRss();

    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
            homePage.clicksOnYoutube();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
            homePage.verifyYoutube();
    }
}
