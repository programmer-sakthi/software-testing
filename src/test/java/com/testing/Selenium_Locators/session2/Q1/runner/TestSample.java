package com.testing.Selenium_Locators.session2.Q1.runner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.testing.Selenium_Locators.session1.utils.EventHandler;

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
            driver.get("https://www.netmeds.com/");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
