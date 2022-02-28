package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class US1_LoginFunction {

    WebDriver driver;
//    "Scenarios:
//1. Verify the title
//2. Verify Users (HR, marketing, Helpdesk) login successfully
//3. Verify Users see “Incorrect username or password” for the invalid login attempt"

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 1. go to login page
        driver.get("https://login2.nextbasecrm.com");
    }

    @Test
    public void title_test() {
        WebElement title = driver.findElement(By.xpath("//div[.='Authorization']"));

        String expectedTitle = "Authorization";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Wrong title");
    }

    @Test
    public void login_with_valid_credentials() {
        // 2-write username HR
        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("hr58@cydeo.com");
        // 3-write password
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");
        // 4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();


    }

    @Test
    public void login_with_valid_credentials_helpdesk() {
        // 2-write username helpdesk
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys("helpdesk58@cydeo.com");
        // 3-write password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("UserUser");
        // 4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

    }

    @Test
    public void login_with_valid_credentials_marketing() {
        // 2-write username marketing
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys("marketing58@cydeo.com");
        // 3-write password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("UserUser");
        // 4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

    }

    @Test
    public void login_with_valid_username_invalid_password() throws InterruptedException {
        // 2-write valid username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys("helpdesk58@cydeo.com" + Keys.ENTER);
        //  3-write invalid password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("abcd");
        //  4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        Thread.sleep(3);
        loginBtn.click();
        //  5 verify error message
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='errortext']")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }

    // valid username empty password
    @Test
    public void login_with_invalid_username_empty_password() throws InterruptedException {
        // 2-write valid username
        WebElement userName = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userName.sendKeys("hr588@cydeo.com");
        // 3-write invalid password
        WebElement password = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("  ");
        // 4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        Thread.sleep(3);
        loginBtn.click();
        // 5 verify error message
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='errortext']")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }
}