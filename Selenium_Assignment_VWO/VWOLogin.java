package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VWOLogin {

    WebDriver driver;
    ChromeOptions options;

    @BeforeSuite
    public void setUp() {
        options = new ChromeOptions();
        driver = new ChromeDriver();

    }

    @Test
    public void validLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.name("username")).sendKeys("anthonykrese@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("Hockey&05");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/setup/account-setup");
    }

    @AfterSuite
    public void tearDown() {
        //driver.quit();
    }
}
