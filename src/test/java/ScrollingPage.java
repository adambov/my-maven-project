
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(500);

            List<WebElement> images = driver.findElements(By.tagName("img"));

            for (WebElement image : images) {
                if ((image.isDisplayed())) {
                    Thread.sleep(500);
                    image.click();
                    System.out.println("Кликнато изображение: " + image.getAttribute("src"));
                    break;
                }
            }
        }

    }
}
