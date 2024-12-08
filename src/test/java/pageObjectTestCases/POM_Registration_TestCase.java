package pageObjectTestCases;

import POM.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_Registration_TestCase {
    WebDriver driver = new ChromeDriver();
    RegistrationPage registrationPage = new RegistrationPage(driver);

    @Test
    public void verifyRegPage() throws InterruptedException {
        try {
            registrationPage.navigateToRegPage();
            boolean isButtonInitiallyDisabled = registrationPage.isSigninButtonDisabled();
            Assert.assertTrue(isButtonInitiallyDisabled, "The Sign In button should be disabled initially.");
            registrationPage.enterUsername();
            registrationPage.enterEmail();
            registrationPage.enterBirthDate();
            registrationPage.enterPassword();
            registrationPage.enterConfirmPassword();
            registrationPage.enterPublicInfo();
            boolean isButtonEnabledBeforeClick = registrationPage.isSigninButtonDisabled();
            Assert.assertFalse(isButtonEnabledBeforeClick, "The Sign In button should be enabled before clicking.");
            registrationPage.clickSingInReg();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(5555);
            driver.quit();
        }
    }
}
