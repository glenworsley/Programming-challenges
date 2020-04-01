import java.util.Arrays;

public class DailyProblem1 implements IDailyProblem1 {

    public boolean isSumOfTwoNumbersInArrayEqualTo(int[] ints, int x) {

        boolean found = false;
        for (int i = 1; (i < ints.length) && !found; i++) {
            int[] prevInts = Arrays.copyOfRange(ints, 0, i);
            found = sumsToX(ints[i], prevInts, x);
        }
        return found;
    }

    private boolean sumsToX(int currentInt, int[] prevInts, int x) {
        for (int i = 0; i < prevInts.length; i++) {
            if (prevInts[i] + currentInt == x) return true;
        }
        return false;
    }
}
