package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseDriver {
    protected WebDriver driver;

    @BeforeMethod(groups = {"SmokeTesting","Regression"})
    @Parameters({"browser"})

    public void BeforeMethod(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/umarekocakurt/Desktop/Selenium-drivers/drivers/chromedriver");
            driver=new ChromeDriver(); // Opennning the chrome
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/umarekocakurt/Desktop/Selenium-drivers/drivers/geckodriver");
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php ");

        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("umarekkurt@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("ASDASD123123");

        WebElement singInButton = driver.findElement(By.id("SubmitLogin"));
        singInButton.click();
        }
}
