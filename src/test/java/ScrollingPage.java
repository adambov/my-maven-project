
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;


public class ScrollingPage {
    WebDriver driver = new ChromeDriver();
    public static final String BASE_URL = "http://training.skillo-bg.com:4300/";
    @BeforeMethod
    public void prepareBrowser() {
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @Test
    private void scrollingToPic() throws java. lang. InterruptedException{

        Actions actions = new Actions(driver);

        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(500);
        }
    }
}
