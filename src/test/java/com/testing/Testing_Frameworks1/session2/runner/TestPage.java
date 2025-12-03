package com.testing.Testing_Frameworks1.session2.runner;

import java.net.MalformedURLException;
import java.time.Duration;

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

import com.testing.Testing_Frameworks1.session2.utils.EventHandler;

public class TestPage {

    @Test
    public void testLogin() throws MalformedURLException, InterruptedException {

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

        driver.get("https://www.amazon.in/");

        Actions actions = new Actions(driver);

        WebElement elementToHover = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));

        actions.moveToElement(elementToHover).perform();
        WebElement signinButton = driver.findElement(By.xpath("//a[@data-nav-ref='nav_signin']"));
        signinButton.click();
        driver.navigate().back();

        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("Vivo v25");
        searchBar.submit();

        // store the original tab
        String original_window = driver.getWindowHandle();

        WebElement firstProduct = driver
                .findElement(By.xpath("(//div[@role='listitem'])[1]//div[@data-cy='title-recipe']/a"));
        firstProduct.click();

        // Now the search result will be opened in new tab

        Thread.sleep(2000);

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(original_window)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        driver.quit();

    }
}