package com.testing.Testing_Frameworks1.session3.runner;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.Testing_Frameworks1.session3.utils.EventHandler;

public class TestFlipkart {
	public static WebDriver driver;
	public static int IMPLICIT_WAIT_TIME = 10;
	public static int PAGE_LOAD_TIME = 15;

	@BeforeMethod
	public void openBrowser() throws Throwable {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		driver = new RemoteWebDriver(new URL("http://localhost:4444/"), dc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIME));
		// get url
		WebDriverListener listener = new EventHandler();
		driver = new EventFiringDecorator<>(listener).decorate(driver);
		driver.get("https://www.flipkart.com/");
	}

	@Test
	public void test() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Vivo v25");
		search.submit();
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
