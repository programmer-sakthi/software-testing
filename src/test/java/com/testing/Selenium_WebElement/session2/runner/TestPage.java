package com.testing.Selenium_WebElement.session2.runner;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
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
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

        driver.get("https://demo.automationtesting.in/Alerts.html");

        Actions actions = new Actions(driver);

        WebElement elementToHover = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));

        actions.moveToElement(elementToHover).perform();

        WebElement AlertButton = driver.findElement(By.xpath("//ul/li/a[contains(text(),'Alerts')]"));

        AlertButton.click();

        driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
        alert = driver.switchTo().alert();
        alert.dismiss();

        driver.quit();

    }
}