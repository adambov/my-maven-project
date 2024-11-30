package registrationForm;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

        WebElement notAMember = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='color-black']")));
        String actualNotAMember = notAMember.getText();
        Assert.assertEquals(actualNotAMember,"Not a member?");

        WebElement registerAnchor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Register']")));
        registerAnchor.click();

        WebElement usernameRegFormInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement emailRegFormInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='email']")));
        WebElement birthDateRegFormInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Birth date']")));
        WebElement passwordRegFormInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        WebElement confirmPasswordRegFormInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Confirm Password']")));
        WebElement publicInfoRegForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Public info']")));
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='sign-in-button']")));

        boolean isDisabled = signInButton.getAttribute("disabled") != null;

        Assert.assertTrue(isDisabled);

        usernameRegFormInput.sendKeys("NaskoDambov");
        emailRegFormInput.sendKeys("atanas.dambov@gmail.com");
        birthDateRegFormInput.sendKeys("1997-12-16");
        passwordRegFormInput.sendKeys("Password123");
        confirmPasswordRegFormInput.sendKeys("Password123");
        publicInfoRegForm.sendKeys("Hello, It's me :)");

        boolean isEnabled = signInButton.getAttribute("disabled") == null;
        Assert.assertTrue(isEnabled);

        signInButton.click();

        Thread.sleep(5555);
        driver.quit();
    }
}
