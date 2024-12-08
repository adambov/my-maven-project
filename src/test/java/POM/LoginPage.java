package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private static final String Login_PAGE_URL = "users/login";
    String loginFormHeaderTitle_locator = "p.h4";
    String loginFormUserNameInputField_locator = "//input[@id='defaultLoginFormUsername']";
    String loginFormPasswordField_locator = "defaultLoginFormPassword";
    String loginFormRememberMeCheckBox_locator = "//input[@type='checkbox']";
    String loginFormRememberMeCheckBoxLabelText_locator ="//input[contains(@formcontrolname,'rememberMe')]";
    String loginFormLoginFormSubmitButton_locator = "sign-in-button";
    String loginFormLoginFormRegistrationLink_locator = "//a[contains(.,'Register')]";

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void navigateToLoginPage() {
        navigateTo(Login_PAGE_URL);
        System.out.println("The user has navigated ot the Login page");
    }

    public void provideUserName() throws InterruptedException {
        Thread.sleep(4444);
        WebElement userNameInputField = driver.findElement(By.xpath(loginFormUserNameInputField_locator));
        userNameInputField.clear();
        userNameInputField.sendKeys("NaskoDambov");
        System.out.println("The user entered an user name");
    }

    public void providePassword() {
        WebElement passwordField = driver.findElement(By.id(loginFormPasswordField_locator));
        passwordField.clear();
        passwordField.sendKeys("Password123");
        System.out.println("The user entered password");
    }
    public void clickRememberMe() {
        WebElement rememberMe = driver.findElement(By.xpath(loginFormRememberMeCheckBox_locator));
        rememberMe.click();
        System.out.println("The user checked remember me box");
    }
    public void clickSignIn() {
        WebElement signInbutton = driver.findElement(By.id(loginFormLoginFormSubmitButton_locator));
        signInbutton.click();
        System.out.println("The user clicked singin button");
    }
    public void verifySuccessMessage() {
        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
        Assert.assertTrue(toastMessage.getText().contains("Success"), "Expected success message not found in toast.");
        System.out.println("User is logged successfully");
    }
    public void verifyIfOnLoginHomePage() {
        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nav-link-profile']")));
        String expectedProfileButtonText = "Profile";
        String actualProfileButtonText = profileButton.getText();
        Assert.assertEquals(actualProfileButtonText, expectedProfileButtonText);
        System.out.println("User is on home page after login");
    }
}
