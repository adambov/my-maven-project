package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class firstSeleniumTest {

    @Test
    public void launchChromeDriver() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atanas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.bg/");

        driver.quit();
    }

}
