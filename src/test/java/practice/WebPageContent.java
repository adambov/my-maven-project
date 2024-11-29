package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebPageContent {

    SoftAssert softAssert = new SoftAssert();
    @Test
    private void comapareComponents() {
        String actualTitle = "Pets's website";
        String expectedTitle = "Pets's website";
        softAssert.assertEquals(actualTitle, expectedTitle);


        String actualHeader = "All you need to know about your Pets";
        String expectedHeader = "All you need to know about your Pets";
        softAssert.assertEquals(actualHeader, expectedHeader);


        String expectedFooter = "Contacts";
        String actualFooter = "Contacts";
        softAssert.assertEquals(actualFooter, expectedFooter);

        softAssert.assertAll();
    }
}



