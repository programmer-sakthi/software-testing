package com.testing.Selenium_Webdriver.session2.runner;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.testing.Selenium_Webdriver.session2.utils.EventHandler;

import org.openqa.selenium.By;

public class TestSample {

    public static WebDriver driver;

    public static void main(String[] args) {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());

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
            driver.get("https://google.com");

            // Perform any additional actions (e.g., interacting with elements)
            // Example: driver.findElement(By.id("example")).click();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
