package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US10_TaskCreation {
    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod() {
        //Open browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("env"));

        //UserName input
        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));

        //Password input
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //click login button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();
    }

    @Test
    public void test() throws InterruptedException {

        //locating Task button and click on it
        WebElement taskBtn = driver.findElement(By.xpath("(//span[.='Task'])[1]"));
        taskBtn.click();
        //Writing text in Title body
        WebElement titleText = driver.findElement(By.xpath("//input[@data-bx-id='task-edit-title']"));
        titleText.sendKeys("Title");

        Thread.sleep(2000);
        //Switching to another frame, and adding text in body
        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]")));
        WebElement bodyText = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        bodyText.sendKeys("Practice");

        Thread.sleep(2000);

        //Switching to parent Frame
        driver.switchTo().parentFrame();

        //Clicking on the send button
        WebElement sendBtn = driver.findElement(By.xpath("(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]"));
        sendBtn.click();

        //Verifying the if pop-up message is displayed, and comparing the message to expected message
        WebElement verifyPopUpMessage = driver.findElement(By.xpath("//div[.='Task has been created']"));
        Assert.assertEquals(verifyPopUpMessage.getText(), "Task has been created", "No pop-up text");
    }

    @Test
    public void titleMissingWarningMessage(){
        //Locate "TASK" tab and click it
        driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']//span")).click();

        //Locate Message body and input message
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='bx-html-editor-iframe-cnt-lifefeed_task_form']/iframe")));
        WebElement messageBody = driver.findElement(By.xpath("//body"));
        messageBody.sendKeys("Please, finish your TC");
        driver.switchTo().defaultContent();

        //Locate "SEND" button and click it
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

        //Locate ErrorMessage and compare
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='task-message-label error']"));
        String expectedErrorMessage = "The task name is not specified.";
        String actualErrorMessage = errorMessage.getText();

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Messages do not match");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
