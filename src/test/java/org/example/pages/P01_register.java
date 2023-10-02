package org.example.pages;

import org.asynchttpclient.util.Assertions;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public void selectGender(){

        Hooks.driver.findElement(By.id("gender-male")).click();
    }
    public  void entersFirstName(String firstname,String lastname){

        Hooks.driver.findElement(By.id("FirstName")).sendKeys(firstname);
        Hooks.driver.findElement(By.id("LastName")).sendKeys(lastname);

    }

//    public void BirthDate(String day , String month , String year){
//        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
//        select.selectByValue(day);
//        Select select2 = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
//        select.selectByValue(month);
//        Select select3 = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
//        select.selectByValue(year);
//    }

    public void Bithday (String day){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        select.selectByValue(day);
    }
    public void BirthMonth (String month){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByValue(month);
    }
    public void BirthYear (String year){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByValue(year);

    }
    public void enterEmail(String email){
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
    }
    public void enterPassword(String pass){

        Hooks.driver.findElement(By.id("Password")).sendKeys(pass);
    }

    public void enterPassword2(String pass2){

        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(pass2);
    }

    public void enterRegister(){

        Hooks.driver.findElement(By.id("register-button")).click();
    }

    public void registerCompleted(){
        SoftAssert softAssert = new SoftAssert();
       WebElement rigisterd =Hooks.driver.findElement(By.className("result"));
       softAssert.assertTrue(rigisterd.isDisplayed());
        String text =rigisterd.getCssValue("color");
        String actualColour = Color.fromString(text).asRgba();
        System.out.println("the colour is "+actualColour);
        softAssert.assertEquals(actualColour,"rgba(76, 177, 124, 1)");
        softAssert.assertAll();



    }

}
