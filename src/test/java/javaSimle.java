import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class javaSimle {
    private WebDriver driver;
    private final String url = "https://www.google.com/";

//some changes dadad
    @BeforeTest
    public void TestJund() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\IDEA projects\\WebDrivers\\chromedriver97.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }


    @Test(expectedExceptions = NoSuchElementException.class)
    public Point Login(){
        WebElement LoginButton = driver.findElement(By.xpath("someXpath"));
        if (LoginButton.isEnabled()){
            LoginButton.sendKeys("someLoginData");
        }
        else if (LoginButton.isDisplayed()){
            return LoginButton.getLocation();
        }
        else {
            driver.quit();
        }
        return null;
    }

    @Test
    public void CheckLoginTrue(){



        return;
    }
    @Test(enabled = true)
    public void CheckLocatorFunctional(){
        return;

    }
    @Test(alwaysRun = true)
    public void FinishTestExecution(){
        return;
    }
    @AfterMethod
    public void QuitMethod(){
        return;
    }


}
