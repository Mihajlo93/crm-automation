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

public class US3_SelectLogout {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    @AfterMethod
    public void endMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    //HR
    @Test
    public void logout_Test1() {

        CRM_Utilities.crm_login(driver, "hr58@cydeo.com", "UserUser");

        //Select the dropdown menu
        WebElement profileDropdown = driver.findElement(By.xpath("//div[@id='user-block']"));
        profileDropdown.click();

        //Click the logout button from the dropdown menu
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]"));
        logoutButton.click();

        //Verify the logout screen is the last screen
        WebElement verifyLogout = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[1]"));
        String actualLogout = verifyLogout.getText();
        String expectedLogout = "Authorization";

        Assert.assertEquals(actualLogout, expectedLogout);
    }
    @Test
    public void logout_Test2(){
        CRM_Utilities.crm_login(driver,"hr59@cydeo.com","UserUser");

        //Select the dropdown menu
        WebElement profileDropdown = driver.findElement(By.xpath("//div[@id='user-block']"));
        profileDropdown.click();

        //Click the logout button from the dropdown menu
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]"));
        logoutButton.click();

        //Verify the logout screen is the last screen
        WebElement verifyLogout = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[1]"));
        String actualLogout =verifyLogout.getText();
        String expectedLogout = "Authorization";

        Assert.assertEquals(actualLogout,expectedLogout);
    }

    //Helpdesk
    @Test
    public void logout_Test3(){
        CRM_Utilities.crm_login(driver,"helpdesk58@cydeo.com","UserUser");

        //Select the dropdown menu
        WebElement profileDropdown = driver.findElement(By.xpath("//div[@id='user-block']"));
        profileDropdown.click();

        //Click the logout button from the dropdown menu
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]"));
        logoutButton.click();

        //Verify the logout screen is the last screen
        WebElement verifyLogout = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[1]"));
        String actualLogout =verifyLogout.getText();
        String expectedLogout = "Authorization";

        Assert.assertEquals(actualLogout,expectedLogout);
    }
    @Test
    public void logout_Test4(){
        CRM_Utilities.crm_login(driver,"helpdesk59@cydeo.com","UserUser");

        //Select the dropdown menu
        WebElement profileDropdown = driver.findElement(By.xpath("//div[@id='user-block']"));
        profileDropdown.click();

        //Click the logout button from the dropdown menu
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]"));
        logoutButton.click();

        //Verify the logout screen is the last screen
        WebElement verifyLogout = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[1]"));
        String actualLogout =verifyLogout.getText();
        String expectedLogout = "Authorization";

        Assert.assertEquals(actualLogout,expectedLogout);
    }

    //Marketing
    @Test
    public void logout_Test5(){
        CRM_Utilities.crm_login(driver,"marketing58@cydeo.com","UserUser");

        //Select the dropdown menu
        WebElement profileDropdown = driver.findElement(By.xpath("//div[@id='user-block']"));
        profileDropdown.click();

        //Click the logout button from the dropdown menu
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]"));
        logoutButton.click();

        //Verify the logout screen is the last screen
        WebElement verifyLogout = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[1]"));
        String actualLogout =verifyLogout.getText();
        String expectedLogout = "Authorization";

        Assert.assertEquals(actualLogout,expectedLogout);
    }
    @Test
    public void logout_Test6(){
        CRM_Utilities.crm_login(driver,"marketing59@cydeo.com","UserUser");

        //Select the dropdown menu
        WebElement profileDropdown = driver.findElement(By.xpath("//div[@id='user-block']"));
        profileDropdown.click();

        //Click the logout button from the dropdown menu
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]"));
        logoutButton.click();

        //Verify the logout screen is the last screen
        WebElement verifyLogout = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/div[1]"));
        String actualLogout =verifyLogout.getText();
        String expectedLogout = "Authorization";

        Assert.assertEquals(actualLogout,expectedLogout);
    }
}
