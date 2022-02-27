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
    public void login_with_valid_credentials_with_login_btn() {
        // username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        //  password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("UserUser");
        // click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
        //  verify title
        String expectedTitle = "Portal";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
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


