import java.util.Arrays;

public class WordSearch {

    public boolean search(String[][] matrix, String targetWord) {
        boolean found = false;
        //search horizontally until found or no more rows
        for (int i = 0; i < matrix.length && !found; i++) {
            String word = String.join("", matrix[i]);
            if (word.equalsIgnoreCase(targetWord)) {
                found = true;
            }
        }
        //if not found, search vertically until found or no more cols
        for (int i = 0; i < matrix[0].length && !found; i++) {
            String word = getWord(matrix, i);
            if (word.equalsIgnoreCase(targetWord)) {
                found = true;
            }
        }
        return found;
    }

    private String getWord(String[][] matrix, int j) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            sb.append(matrix[i][j]);
        }
        return sb.toString();
    }
}
