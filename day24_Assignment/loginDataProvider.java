package Asserts_demo;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class loginDataProvider {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.ebay.com/");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                {"valid_email@gmail.com", "ValidPassword123"}, 
                {"invalid_email@gmail.com", "wrongpass"},      
                {"hemantholeti6@gmail.com", "Hemanth@2002"}    
        };
    }

    @Test(dataProvider = "loginData")
    public void ebayLoginTest(String username, String password) throws InterruptedException {
        try {
            driver.findElement(By.linkText("Sign in")).click();

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")));
            emailField.clear();
            emailField.sendKeys(username);
            driver.findElement(By.id("signin-continue-btn")).click();

            WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
            passField.clear();
            passField.sendKeys(password);
            driver.findElement(By.id("sgnBt")).click();

            
            Thread.sleep(2000);           

        } catch (Exception e) {
            System.out.println("Exception for: " + username + " / " + password + " | " + e.getMessage());
        } finally {
            driver.get("https://www.ebay.com/"); 
        }
    }
}
