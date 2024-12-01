package commentAddNotLogged;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommentAddNotLogged {
    private static final String BASE_URL = "http://training.skillo-bg.com:4300/";
    WebDriver driver =new ChromeDriver();

    @BeforeMethod
    public void prepareBrowser(){
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void quitBrowserAfterTest() {
        driver.quit();
    }
    @Test
    public void writeComment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement secondPost = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://i.imgur.com/rJcmbu2.png']")));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", secondPost);
        secondPost.click();

        WebElement commentSecondPost = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Comment here']"))));
        commentSecondPost.sendKeys("Здравейте, Телефона е много хубав, каква му е цената");
        commentSecondPost.sendKeys(Keys.ENTER);
    }
}
