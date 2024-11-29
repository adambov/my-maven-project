import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MethodAssertEquals {

    @Test
    public static void titleCompare() {
        String myTitle = "Hello Sofia";
        String actualTitle = "Hello Plovdiv";

        Assert.assertEquals(myTitle, actualTitle);
    }

    @Test
    public static void intCompare() {
        int num1 = 4;
        int num2 = 4;
        Assert.assertEquals(num1, num2);
    }

    @Test
    public static void booleanComapre() {
        boolean isBlue = true;
        boolean isLightBlue = true;

        Assert.assertEquals(isBlue, isLightBlue);
    }

    @Test
    public static void arrayCompare() {
        double[] array1 = {1.7, 4.2, 3.1};
        double[] array2 = {1.7, 4.2, 3.1};
        Assert.assertEquals(array1, array2);
    }

    @Test
    public void listCompare() {
        ArrayList <String> expectedFruits = new ArrayList<String>();
        ArrayList <String> actualFruits = new ArrayList<String>();

        expectedFruits.add("apple");
        expectedFruits.add("cherry");

        actualFruits.add("apple");
        actualFruits.add("cherry");

        Assert.assertEquals(expectedFruits, actualFruits);
    }


}
