package registrationForm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class RegistrationFormISkillo {
    public static final String BASE_URL = "http://training.skillo-bg.com:4300/";

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void prepareBeforeTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @Test
    public void navigateToRegisterPage() throws java. lang. InterruptedException{
        driver.get(BASE_URL);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement logInAnchor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id, 'nav-link-login')]")));
        logInAnchor.click();

        WebElement registerAnchor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Register']")));
        registerAnchor.click();

        Thread.sleep(5555);
        driver.quit();
    }
}
