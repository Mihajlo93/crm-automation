package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US13_MakeAppreciation {

    //    "Scenarios:
//1. Verify users (HR, marketing, Helpdesk) send announcements successfully
//2. Verify users get warning a message without a message body."
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 1. go to login page
        driver.get("https://login2.nextbasecrm.com");
    }

    @Test
    public void send_message() throws InterruptedException {
        // 2-write username HR
        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("hr58@cydeo.com");
        // 3-write password
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");
        // 4-click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

        WebElement moreBtn = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        moreBtn.click();

        WebElement clickAppreciationTab =
                driver.findElement(By.xpath("//div[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[2]/span[2]"));

        clickAppreciationTab.click();


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        Thread.sleep(3000);

        WebElement textMessage = driver.findElement(By.xpath("//body"));
        textMessage.sendKeys("testing hr");

        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        //WebElement sendButton=driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        //sendButton.click();

        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

    }

    @Test
    public void send_empty_message() throws InterruptedException {
        //write username and login
        CRM_Utilities.crm_login(driver, "helpdesk59@cydeo.com", "UserUser");
        //click more button
        WebElement moreBtn = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        moreBtn.click();
        //click appreciation
        WebElement clickAppreciationTab =
                driver.findElement(By.xpath("//div[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[2]/span[2]"));

        clickAppreciationTab.click();


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        Thread.sleep(3000);

        WebElement textMessage = driver.findElement(By.xpath("//body"));
        textMessage.sendKeys(" ");
        driver.switchTo().parentFrame();

        WebElement empty = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        empty.click();

        WebElement warningMessage = driver.findElement(By.xpath("//span[.='The message title is not specified']"));
        Assert.assertEquals(warningMessage.getText(), "The message title is not specified", "The title doesn't match");
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }
}


