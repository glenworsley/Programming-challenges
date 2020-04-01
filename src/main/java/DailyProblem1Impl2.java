import java.util.HashSet;
import java.util.Set;

public class DailyProblem1Impl2 implements IDailyProblem1 {

    public boolean isSumOfTwoNumbersInArrayEqualTo(int[] ints, int x) {
        Set prevInts = new HashSet<Integer>();
        for (int i = 0; i < ints.length; i++) {
            if (prevInts.contains(x - ints[i])) return true;
            prevInts.add(ints[i]);
        }
        return false;
    }

}
