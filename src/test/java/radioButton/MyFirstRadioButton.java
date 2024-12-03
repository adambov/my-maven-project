package radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyFirstRadioButton {
    private final static String BASE_URL = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @BeforeMethod
    public void preperationBrowser () {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void quitBrowser () throws InterruptedException {
        Thread.sleep(5555);
        driver.quit();
    }
    @Test
    public void automatingRadioButton() throws InterruptedException {
        driver.get(BASE_URL);
        WebElement greenRadioOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='green']")));
        WebElement blueRadioOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='blue']")));
        WebElement yellowRadioOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='yellow']")));

        greenRadioOption.click();
        Assert.assertTrue(greenRadioOption.isSelected());
        Thread.sleep(5555);

        blueRadioOption.click();
        Assert.assertTrue(blueRadioOption.isSelected());
        Thread.sleep(5555);

        yellowRadioOption.click();
        Assert.assertTrue(yellowRadioOption.isSelected());
        Thread.sleep(5555);

    }
}
