package Asserts_demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DependentTests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.ebay.com/");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

    @Test
    public void login() {
        driver.findElement(By.linkText("Sign in")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid")))
                .sendKeys("hemantholeti6@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")))
                .sendKeys("Hemanth@2002");
        driver.findElement(By.id("sgnBt")).click();

        System.out.println("✅ Login successful");
    }

    @DataProvider(name = "products")
    public Object[][] getProducts() {
        return new Object[][] {
                {"Laptop"},
                {"Shoes"},
                {"Watch"}
        };
    }

    @Test(dependsOnMethods = {"login"}, dataProvider = "products")
    public void searchProduct(String item) {
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
        searchBox.clear();
        searchBox.sendKeys(item, Keys.ENTER);

        Assert.assertTrue(driver.getTitle().toLowerCase().contains(item.toLowerCase()),
                "❌ Search failed for " + item);
        System.out.println("✅ Search successful for: " + item);
    }
    @Test(dependsOnMethods = {"searchProduct"})
    	public void logout() {
    	driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span")).sendKeys(Keys.ENTER);
    	driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[3]/a")).sendKeys(Keys.ENTER);
    }
}
