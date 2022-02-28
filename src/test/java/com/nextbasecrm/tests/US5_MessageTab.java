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

public class US5_MessageTab {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    @Test
    public void US5_verifyingSendMessageFunctionality() throws InterruptedException {

        //Login to the homepage
        CRM_Utilities.crm_login(driver, "hr58@cydeo.com","UserUser");

        //Users are on the homepage
        //Users click MESSAGE tab
        driver.findElement(By.xpath("//span[@id = 'feed-add-post-form-tab-message']/span")).click();

        //driver switch to iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'bx-editor-iframe']")));
        //Users write test message
        WebElement textInputBox = driver.findElement(By.xpath("//body[@style = 'min-height: 134px;']"));
        textInputBox.sendKeys("Lorem ipsum");

        //driver switch to parent frame
        driver.switchTo().parentFrame();
        //Users click the SEND button
        driver.findElement(By.xpath("//div[@class = 'feed-buttons-block']//button[@id = 'blog-submit-button-save']")).click();

        //Verify the message is displayed on the feed

        Thread.sleep(5000);

        WebElement messageText = driver.findElement(By.xpath("//div[@class = 'feed-post-text-block']//div[@class = ' feed-post-contentview feed-post-text-block-inner']/div"));
        System.out.println("messageText = " + messageText.getText());


        Assert.assertTrue(messageText.isDisplayed(), "Text is not displayed");


    }

    @Test
    public void messageTitleNotSpecified() {

        //Login to the homepage
        CRM_Utilities.crm_login(driver, "hr58@cydeo.com","UserUser");

        //Users are on the homepage
        //Users click MESSAGE tab
        driver.findElement(By.xpath("//span[@id = 'feed-add-post-form-tab-message']/span")).click();

        //Users click SEND button
        driver.findElement(By.xpath("//div[@class = 'feed-buttons-block']//button[@id = 'blog-submit-button-save']")).click();

        //Verify “The message title is not specified” warning message is displayed on the page
        WebElement titleNotSpecifiedMessage = driver.findElement(By.xpath("//span[@class = 'feed-add-info-text']"));
        Assert.assertEquals(titleNotSpecifiedMessage.getText(), "The message title is not specified", "The title does not match");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}

