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

public class Desktop_Options_Homepage {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    //1. There should be 3 options for the desktop version:
    //   - MAC OS
    //   - WINDOWS
    //   - LINUX

    @Test
    public void desktop_option_test1() {
        CRM_Utilities.crm_login(driver, "hr58@cydeo.com", "UserUser");

        WebElement macOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps'])[1]"));
        Assert.assertTrue(macOption.isDisplayed());

        WebElement windowsOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[1]"));
        Assert.assertTrue(windowsOption.isDisplayed());

        WebElement linuxOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[2]"));
        Assert.assertTrue(linuxOption.isDisplayed());

    }

    @Test
    public void desktop_option_test2() {
        CRM_Utilities.crm_login(driver, "hr59@cydeo.com", "UserUser");

        WebElement macOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps'])[1]"));
        Assert.assertTrue(macOption.isDisplayed());

        WebElement windowsOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[1]"));
        Assert.assertTrue(windowsOption.isDisplayed());

        WebElement linuxOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[2]"));
        Assert.assertTrue(linuxOption.isDisplayed());

    }
    @Test
    public void desktop_option_test3() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement macOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps'])[1]"));
        Assert.assertTrue(macOption.isDisplayed());

        WebElement windowsOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[1]"));
        Assert.assertTrue(windowsOption.isDisplayed());

        WebElement linuxOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[2]"));
        Assert.assertTrue(linuxOption.isDisplayed());

    }
    @Test
    public void desktop_option_test4() {
        CRM_Utilities.crm_login(driver, "marketing59@cydeo.com", "UserUser");

        WebElement macOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps'])[1]"));
        Assert.assertTrue(macOption.isDisplayed());

        WebElement windowsOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[1]"));
        Assert.assertTrue(windowsOption.isDisplayed());

        WebElement linuxOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[2]"));
        Assert.assertTrue(linuxOption.isDisplayed());
    }
    @Test
    public void desktop_option_test5() {
        CRM_Utilities.crm_login(driver, "helpdesk58@cydeo.com", "UserUser");

        WebElement macOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps'])[1]"));
        Assert.assertTrue(macOption.isDisplayed());

        WebElement windowsOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[1]"));
        Assert.assertTrue(windowsOption.isDisplayed());

        WebElement linuxOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[2]"));
        Assert.assertTrue(linuxOption.isDisplayed());

    }
    @Test
    public void desktop_option_test6() {
        CRM_Utilities.crm_login(driver, "helpdesk59@cydeo.com", "UserUser");

        WebElement macOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps'])[1]"));
        Assert.assertTrue(macOption.isDisplayed());

        WebElement windowsOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[1]"));
        Assert.assertTrue(windowsOption.isDisplayed());

        WebElement linuxOption = driver.findElement(By.xpath("(//a[@class='b24-app-block-content-apps b24-app-block-separate'])[2]"));
        Assert.assertTrue(linuxOption.isDisplayed());

    }
    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}
