package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHR {

    ChromeOptions options;
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        options = new ChromeOptions();
        driver = new ChromeDriver();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    }

    @Test
    public void validLogin() throws InterruptedException {
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);


        // Navigates to https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

        // Navigates to https://awesomeqa.com/hr/web/index.php/pim/addEmployee

        Thread.sleep(3000);

        driver.findElement(By.name("firstName")).sendKeys("Anthony");
        driver.findElement(By.name("middleName")).sendKeys("Joseph");
        driver.findElement(By.name("lastName")).sendKeys("Krese");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }

    @AfterSuite
    public void tearDown() {
    //driver.quit();
    }

}
