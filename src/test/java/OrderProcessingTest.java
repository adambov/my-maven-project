import org.testng.Assert;
import org.testng.annotations.Test;


public class OrderProcessingTest {
    @Test
    private void testOrderStatusandTotalPrice() {
        String expectedStatus = "confirmed";
        double expectedPrice = 100;

        String actualStatus = orderStatus();
        double actualPrice = orderPrice();

        Assert.assertEquals(actualStatus, expectedStatus);
        Assert.assertEquals(actualPrice, expectedPrice);
    }

    private String orderStatus() {
        return "confirmed";
    }
    private double orderPrice() {
        return 100;
    }

}
