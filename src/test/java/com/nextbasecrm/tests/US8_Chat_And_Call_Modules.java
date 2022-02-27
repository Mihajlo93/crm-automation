package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US8_Chat_And_Call_Modules {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }


    @Test
    public void chat_and_call_modules_test1() {
        CRM_Utilities.crm_login(driver, "hr58@cydeo.com", "UserUser");

        WebElement chatAndCalls = driver.findElement(By.xpath("(//span[@data-role='item-text'])[3]"));
        chatAndCalls.click();

        WebElement messagesModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        //System.out.println("Messages module is displayed = " + messagesModule.isDisplayed());
        Assert.assertTrue(messagesModule.isDisplayed());

        WebElement notificationModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']"));
        Assert.assertTrue(notificationModule.isDisplayed());

        WebElement settingsModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']"));
        Assert.assertTrue(settingsModule.isDisplayed());

        WebElement activityStreamModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']"));
        Assert.assertTrue(activityStreamModule.isDisplayed());

    }


    @Test
    public void chat_and_call_modules_test2() {
        CRM_Utilities.crm_login(driver, "hr59@cydeo.com", "UserUser");

        WebElement chatAndCalls = driver.findElement(By.xpath("(//span[@data-role='item-text'])[3]"));
        chatAndCalls.click();

        WebElement messagesModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        //System.out.println("Messages module is displayed = " + messagesModule.isDisplayed());
        Assert.assertTrue(messagesModule.isDisplayed());

        WebElement notificationModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']"));
        Assert.assertTrue(notificationModule.isDisplayed());

        WebElement settingsModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']"));
        Assert.assertTrue(settingsModule.isDisplayed());

        WebElement activityStreamModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']"));
        Assert.assertTrue(activityStreamModule.isDisplayed());

    }

    @Test
    public void chat_and_call_modules_test3() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement chatAndCalls = driver.findElement(By.xpath("(//span[@data-role='item-text'])[3]"));
        chatAndCalls.click();

        WebElement messagesModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        //System.out.println("Messages module is displayed = " + messagesModule.isDisplayed());
        Assert.assertTrue(messagesModule.isDisplayed());

        WebElement notificationModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']"));
        Assert.assertTrue(notificationModule.isDisplayed());

        WebElement settingsModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']"));
        Assert.assertTrue(settingsModule.isDisplayed());

        WebElement activityStreamModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']"));
        Assert.assertTrue(activityStreamModule.isDisplayed());
    }


    @Test
    public void chat_and_call_modules_test4() {
        CRM_Utilities.crm_login(driver, "marketing59@cydeo.com", "UserUser");

        WebElement chatAndCalls = driver.findElement(By.xpath("(//span[@data-role='item-text'])[3]"));
        chatAndCalls.click();

        WebElement messagesModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        //System.out.println("Messages module is displayed = " + messagesModule.isDisplayed());
        Assert.assertTrue(messagesModule.isDisplayed());

        WebElement notificationModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']"));
        Assert.assertTrue(notificationModule.isDisplayed());

        WebElement settingsModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']"));
        Assert.assertTrue(settingsModule.isDisplayed());

        WebElement activityStreamModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']"));
        Assert.assertTrue(activityStreamModule.isDisplayed());

    }

    @Test
    public void chat_and_call_modules_test5() {
        CRM_Utilities.crm_login(driver, "helpdesk58@cydeo.com", "UserUser");

        WebElement chatAndCalls = driver.findElement(By.xpath("(//span[@data-role='item-text'])[3]"));
        chatAndCalls.click();

        WebElement messagesModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        //System.out.println("Messages module is displayed = " + messagesModule.isDisplayed());
        Assert.assertTrue(messagesModule.isDisplayed());

        WebElement notificationModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']"));
        Assert.assertTrue(notificationModule.isDisplayed());

        WebElement settingsModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']"));
        Assert.assertTrue(settingsModule.isDisplayed());

        WebElement activityStreamModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']"));
        Assert.assertTrue(activityStreamModule.isDisplayed());

    }

    @Test
    public void chat_and_call_modules_test6() {
        CRM_Utilities.crm_login(driver, "helpdesk59@cydeo.com", "UserUser");

        WebElement chatAndCalls = driver.findElement(By.xpath("(//span[@data-role='item-text'])[3]"));
        chatAndCalls.click();

        WebElement messagesModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        //System.out.println("Messages module is displayed = " + messagesModule.isDisplayed());
        Assert.assertTrue(messagesModule.isDisplayed());

        WebElement notificationModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']"));
        Assert.assertTrue(notificationModule.isDisplayed());

        WebElement settingsModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']"));
        Assert.assertTrue(settingsModule.isDisplayed());

        WebElement activityStreamModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']"));
        Assert.assertTrue(activityStreamModule.isDisplayed());

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}

/* @Test
    public void test() {
        CRM_Utilities.crm_login_AllEmails(driver);

        WebElement chatAndCalls = driver.findElement(By.cssSelector("a[title=\"Chat and Calls\"]"));
        chatAndCalls.click();

        WebElement messagesModule = driver.findElement(By.xpath("//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']"));
        //System.out.println("Messages module is displayed = " + messagesModule.isDisplayed());
        Assert.assertTrue(messagesModule.isDisplayed());

    }*/



