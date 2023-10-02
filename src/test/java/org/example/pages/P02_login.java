package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class P02_login {

    public void loginlink()
    {
            Hooks.driver.findElement(By.className("ico-login")).click();

    }
public void enterEmail_and_Password(String email, String pass){
    Hooks.driver.findElement(By.id("Email")).sendKeys(email);
    Hooks.driver.findElement(By.id("Password")).sendKeys(pass);
}

public void sumbitloign(){


     Hooks.driver.findElement(By.xpath("//div[@class=\"buttons\"]/button[@type=\"submit\"]")).click();
}
    public void enterinvalidEmail_and_Password(String email, String pass){
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
        Hooks.driver.findElement(By.id("Password")).sendKeys(pass);
    }

    SoftAssert softAssert = new SoftAssert();

public void MyaccountTabIsdisapled()
{
    SoftAssert softAssert = new SoftAssert();

   WebElement MyAccountTab = Hooks.driver.findElement(By.className("ico-account"));
  softAssert.assertTrue(MyAccountTab.isDisplayed());

}
public void getCurrentURL()
{

    String url = Hooks.driver.getCurrentUrl();
    softAssert.assertEquals( url,"https://demo.nopcommerce.com/");
softAssert.assertAll();
}

public void errorMsg(){

    SoftAssert softAssert = new SoftAssert();
    WebElement error =Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    softAssert.assertTrue(error.isDisplayed());
    String text =error.getCssValue("color");
    String actualColour = Color.fromString(text).asHex();
    System.out.println("the colour is "+actualColour);
    softAssert.assertTrue(error.getText().contains("Login was unsuccessful."));
            softAssert.assertEquals(actualColour,"#e4434b");
    softAssert.assertAll();
}
}
