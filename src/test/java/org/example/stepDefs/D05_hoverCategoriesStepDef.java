package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
P03_homePage homePage = new P03_homePage();
    @Given("user hover on Computers")
    public void hoverOnCompuer(){
        homePage.mouseHover();
    }


    @When("user hover on notebooks at subMenu")
    public void userHoverOnNotebooksAtSubMenu() {
        homePage.selectSubmenu();

    }

    @And("user get the text of this sub-category and click on it")
    public void userGetTheTextOfThisSubCategoryAndClickOnIt() {
        homePage.clickOnHovered();
    }

    @And("user get text of page title")
    public void userGetTextOfPageTitle() {
        homePage.getPageTitle();
    }

    @Then("user Assert that the sub-category title is \\(equal or contains) Notebookd")
    public void userAssertThatTheSubCategoryTitleIsEqualOrContainsNotenookd() {
        homePage.assetTitle();
    }
}
