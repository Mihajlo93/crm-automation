package com.nextbasecrm.tests;


import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US11_AccessProfilePage {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }
    @Test
    public void myProfile(){
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("hr22@cydeo.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        driver.findElement(By.xpath("//span[@class='user-img user-default-avatar']")).click();
        WebElement profileTab = driver.findElement(By.xpath("//span[.='My Profile']"));
        profileTab.isDisplayed();
    }
    @Test
    public void verifyModules() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("hr22@cydeo.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='user-img user-default-avatar']")).click();
        WebElement profileTab = driver.findElement(By.xpath("//span[.='My Profile']"));
        profileTab.click();
        Thread.sleep(3000);
        List<WebElement> profileModules = driver.findElements(By.xpath("//span[@class='menu-item-link-text']"));
        System.out.println("profileModules.size() = " + profileModules.size());
        List<String > expectedModules= List.of(new String[]{"General", "Drive", "Tasks", "Calendar", "conversations" });
        Assert.assertEquals(profileModules.size(),expectedModules.size());

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}