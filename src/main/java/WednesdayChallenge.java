import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WednesdayChallenge {

    public WednesdayChallenge() {
    }

    public int findLengthOfLongestSubstringContainingAtMostKDistinctChars(String s, int k) {

        //approach 1:

        //get list of distinct characters in string
        List<Character> distinctChars = s.chars()
                .distinct()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        //from this list, get a list of possible combinations of, at most 'k' distinct chars
        //can use a library - or do as done here: https://www.baeldung.com/java-combinations-algorithm
        //given nature of challenge, DIY seems appropriate instead of using a library
        List<String> combinations = getPossibleCombinationsOfAtMostK(distinctChars, k);

        //for each combination, get the length of the longest substring containing only those chars
        //can do this by building a Regex from the chars in the combination, and then doing a "greedy" match
        //to capture the group, then getting the length of the matched group



        return 0;
    }

    private List<String> getPossibleCombinationsOfAtMostK(List<Character> distinctChars, int maxCombinationLength) {

        List<String> possibleCombinations = new ArrayList<>();
        for (int i = 1; i <= maxCombinationLength; i++) {
            possibleCombinations.addAll(getPossibleCombinationsOfLengthK(distinctChars, i));
        }
    }

    private List<String> getPossibleCombinationsOfLengthK(List<Character> distinctChars, int combinationLength) {

        Set<String> possibleCombinations = new HashSet<>();
        for (int i = 0; i < distinctChars.size(); i++) {
            Set<String> possibleCombinationsStartingWithCurrentChar = getPossibleCombinationsOfLengthK(copyOfDistinctCharsWithoutCurrentChar, combinationLength - 1);
            //for each returned
            List<Character> remainingDistinctChars = new ArrayList<>();
            Collections.copy(remainingDistinctChars, distinctChars);
            remainingDistinctChars.remove(distinctChars.get(i));
            possibleCombinations.addAll(getPossibleCombinationsOfLengthK(combinationLength), )
        }
    }

}
