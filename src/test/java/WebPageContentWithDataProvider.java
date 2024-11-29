import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.DataProvider;

public class WebPageContentWithDataProvider {
    SoftAssert softAssert = new SoftAssert();

    @DataProvider (name = "WebCompNames")
    public Object[][] getData() {
        return new Object[][] {
                {"Pets's websit", "Pets's website"},
                {"All you need to know about your Pets", "All you need to know about your Pets"},
                {"Contacts", "Contacts"}
        };
    }

    @Test(dataProvider = "WebCompNames")
    private void comapareComponents(String expectedValue, String actualValue) {
        softAssert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void assertAll() {
        softAssert.assertAll();
    }

}
