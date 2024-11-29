package practice;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class MethodsSoftAsserts {
    SoftAssert softAssert = new SoftAssert();
        @Test
        public void testAssertNotSame() {
            int num1 = 5;
            int num2 = 7;
            softAssert.assertNotSame(num1, num2);
        }
        @Test
        public void stringCompare () {
            String word1 = "Nasko";
            String word2 = "Vasko";
            softAssert.assertNotSame(word1, word2);
        }
        @Test
        public void arrayComapre() {
            double[] array1 = {1,1,2,3,5};
            double[] array2 = {1,1,2,3,5};
            softAssert.assertNotSame(array1, array2);
        }
        @Test
        public void objectsComapre() {
            Object obj1 = new Object();
            Object obj2 = obj1;
            softAssert.assertNotSame(obj1, obj2);
        }
        @Test
        public void compareSmth() {
            String str1 = "Hello";
            String str2 = new String("kuku");
            softAssert.assertNotSame(str1, str2);
        }

}
