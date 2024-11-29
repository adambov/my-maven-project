package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 {

    @Test
    public void verifyIcanStartSeleniumOnMachine () throws java. lang. InterruptedException{
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atanas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://www.google.bg/");

        driver.manage().window().maximize();
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        Thread.sleep(4444);
        driver.close();
        driver.quit();
    }
}
