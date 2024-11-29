package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 {

    @Test
    public void verifyIcanStartSeleniumOnMachine () {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atanas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://www.google.bg/");
    }
}
