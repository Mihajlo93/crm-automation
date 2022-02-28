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

public class US9AccessAnyModule {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    @Test
    public void activityStream() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement activityStreamModule = driver.findElement(By.xpath("//a[@title='Activity Stream']"));

        String expectedTitle = "Portal";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");


    }

    @Test
    public void Tasks() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement tasksModule = driver.findElement(By.xpath("//a[@title='Tasks']"));
        tasksModule.click();

        String expectedTitle = "Site map";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not Passed");

    }

    @Test
    public void ChatAndCalls() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement chat_and_callsModule = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
        chat_and_callsModule.click();

        String expectedTitle = "Chat and Calls";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");

    }

    @Test
    public void Workgroups() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement workgroupsModule = driver.findElement(By.xpath("//a[@title='Workgroups']"));
        workgroupsModule.click();

        String expectedTitle = "Workgroups and projects";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }

    @Test
    public void Drive() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement driveModule = driver.findElement(By.xpath("//a[@title='Drive']"));
        driveModule.click();

        String expectedTitle = "Site map";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }

    @Test
    public void Calendar() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement calendarModule = driver.findElement(By.xpath("//a[@title='Calendar']"));
        calendarModule.click();

        String expectedTitle = "Site map";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");

    }

    @Test
    public void Mail() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement mailModule = driver.findElement(By.xpath("//a[@title='Mail']"));
        mailModule.click();

        String expectedTitle = "Mailbox Integration";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }

    @Test
    public void ContactCenter() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement contactCenter = driver.findElement(By.xpath("//a[@title='Contact Center']"));
        contactCenter.click();

        String expectedTitle = "Contact Center";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }

    @Test
    public void TimeAndReports() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement timeAndReports= driver.findElement(By.xpath("//a[@title='Time and Reports']"));
        timeAndReports.click();

        String expectedTitle = "Absence Chart";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }



    @Test
    public void Employees() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement employeesModule = driver.findElement(By.xpath("//a[@title='Employees']"));
        employeesModule.click();

        String expectedTitle = "Company Structure";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }


    /*@Test
    public void newport() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement newPortModule = driver.findElement(By.xpath("//a[@title='newport']"));
        newPortModule.click();

        String expectedTitle = "newport";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }

     */

    @Test
    public void Services() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement servicesModule = driver.findElement(By.xpath("//a[@title='Services']"));
        servicesModule.click();

        String expectedTitle = "Meeting Rooms";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");
    }

    @Test
    public void Company() {
        CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

        WebElement companyModule = driver.findElement(By.xpath("//a[@title='Company']"));
        companyModule.click();

        String expectedTitle = "Company";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "Not passed");


    }

    @AfterMethod
    public void quit(){
        driver.quit();

    }
}


