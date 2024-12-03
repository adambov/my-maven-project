package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class myFirstDropdown {
    private final static String BASE_URL = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @BeforeMethod
    public void preperationBrowser () {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void quitBrowser () throws InterruptedException {
        Thread.sleep(5555);
        driver.quit();
    }
    @Test
    public void automatingDropdown () throws InterruptedException {
        driver.get(BASE_URL);
        Select firstDropdownMenu = new Select(driver.findElement(By.id("dropdowm-menu-1")));

        firstDropdownMenu.selectByIndex(2);
        Thread.sleep(4444);

        firstDropdownMenu.selectByVisibleText("JAVA");
        Thread.sleep(3333);

        firstDropdownMenu.selectByValue("c#");



    }
}
