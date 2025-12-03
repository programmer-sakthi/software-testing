package com.testing.Selenium_WebElement.session1.runner;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.Test;

import com.testing.Selenium_WebElement.session1.utils.EventHandler;

public class TestPage {

    @Test
    public void testLogin() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        driver.quit();

    }
}