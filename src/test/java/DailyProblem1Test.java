import org.junit.Test;

import static org.junit.Assert.*;

public class DailyProblem1Test {

    private final IDailyProblem1 dailyProblem1 = new DailyProblem1Impl2();

    @Test
    public void sumOfTwoNumbersInArrayNotEqualToX() {
        assertFalse(dailyProblem1.isSumOfTwoNumbersInArrayEqualTo(new int[] { 3, 4 }, 17));
    }

    @Test
    public void sumOfTwoNumbersInArrayIsEqualToX() {
        assertTrue(dailyProblem1.isSumOfTwoNumbersInArrayEqualTo(new int[] { 3, 4 }, 7));
    }

    @Test
    public void testForThreeNumberArray() {
        assertTrue(dailyProblem1.isSumOfTwoNumbersInArrayEqualTo(new int[] { 3, 1, 4 }, 7));
    }

    @Test
    public void testForThreeNumberArrayNotEqualToX() {
        assertFalse(dailyProblem1.isSumOfTwoNumbersInArrayEqualTo(new int[] { 3, 1, 4 }, 6));
    }

    @Test
    public void testForFourNumberArray() {
        assertTrue(dailyProblem1.isSumOfTwoNumbersInArrayEqualTo(new int[] { 3, 1, 4, 5 }, 8));
    }

    @Test
    public void testForFiveNumberArray() {
        assertTrue(dailyProblem1.isSumOfTwoNumbersInArrayEqualTo(new int[] { 3, 1, 4, 5, 6 }, 10));
    }

    @Test
    public void testForGivenExample() {
        assertTrue(dailyProblem1.isSumOfTwoNumbersInArrayEqualTo(new int[] { 10, 15, 3, 7 }, 17));
    }

}