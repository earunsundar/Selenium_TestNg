package TestCases;

import CommonFunctions.BaseTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestCase_1 extends BaseTest {

@Test (priority = 1)
    public  void verifyGoogleSearchButton() throws InterruptedException {

    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.className("gLFyf")).sendKeys("Java");
    Thread.sleep(3000);
    List<WebElement> list = driver.findElements(By.className("wM6W7d"));

    System.out.println("total number of suggestions in search box:::===>" + list.size());

    for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i).getText());
        if(list.get(i).getText().contains("java tutorial")){
            list.get(i).click();
            break;
        }
       // Thread.sleep(2000);


    }
    Thread.sleep(2000);
}

}
