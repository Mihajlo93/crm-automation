package com.nextbasecrm.tests;


import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US2_Checkbox_Save_Credentials {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("env"));



    }


   @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(700);
        driver.close();
    }


  @Test
    public void login_with_valid_credentials() {
        // username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        //  password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("UserUser");
        // click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

    }


    @Test
    public void CheckboxLabel() {
        // 1.  Checkbox label displayed  “Remember me on this computer”
        WebElement messageReminder = driver.findElement(By.className("login-item-checkbox-label"));
        Assert.assertTrue(messageReminder.isDisplayed(), " NOT displayed.");

        String expectedText = "Remember me on this computer";
        String actualText = messageReminder.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");
        System.out.println("messageReminder.isDisplayed()= " + messageReminder.isDisplayed());
    }

    @Test
    public void verifyUsers() {

        //  scenario: Verify Users are able to check the checkbox
        WebElement checkbox = driver.findElement(By.id("USER_REMEMBER"));
        System.out.println("checkbox.isDisplayed()= " + checkbox.isDisplayed());
        // Click to “checkbox”
        checkbox.click();


    }
}

//Story 2:
//        As a user, I should be able to save my user credential on a computer.
//
//        Acceptance Criteria:
//        1. There should be a Checkbox label displayed
//        2. “Remember me on this computer” should be displayed on the left side of the checkbox label.
//        scenarios :
//        1. Verify Users are able to check the checkbox





