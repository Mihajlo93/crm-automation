package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OptionsUnderMoreTab {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");

    }

    @Test
    public void MoreTab_Test1(){
        CRM_Utilities.crm_login(driver,"hr58@cydeo.com","UserUser");


        WebElement MoreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        MoreTab.click();

        System.out.println("MORE Tab is Displayed on homepage = " + MoreTab.isDisplayed());


    }

    @Test
    public void MoreTabOptionFile_Test2(){
        CRM_Utilities.crm_login(driver,"hr59@cydeo.com","UserUser");
        WebElement MoreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        MoreTab.click();

        WebElement optionFile = driver.findElement(By.xpath("//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-file feed-add-post-form-file-more ']"));
        optionFile.click();

        System.out.println("Option File is displayed under MORE tab = " + optionFile.isDisplayed());
    }


    @Test
    public void MoreTabOptionAppreciation_Test3(){
        CRM_Utilities.crm_login(driver,"helpdesk58@cydeo.com","UserUser");
        WebElement MoreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        MoreTab.click();

        WebElement optionAppreciation = driver.findElement(By.xpath("//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-grat feed-add-post-form-grat-more ']"));
        optionAppreciation.click();

        System.out.println("Option Appreciation is displayed under MORE tab = " + optionAppreciation.isDisplayed());
    }

    @Test
    public void MoreTabOptionAnnouncement_Test4(){
        CRM_Utilities.crm_login(driver,"helpdesk59@cydeo.com","UserUser");
        WebElement MoreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        MoreTab.click();

        WebElement optionAnnouncement = driver.findElement(By.xpath("//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-important feed-add-post-form-important-more ']"));
        optionAnnouncement.click();

        System.out.println("Option Announcement is displayed under MORE tab = " + optionAnnouncement.isDisplayed());

    }

    @Test
    public void MoreTabOptionWorkflow_Test5(){
        CRM_Utilities.crm_login(driver,"helpdesk59@cydeo.com","UserUser");
        WebElement MoreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        MoreTab.click();

        WebElement optionWorkflow = driver.findElement(By.xpath("//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-lists feed-add-post-form-lists-more ']"));
        optionWorkflow.click();

        System.out.println("Option Workflow is displayed under MORE tab = " + optionWorkflow.isDisplayed());


    }


    @AfterMethod
    public void quit(){
        driver.quit();
    }






}

