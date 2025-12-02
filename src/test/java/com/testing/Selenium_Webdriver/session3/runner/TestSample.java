package com.testing.Selenium_Webdriver.session3.runner;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.testing.Selenium_Webdriver.session3.utils.EventHandler;

import org.openqa.selenium.By;

public class TestSample {

    public static WebDriver driver;

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
            driver.get("https://www.wikipedia.org");

            // Perform any additional actions
            driver.findElement(By.name("search")).sendKeys("Selenium softwate");
            driver.findElement(By.name("search")).submit();

            WebElement firstSearchResultLink = driver
                    .findElement(By.xpath("//ul[@class='mw-search-results']/li[1]//a"));
            firstSearchResultLink.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
