package com.testing.Selenium_Locators.session2.Q2.runner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.testing.Selenium_Locators.session1.utils.EventHandler;

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
            // driver.get("");
            driver.navigate().to("https://automationstepbystep.com/demo-quiz-1/");

            WebElement nameElement = driver.findElement(By.id("watuproTakerName1"));
            nameElement.sendKeys("Navanee");

            WebElement startButton = driver.findElement(By.className("watupro-start-quiz"));
            startButton.click();
            WebElement q1Option2 = driver.findElement(
                    By.xpath("//div[@id='question-1']//div[contains(@class,'question-choices')]/div[2]/input"));
            q1Option2.click();
            WebElement q2Option1 = driver.findElement(
                    By.xpath("//div[@id='question-2']//div[contains(@class,'question-choices')]/div[1]/input"));
            q2Option1.click();

            WebElement submitElement = driver.findElement(By.id("action-button"));
            submitElement.click();

            WebElement searchElement = driver.findElement(By.name("s"));
            searchElement.sendKeys("DevOps");
            searchElement.submit();

            WebElement firsElement = driver.findElement(By.xpath("//*[@id='content']/div[2]//a"));
            firsElement.click();

            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println("Exception handled");
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
