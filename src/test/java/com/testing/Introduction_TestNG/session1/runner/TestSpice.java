package com.testing.Introduction_TestNG.session1.runner;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.Introduction_TestNG.session1.utils.EventHandler;

public class TestSpice {
    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();

        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);
        driver.get("https://groww.in/");
    }

    @Test(dependsOnMethods = { "test1" })
    public void test1() {
        WebElement loginButton = driver.findElement(By.xpath("//button[span[text()='Login/Sign up']]"));
        loginButton.click();
    }

    @Test
    public void test2() {
        WebElement loginButton = driver.findElement(By.xpath("//button[span[text()='Login/Sign up']]"));
        loginButton.click();
        WebElement titlElement = driver.findElement(By.xpath("//div[@id='lils382InitialLoginScreen']/h1"));
        System.out.println(titlElement.getText());
        Assert.assertEquals(titlElement.getText(), "Welcome to Groww");

    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}