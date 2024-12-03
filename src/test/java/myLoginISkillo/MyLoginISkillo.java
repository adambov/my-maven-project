package myLoginISkillo;

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


public class MyLoginISkillo {
    private final static String BASE_URL = "http://training.skillo-bg.com:4300/";
    private final static String LOGIN_URL = BASE_URL + "users/login";
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void prepareForTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5555);
        driver.quit();
    }

    @Test
    public void verifyWorngCredsMesssage()  {
        driver.get(BASE_URL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement logInButton = driver.findElement(By.xpath("//*[contains(@id, 'nav-link-login')]"));
        logInButton.click();

        wait.until(ExpectedConditions.urlContains("login"));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, LOGIN_URL);

        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username or email']")));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sign-in-button")));
        WebElement rememberMeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        String expectedUsernamePlaceholder = "Username or email";
        String expectedPasswordPlaceholder = "Password";

        Assert.assertEquals(usernameInput.getAttribute("placeholder"), expectedUsernamePlaceholder);
        Assert.assertEquals(passwordInput.getAttribute("placeholder"), expectedPasswordPlaceholder);

            usernameInput.clear();
            passwordInput.clear();
            usernameInput.sendKeys("NaskoDambov");
            passwordInput.sendKeys("Password123");

            rememberMeCheckbox.click();
        signInButton.click();

        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
        Assert.assertTrue(toastMessage.getText().contains("Success"), "Expected success message not found in toast.");

        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nav-link-profile']")));
        String expectedProfileButtonText = "Profile";
        String actualProfileButtonText = profileButton.getText();
        Assert.assertEquals(actualProfileButtonText, expectedProfileButtonText);
    }
}
//1. verify error message
//2. to take the pop-up as element and verify it
//3. to verify the url of the login
