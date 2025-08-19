package Day19_Assignment;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class example1 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        WebElement inventory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_list")));
        Assert.assertTrue(inventory.isDisplayed(), " Login failed — inventory not visible");
    }

    @Test(priority = 2)
    public void addToCartTest() throws InterruptedException {
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        addToCartButton.click();
        Thread.sleep(2000);

        WebElement cartBadge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_badge")));
        Assert.assertEquals(cartBadge.getText(), "1", "❌ Cart badge should display '1'");
    }

    @Test(priority = 3)
    public void checkoutTest() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("hemanth");
        driver.findElement(By.id("last-name")).sendKeys("ram");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("finish")).click();

        WebElement confirmationMsg = driver.findElement(By.className("complete-header"));
        Assert.assertEquals(confirmationMsg.getText().trim(), "THANK YOU FOR YOUR ORDER", "Order confirmation missing");
    }

    @Test(priority = 4)
    public void logoutTest() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
        Thread.sleep(2000);
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
        Assert.assertTrue(loginButton.isDisplayed(), "Logout failed — login button not displayed");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

