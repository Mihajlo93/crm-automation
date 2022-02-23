package com.nextbasecrm.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CRM_Utilities {

    public static void crm_login(WebDriver driver, String username, String password){
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);
        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);
        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
    }

    public static void crm_login_AllEmails(WebDriver driver){
        String [] emailList = {"hr58@cydeo.com"	, "helpdesk58@cydeo.com", "marketing58@cydeo.com", "hr59@cydeo.com", "helpdesk59@cydeo.com",
                "marketing59@cydeo.com", "hr60@cydeo.com", "helpdesk60@cydeo.com", "marketing60@cydeo.com"};
        
        String password = "UserUser";

        for (String eachEmail : emailList) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://login2.nextbasecrm.com/");

            WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            inputUsername.sendKeys(eachEmail);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //4. Enter valid password
            WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            inputPassword.sendKeys(password);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //5. Click to Log In button
            WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
            loginButton.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
