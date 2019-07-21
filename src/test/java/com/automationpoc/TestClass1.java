package com.automationpoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    public static WebDriver driver;

    @BeforeMethod
    public void launchDriver(){
        System.setProperty("webdriver.chrome.driver","/Users/jadams/GitRepos/baseexample-testautomation/resources/binaries/unix/chromedriver");
        driver  = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

    }

    @Test
    public void Test1(){
        driver.navigate().to("https://www.google.com");
        System.out.println("test 1 title is: " + driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Google");
    }

    @Test
    public void Test2(){
        driver.navigate().to("https://www.google.com");
        System.out.println("test 2 title is: " + driver.getTitle());
    }

    @Test
    public void Test3(){
        driver.navigate().to("https://www.google.com");
        System.out.println("test 3 title is: " + driver.getTitle());
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
