package orange;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class CuraHealth {

    ChromeOptions options;
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        options = new ChromeOptions();
        driver = new ChromeDriver();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    }

    @Test
    public void validLogin() {
        // Navigate to Cura Website and click to make an appointment
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.id("btn-make-appointment")).click();

        // Enter username and password
        driver.findElement(By.name("username")).sendKeys("John Doe");
        driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

        // Enter appointment details and submit
        driver.findElement(By.id("txt_visit_date")).sendKeys("31/07/2023");
        WebElement radioButton = driver.findElement(By.id("radio_program_none"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", radioButton);
        driver.findElement(By.id("txt_comment")).sendKeys("Test 123");
        driver.findElement(By.id("btn-book-appointment")).click();

        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        WebElement facility = driver.findElement(By.id("facility"));
        Assert.assertEquals(facility.getText(), "Tokyo CURA Healthcare Center");

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
