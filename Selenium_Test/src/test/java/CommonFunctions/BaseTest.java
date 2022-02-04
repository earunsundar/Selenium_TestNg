package CommonFunctions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;
public class BaseTest {
    public WebDriver driver;

    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }

    @BeforeTest
    public void gotoURL(){
        driver.get("https://google.com");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
