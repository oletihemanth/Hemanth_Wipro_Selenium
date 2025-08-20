package Asserts_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class repeatTest_demo {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.ebay.com/");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(invocationCount = 5)
    public void testLogin() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userid")).sendKeys("hemantholeti6@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys("Hemanth@2002");
        driver.findElement(By.id("sgnBt")).click();

    }
}

