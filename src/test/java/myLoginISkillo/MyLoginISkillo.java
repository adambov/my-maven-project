package myLoginISkillo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyLoginISkillo {
    private final static String BASE_URL = "http://training.skillo-bg.com:4300/";


    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void prepareForTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @Test
    public void navigateToLoginPAge(){
        driver.get(BASE_URL);

        WebElement logInAnchor = driver.findElement(By.xpath("//*[contains(@id, 'nav-link-login')]"));
        logInAnchor.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username or email']")));
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sign-in-button")));
        WebElement rememberMeCheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));

        String expectedUsernamePlaceholder = "Username or email";
        String expectedPasswordPlaceholder = "Password";

        String actualUsernameInput = usernameInput.getAttribute("placeholder");
        String actualPasswordInput = passwordInput.getAttribute("placeholder");

        Assert.assertEquals(actualUsernameInput, expectedUsernamePlaceholder);
        Assert.assertEquals(actualPasswordInput, expectedPasswordPlaceholder);

        usernameInput.sendKeys("TestUser");
        passwordInput.sendKeys("Password123");
        rememberMeCheckbox.click();

        signInButton.click();

        driver.quit();

    }

}
