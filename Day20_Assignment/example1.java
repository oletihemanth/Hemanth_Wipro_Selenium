package Day20_Assignment;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class example1 {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();  
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    @Test(priority = 1)
    public void buttonClicksTest() {
        driver.get("https://demoqa.com/buttons");

        // Double Click
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickBtn).perform();
        String doubleClickMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("doubleClickMessage"))).getText();
        System.out.println("✅ Double Click Message: " + doubleClickMsg);

        // Right Click
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
        String rightClickMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rightClickMessage"))).getText();
        System.out.println("✅ Right Click Message: " + rightClickMsg);

        // Single Click
        WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMeBtn).perform();
        String dynamicClickMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicClickMessage"))).getText();
        System.out.println("✅ Single Click Message: " + dynamicClickMsg);

        // Assertions
        Assert.assertTrue(doubleClickMsg.contains("You have done a double click"));
        Assert.assertTrue(rightClickMsg.contains("You have done a right click"));
        Assert.assertTrue(dynamicClickMsg.contains("You have done a dynamic click"));
    }

    @Test(priority = 2)
    public void dragAndDropTest() {
        driver.get("https://demoqa.com/dragabble");

        WebElement draggable = driver.findElement(By.id("dragBox"));
        actions.dragAndDropBy(draggable, 100, 50).perform(); 
        System.out.println(" Dragged the element successfully!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

