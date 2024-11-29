package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class OrderProcessingTestWithDataProvider {

    @DataProvider(name = "OrderPrice")
    public Object[][] getData() {
        return new Object[][]{
                {100, 100}
        };
    }
    @Test(dataProvider = "OrderPrice")
    private void testTotalPrice( double expectedValue, double actualValue) {
        Assert.assertEquals(actualValue, expectedValue);
    }

    @DataProvider(name = "OrderState")
    public Object[][] getDate() {
        return new Object[][] {
            {"Confirmed", "Confirmed"}
        };
    }
    @Test(dataProvider = "OrderState")
    private void testOrderState( String expectedValue, String actualValue) {
        Assert.assertEquals(actualValue, expectedValue);
    }
}
