package pageObjectTestCases;

import POM.HomePage;
import POM.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class POM_LoginTestCase {


    @Test
    public void EndToEndTestCaseV1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);

        try {
            homePage.navigateToHomePage();
            Thread.sleep(5555);

            LoginPage loginPage = new LoginPage(driver);
            Thread.sleep(5555);
            loginPage.navigateToLoginPage();
            loginPage.provideUserName();
            loginPage.providePassword();
            loginPage.clickRememberMe();
            loginPage.clickSignIn();
            loginPage.verifySuccessMessage();
            loginPage.verifyIfOnLoginHomePage();
        } catch (Exception e) {
            throw new AssertionError("Verification of success message failed: " + e.getMessage(), e);

        } finally {
            Thread.sleep(3333);
            driver.quit();
        }
    }
}
