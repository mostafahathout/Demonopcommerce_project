package org.example.stepDefs;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.pages.P01_register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.example.stepDefs.Hooks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;


    @Before
    public static void OpenBrowser() {

         driver = new EdgeDriver();

         driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000); driver.quit(); } }