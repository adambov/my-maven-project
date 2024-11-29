package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodAssertNotSame {

    @Test
    public void testAssertNotSame() {
            int num1 = 5;
            int num2 = 7;
            Assert.assertNotSame(num1, num2);
    }
    @Test
    public static void stringCompare () {
        String word1 = "Nasko";
        String word2 = "Vasko";
        Assert.assertNotSame(word1, word2);
    }
    @Test
    public static void arrayComapre() {
        double[] array1 = {1,1,2,3,5};
        double[] array2 = {1,1,2,3,5};
        Assert.assertNotSame(array1, array2);
    }
    @Test
    public static void objectsComapre() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Assert.assertNotSame(obj1, obj2);
    }
    @Test
    public static void compareSmth() {
        String str1 = "Hello";
        String str2 = new String("kuku");
        Assert.assertNotSame(str1, str2);
    }
}

