package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private final String Base_URL = "http://training.skillo-bg.com:4300/";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void navigateTo(String pageURLPath){
        String currentURL = Base_URL+pageURLPath;
        driver.get(currentURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    };
}
