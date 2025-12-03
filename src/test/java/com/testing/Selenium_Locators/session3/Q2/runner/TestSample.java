package com.testing.Selenium_Locators.session3.Q2.runner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.testing.Selenium_Locators.session3.Q2.utils.EventHandler;

public class TestSample {

    public static WebDriver driver;

    @Test
    public static void main(String[] args) {
        try {

            // Maximize the browser window
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

            // Add the implicit wait
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

            // Add the page load timeout
            driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(10));

            // Initialize the event listener
            WebDriverListener listener = new EventHandler();
            driver = new EventFiringDecorator<>(listener).decorate(driver);

            // Start your script from here
            driver.get("https://www.medplusmart.com/");

            // use css selector to select the parmacy option
            driver.findElement(By.cssSelector("div.nav-scroll.d-flex > li:nth-child(1) > a")).click();
            driver.findElement(By.cssSelector("div.nav-scroll.d-flex > li:last-child > a")).click();

           
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
