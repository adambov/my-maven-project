package checkbox;

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

public class MyFirstCheckbox {
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
    public void automateCheckBox () throws InterruptedException {
        driver.get(BASE_URL);

        WebElement checkBox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='option-1']")));
        WebElement checkBox2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='option-2']")));
        WebElement checkBox3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='option-3']")));
        WebElement checkBox4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='option-4']")));

        checkBox1.click();
        checkBox2.click();
        checkBox3.click();
        checkBox4.click();

        boolean ischeckBox1Clicked = checkBox1.isSelected();
        boolean ischeckBox2Clicked = checkBox2.isSelected();
        boolean ischeckBox3Clicked = checkBox3.isSelected();
        boolean ischeckBox4Clicked = checkBox4.isSelected();

        Assert.assertTrue(ischeckBox1Clicked);
        Assert.assertTrue(ischeckBox2Clicked);
        Assert.assertFalse(ischeckBox3Clicked);
        Assert.assertTrue(ischeckBox4Clicked);


        Thread.sleep(5555);

    }

}
