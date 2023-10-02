package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;
import static org.testng.AssertJUnit.assertTrue;

public class P03_homePage {
    public void selectCurrency(String currency) {
        Select select = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        select.selectByVisibleText(currency);
    }


    public void checkOnCurrency() {


        List<WebElement> list = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div"));
        for (int i = 0; i < list.size(); i++) {
            Assert.assertTrue(list.get(i).getText().contains("€"));
            String x = list.get(i).getText();
            System.out.println(x);

        }


    }

    public void searchButton() {

        Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
    }

    public void searchWord(String word) {

        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(word);

    }

    //*[@id="small-search-box-form"]/button
    public void items(String example) {
        String searchWord = "Book";
        String SecondWord = "Laptop";
        String ThirdWord = "Nike";
        List<WebElement> elements = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]"));
        List<String> results = new ArrayList<>();
        for (WebElement element : elements) {
            results.add(element.getText());
        }
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).toLowerCase().contains(searchWord.toLowerCase())) {
                System.out.println("Result " + (i + 1) + " Contains Book");
            }
            if (results.get(i).toLowerCase().contains(SecondWord.toLowerCase())) {
                System.out.println("Result " + (i + 1) + " contains Laptop");
            } else if (results.get(i).toLowerCase().contains(ThirdWord.toLowerCase())) {
                System.out.println("Result " + (i + 1) + " contains nike");
            } else {
                System.out.println("Result " + (i + 1) + " don't contain items");

            }
        }
    }

    public void clickOnItem() {
        Hooks.driver.findElement(By.xpath("//div[@class=\"details\"]//h2[@class=\"product-title\"]//a")).click();
    }

    public void ContainSku() {
        Hooks.driver.findElement(By.className("sku")).isDisplayed();
        System.out.println("sku");
    }

    public void mouseHover() {
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        WebElement menuOption = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));

        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Computers' from Menu");
    }

    public void selectSubmenu() {

        WebElement subMenuOption = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(subMenuOption).perform();
        System.out.println("Done Mouse hover on 'notebooke' from Menu");
    }

    public void clickOnHovered() {
        WebElement selectMenuOption = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));
        selectMenuOption.getText();
        selectMenuOption.click();
        System.out.println("Selected 'Alternative' from Menu");
    }

    public void getPageTitle() {
        WebElement pageTitle = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-title > h1"));
        String title = pageTitle.getText();
        System.out.println("title is " + title);
    }

    public void assetTitle() {
        WebElement pageTitle = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-title > h1"));
        String title = pageTitle.getText();
        Assert.assertTrue(title.contains("Notebooks"));
    }

    public void clicksOnAd1() {


    }

    public void clicksOnFb() {
        Hooks.driver.findElement(By.className("facebook")).click();

    }

    public void verifyFb() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
//        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());


        tabs = new ArrayList<>(driver.getWindowHandles());

    }

    public void clicksOnTwitter() {
        Hooks.driver.findElement(By.className("twitter")).click();

    }

    public void verifyTwiiter() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
//        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());


        tabs = new ArrayList<>(driver.getWindowHandles());

    }

    public void clicksOnRss() {
        Hooks.driver.findElement(By.className("rss")).click();


    }

    public void verifyRss() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
//        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());


        tabs = new ArrayList<>(driver.getWindowHandles());

    }

    public void clicksOnYoutube() {
        Hooks.driver.findElement(By.className("youtube")).click();


    }

    public void verifyYoutube() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());


        tabs = new ArrayList<>(driver.getWindowHandles());

    }

    public void clicksOnWLButton() {

        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();
    }

    public void successMsg() {
        SoftAssert softAssert = new SoftAssert();
        WebElement msg = Hooks.driver.findElement(By.cssSelector("#bar-notification > div > p"));
        softAssert.assertTrue(msg.isDisplayed());
//    String text =error.getCssValue("color");
//    String actualColour  = Color.fromString(text).asHex();
//    System.out.println("the colour is "+actualColour);
//    softAssert.assertTrue(error.getText().contains("Login was unsuccessful."));
//    softAssert.assertEquals(actualColour,"#e4434b");
//    softAssert.assertAll();
////  #bar-notification
    }

    public void verifyColor() {
        SoftAssert softAssert = new SoftAssert();

        WebElement msgColor = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        String textBkgd = msgColor.getCssValue("background-color");
        String bkColor = Color.fromString(textBkgd).asHex();
        System.out.println(textBkgd);
        System.out.println("back ground colour is green and it's code is " + bkColor);
        softAssert.assertEquals(textBkgd, "rgba(75, 176, 122, 1)");
        softAssert.assertEquals(bkColor, "#4bb07a");
        softAssert.assertAll();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
    }

    public void wishlistTab() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        String numOfItems = Hooks.driver.findElement(By.className("wishlist-label")).getAccessibleName();



    }

    public void FindProducts(){
        Hooks.driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]//div[@class=\"item-grid\"]")).getLocation();
    }


    public void waitWishlist() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement successBar = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]"));
        wait.until(ExpectedConditions.invisibilityOf(successBar));
        Thread.sleep(5000);
    }

    public void GotoWishlist() {
        WebElement element = Hooks.driver.findElement(By.className("ico-wishlist"));
        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView();", element);
        Hooks.driver.findElement(By.xpath("//div[@class=\"header-links\"]//ul//li//a[@href=\"/wishlist\"]")).click();
    }

    public void AssertQuantity() throws InterruptedException {
        Thread.sleep(2000);

         WebElement qtyElement = Hooks.driver.findElement(By.className("qty-input")); // Replace By.id("qty") with the appropriate locator for your Qty element

        String qtyString = qtyElement.getAttribute("value"); // Replace getText() with getAttribute(attributeName) or getCssValue(propertyName) if necessary

        int qty = Integer.parseInt(qtyString);
        assertTrue("Qty should be greater than 0", qty > 0);

    }
}
