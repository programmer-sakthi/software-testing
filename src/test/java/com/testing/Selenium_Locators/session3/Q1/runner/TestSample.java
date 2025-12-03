package com.testing.Selenium_Locators.session3.Q1.runner;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.Selenium_Locators.session3.Q1.utils.EventHandler;

public class TestSample {

    public static WebDriver driver;

    @Test
    public static void main(String[] args) {
        try {
            driver = new ChromeDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            // Add the implicit wait
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

            // Add the page load timeout
            driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));

            // Initialize the event listener
            WebDriverListener listener = new EventHandler();
            driver = new EventFiringDecorator<>(listener).decorate(driver);

            // Start your script from here
            driver.get("https://www.insurancedekho.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement renew = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class='navigator']/ul/li/a[@title='Renew']")));

            renew.click();

            WebElement mobileInputElement = driver.findElement(By.xpath("//input[@name='mobileNumber']"));

            mobileInputElement.sendKeys("9876543210");

            WebElement continueElement = driver.findElement(By.xpath("//button/span[contains(text() , 'Continue')]"));
            continueElement.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
