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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US4_Options_UserProfile {


        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://login2.nextbasecrm.com/");

        }

        @Test
        public void options_test1() {
            CRM_Utilities.crm_login(driver, "hr58@cydeo.com", "UserUser");

            WebElement UserTabMenu = driver.findElement(By.id("user-name"));

        /*String expectedUserTabMenu = "Helpdesk59 Cydeo";
        String actualUserTabMenu = UserTabMenu.getText();
         Assert.assertEquals(expectedUserTabMenu, actualUserTabMenu);
         */
            UserTabMenu.click();


            //locate all options
            List<WebElement> allOptions = driver.findElements(By.className("menu-popup-item-text"));
            //4- Print out the number of the options on the page.
            System.out.println("allOptions.size() = " + allOptions.size());

            //returns true if "My Profile" option is displayed under Menu tab
            WebElement myProfileOption = driver.findElement(By.xpath("//span[.='My Profile']"));
            Assert.assertTrue(myProfileOption.isDisplayed());

            //returns true if "Edit My Profile" option is displayed under Menu tab
            WebElement editMyProfSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
            Assert.assertTrue(editMyProfSettings.isDisplayed());

            //returns true if "Themes" option is displayed under Menu tab
            WebElement themesOption = driver.findElement(By.xpath("(//span[.='Themes'])[2]"));
            Assert.assertTrue(themesOption.isDisplayed());

            //returns true if "Configure notifications" option is displayed under Menu tab
            WebElement configureNotificationOption = driver.findElement(By.xpath("(//span[.='Configure notifications'])[2]"));
            Assert.assertTrue(configureNotificationOption.isDisplayed());

            //returns true if "Logout" option is displayed under Menu tab
            WebElement logoutOption = driver.findElement(By.xpath("//span[.='Log out']"));
            Assert.assertTrue(logoutOption.isDisplayed());
        }

        @Test
        public void options_test2() {
            CRM_Utilities.crm_login(driver, "hr59@cydeo.com", "UserUser");

            WebElement UserTabMenu = driver.findElement(By.id("user-name"));

        /*String expectedUserTabMenu = "Helpdesk59 Cydeo";
        String actualUserTabMenu = UserTabMenu.getText();
         Assert.assertEquals(expectedUserTabMenu, actualUserTabMenu);
         */
            UserTabMenu.click();


            //locate all options
            List<WebElement> allOptions = driver.findElements(By.className("menu-popup-item-text"));
            //4- Print out the number of the options on the page.
            System.out.println("allOptions.size() = " + allOptions.size());

            //returns true if "My Profile" option is displayed under Menu tab
            WebElement myProfileOption = driver.findElement(By.xpath("//span[.='My Profile']"));
            Assert.assertTrue(myProfileOption.isDisplayed());

            //returns true if "Edit My Profile" option is displayed under Menu tab
            WebElement editMyProfSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
            Assert.assertTrue(editMyProfSettings.isDisplayed());

            //returns true if "Themes" option is displayed under Menu tab
            WebElement themesOption = driver.findElement(By.xpath("(//span[.='Themes'])[2]"));
            Assert.assertTrue(themesOption.isDisplayed());

            //returns true if "Configure notifications" option is displayed under Menu tab
            WebElement configureNotificationOption = driver.findElement(By.xpath("(//span[.='Configure notifications'])[2]"));
            Assert.assertTrue(configureNotificationOption.isDisplayed());

            //returns true if "Logout" option is displayed under Menu tab
            WebElement logoutOption = driver.findElement(By.xpath("//span[.='Log out']"));
            Assert.assertTrue(logoutOption.isDisplayed());
        }

        @Test
        public void options_test3() {
            CRM_Utilities.crm_login(driver, "marketing58@cydeo.com", "UserUser");

            WebElement UserTabMenu = driver.findElement(By.id("user-name"));

        /*String expectedUserTabMenu = "Helpdesk59 Cydeo";
        String actualUserTabMenu = UserTabMenu.getText();
         Assert.assertEquals(expectedUserTabMenu, actualUserTabMenu);
         */
            UserTabMenu.click();


            //locate all options
            List<WebElement> allOptions = driver.findElements(By.className("menu-popup-item-text"));
            //4- Print out the number of the options on the page.
            System.out.println("allOptions.size() = " + allOptions.size());

            //returns true if "My Profile" option is displayed under Menu tab
            WebElement myProfileOption = driver.findElement(By.xpath("//span[.='My Profile']"));
            Assert.assertTrue(myProfileOption.isDisplayed());

            //returns true if "Edit My Profile" option is displayed under Menu tab
            WebElement editMyProfSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
            Assert.assertTrue(editMyProfSettings.isDisplayed());

            //returns true if "Themes" option is displayed under Menu tab
            WebElement themesOption = driver.findElement(By.xpath("(//span[.='Themes'])[2]"));
            Assert.assertTrue(themesOption.isDisplayed());

            //returns true if "Configure notifications" option is displayed under Menu tab
            WebElement configureNotificationOption = driver.findElement(By.xpath("(//span[.='Configure notifications'])[2]"));
            Assert.assertTrue(configureNotificationOption.isDisplayed());

            //returns true if "Logout" option is displayed under Menu tab
            WebElement logoutOption = driver.findElement(By.xpath("//span[.='Log out']"));
            Assert.assertTrue(logoutOption.isDisplayed());
        }

        @Test
        public void options_test4() {
            CRM_Utilities.crm_login(driver, "marketing59@cydeo.com", "UserUser");

            WebElement UserTabMenu = driver.findElement(By.id("user-name"));

        /*String expectedUserTabMenu = "Helpdesk59 Cydeo";
        String actualUserTabMenu = UserTabMenu.getText();
         Assert.assertEquals(expectedUserTabMenu, actualUserTabMenu);
         */
            UserTabMenu.click();


            //locate all options
            List<WebElement> allOptions = driver.findElements(By.className("menu-popup-item-text"));
            //4- Print out the number of the options on the page.
            System.out.println("allOptions.size() = " + allOptions.size());

            //returns true if "My Profile" option is displayed under Menu tab
            WebElement myProfileOption = driver.findElement(By.xpath("//span[.='My Profile']"));
            Assert.assertTrue(myProfileOption.isDisplayed());

            //returns true if "Edit My Profile" option is displayed under Menu tab
            WebElement editMyProfSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
            Assert.assertTrue(editMyProfSettings.isDisplayed());

            //returns true if "Themes" option is displayed under Menu tab
            WebElement themesOption = driver.findElement(By.xpath("(//span[.='Themes'])[2]"));
            Assert.assertTrue(themesOption.isDisplayed());

            //returns true if "Configure notifications" option is displayed under Menu tab
            WebElement configureNotificationOption = driver.findElement(By.xpath("(//span[.='Configure notifications'])[2]"));
            Assert.assertTrue(configureNotificationOption.isDisplayed());

            //returns true if "Logout" option is displayed under Menu tab
            WebElement logoutOption = driver.findElement(By.xpath("//span[.='Log out']"));
            Assert.assertTrue(logoutOption.isDisplayed());
        }

        @Test
        public void options_test5() {
            CRM_Utilities.crm_login(driver, "helpdesk58@cydeo.com", "UserUser");

            WebElement UserTabMenu = driver.findElement(By.id("user-name"));

        /*String expectedUserTabMenu = "Helpdesk59 Cydeo";
        String actualUserTabMenu = UserTabMenu.getText();
         Assert.assertEquals(expectedUserTabMenu, actualUserTabMenu);
         */
            UserTabMenu.click();


            //locate all options
            List<WebElement> allOptions = driver.findElements(By.className("menu-popup-item-text"));
            //4- Print out the number of the options on the page.
            System.out.println("allOptions.size() = " + allOptions.size());

            //returns true if "My Profile" option is displayed under Menu tab
            WebElement myProfileOption = driver.findElement(By.xpath("//span[.='My Profile']"));
            Assert.assertTrue(myProfileOption.isDisplayed());

            //returns true if "Edit My Profile" option is displayed under Menu tab
            WebElement editMyProfSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
            Assert.assertTrue(editMyProfSettings.isDisplayed());

            //returns true if "Themes" option is displayed under Menu tab
            WebElement themesOption = driver.findElement(By.xpath("(//span[.='Themes'])[2]"));
            Assert.assertTrue(themesOption.isDisplayed());

            //returns true if "Configure notifications" option is displayed under Menu tab
            WebElement configureNotificationOption = driver.findElement(By.xpath("(//span[.='Configure notifications'])[2]"));
            Assert.assertTrue(configureNotificationOption.isDisplayed());

            //returns true if "Logout" option is displayed under Menu tab
            WebElement logoutOption = driver.findElement(By.xpath("//span[.='Log out']"));
            Assert.assertTrue(logoutOption.isDisplayed());
        }

        @Test
        public void options_test6() {
            CRM_Utilities.crm_login(driver, "helpdesk59@cydeo.com", "UserUser");

            WebElement UserTabMenu = driver.findElement(By.id("user-name"));

        /*String expectedUserTabMenu = "Helpdesk59 Cydeo";
        String actualUserTabMenu = UserTabMenu.getText();
         Assert.assertEquals(expectedUserTabMenu, actualUserTabMenu);
         */
            UserTabMenu.click();


            //locate all options
            List<WebElement> allOptions = driver.findElements(By.className("menu-popup-item-text"));
            //4- Print out the number of the options on the page.
            System.out.println("allOptions.size() = " + allOptions.size());

            //returns true if "My Profile" option is displayed under Menu tab
            WebElement myProfileOption = driver.findElement(By.xpath("//span[.='My Profile']"));
            Assert.assertTrue(myProfileOption.isDisplayed());

            //returns true if "Edit My Profile" option is displayed under Menu tab
            WebElement editMyProfSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
            Assert.assertTrue(editMyProfSettings.isDisplayed());

            //returns true if "Themes" option is displayed under Menu tab
            WebElement themesOption = driver.findElement(By.xpath("(//span[.='Themes'])[2]"));
            Assert.assertTrue(themesOption.isDisplayed());

            //returns true if "Configure notifications" option is displayed under Menu tab
            WebElement configureNotificationOption = driver.findElement(By.xpath("(//span[.='Configure notifications'])[2]"));
            Assert.assertTrue(configureNotificationOption.isDisplayed());

            //returns true if "Logout" option is displayed under Menu tab
            WebElement logoutOption = driver.findElement(By.xpath("//span[.='Log out']"));
            Assert.assertTrue(logoutOption.isDisplayed());
        }

        @AfterMethod
        public void tearDownMethod () {
            driver.close();

        }
    }




