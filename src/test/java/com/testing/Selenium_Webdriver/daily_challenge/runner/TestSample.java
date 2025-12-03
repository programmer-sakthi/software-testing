package com.testing.Selenium_Webdriver.daily_challenge.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.testing.Selenium_Webdriver.daily_challenge.utils.EventHandler;

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
            driver.get("https://google.com");

            // WebElement searchElement=
            // driver.findElement(org.openqa.selenium.By.name("q"));
            WebElement searchElement = driver.findElement(By.xpath("//textarea[@name='q']"));
            searchElement.sendKeys("Selenium");
            searchElement.submit();

            try {
                Thread.sleep(100000);
            } catch (Exception e) {
                // TODO: handle exception
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
