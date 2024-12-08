package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class RegistrationPage extends BasePage {
    private static final String REG_PAGE_URL = "users/register";
    String loginFormLoginFormRegistrationLink_locator = "//a[contains(.,'Register')]";
    String userNameField_locator = "//input[@placeholder='Username']";
    String emailInputField_locator = "//input[@placeholder='email']";
    String birthDateField_locator = "//input[@placeholder='Birth date']";
    String passwordFeild_locator = "//input[@placeholder='Password']";
    String confirmPasswordField_locator = "//input[@placeholder='Confirm Password']";
    String publicInfoField_locator = "//textarea[@placeholder='Public info']";
    String signinRegistrationButton_locator = "//button[@id='sign-in-button']";
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public RegistrationPage (WebDriver driver) {
        super(driver);
    }

    public void navigateToRegPage() {
        navigateTo(REG_PAGE_URL);
        System.out.println("The user has navigated ot the Registration page");
    }
    public void enterUsername() {
        WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(userNameField_locator)));
        userNameField.sendKeys("User543212");
        System.out.println("username entered");
    }
    public void enterEmail() {
        WebElement emailInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailInputField_locator)));
        emailInputField.sendKeys("ap@ap.de");
        System.out.println("email entered");
    }
    public void enterBirthDate() {
        WebElement birthDateInputField = driver.findElement(By.xpath(birthDateField_locator));
        birthDateInputField.sendKeys("15-12-1995");
        System.out.println("birth date entered");
    }
    public void enterPassword() {
        WebElement passwordInputField = driver.findElement(By.xpath(passwordFeild_locator));
        passwordInputField.sendKeys("Password123");
        System.out.println("password entered");
    }
    public void enterConfirmPassword(){
        WebElement confirmPasswordInputField = driver.findElement(By.xpath(confirmPasswordField_locator));
        confirmPasswordInputField.sendKeys("Password123");
        System.out.println("confirm password entered");
    }
    public void enterPublicInfo(){
        WebElement publicInfoField = driver.findElement(By.xpath(publicInfoField_locator));
        publicInfoField.sendKeys("Hello");
        System.out.println("public entered");

    }
    public void clickSingInReg(){
        WebElement signinRegistrationButton = driver.findElement(By.xpath(signinRegistrationButton_locator));
        signinRegistrationButton.click();
        System.out.println("signin button clicked");

    }
    public boolean isSigninButtonDisabled(){
        WebElement signinRegistrationButton = driver.findElement(By.xpath(signinRegistrationButton_locator));
        String disabledAttribute = signinRegistrationButton.getAttribute("disabled");
        boolean isDisabled = disabledAttribute != null;
        if (isDisabled) {
            System.out.println("Sign In button is currently disabled.");
        } else {
            System.out.println("Sign In button is currently enabled.");
        }
        return isDisabled;
    }
}
