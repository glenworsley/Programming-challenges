import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class WednesdayChallengeTest {

    @Test
    public void findLengthOfLongestSubstringContainingAtMostKDistinctChars() {

        WednesdayChallenge wednesdayChallenge = new WednesdayChallenge();
        assertThat(wednesdayChallenge.findLengthOfLongestSubstringContainingAtMostKDistinctChars("abcba", 2),
                is(equalTo(2)));
    }
}