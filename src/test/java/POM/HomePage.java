package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    private static final String HOME_PAGE_URL = "posts/all";
    String navBarHomeLink_locator = "nav-link-home";
    String navBarLoginLink_locator = "nav-link-login";
    String navBarProfileLink_locator = "nav-link-profile";
    String navBarLogOutButton = "//i[contains(@class,'fas fa-sign-out-alt fa-lg')]/..";


    public HomePage (WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage(){
        navigateTo(HOME_PAGE_URL);
        System.out.println("The user has navigated ot the home page");


    }
    public void clickOnNavigationBarLoginButton(){
        WebElement navBarLoginLink = driver.findElement(By.id(navBarLoginLink_locator));
        wait.until(ExpectedConditions.visibilityOf(navBarLoginLink));
        navBarLoginLink.click();
    }
}
