import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MethodAssertFalse {
    @Test
    public static void ТestFalseCondition() {
        boolean isEven = 7 % 4 == 0;
        Assert.assertFalse(isEven);
    }
    @Test
    public static void PositiveNum() {
        int num = 6;
        boolean isNegative = num < 0;
        Assert.assertFalse(isNegative);
    }
    @Test
    public static void LetterCheck() {
        String words = "hyperactive";
        Assert.assertFalse(words.contains("b"));
    }

    @Test
    public static void CheckIfEmpty () {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        Assert.assertFalse(numbers.isEmpty());
    }

    @Test
    public static void IntComapre () {
        int num1 = 5;
        int num2 = 6;
        Assert.assertFalse(num1 == num2);
    }
}
