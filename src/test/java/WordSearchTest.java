import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    @Test
    public void testVerticalWordInCol1() {
        WordSearch wordSearch = new WordSearch();
        String[][] matrix = {
                { "F", "A", "C", "I" },
                { "O", "B", "Q", "P" },
                { "A", "N", "O", "B" },
                { "M", "A", "S", "S" }
        };
        String targetWord = "FOAM";
        assertTrue(wordSearch.search(matrix, targetWord));
    }

    @Test
    public void testWordNotFound() {
        WordSearch wordSearch = new WordSearch();
        String[][] matrix = {
                { "F", "A", "C", "I" },
                { "O", "B", "Q", "P" },
                { "A", "N", "O", "B" },
                { "M", "A", "S", "S" }
        };
        String targetWord = "SOSO";
        assertFalse(wordSearch.search(matrix, targetWord));
    }

    @Test
    public void testHorizontalWordInRow1() {
        WordSearch wordSearch = new WordSearch();
        String[][] matrix = {
                { "F", "A", "C", "I" },
                { "O", "B", "Q", "P" },
                { "A", "N", "O", "B" },
                { "M", "A", "S", "S" }
        };
        String targetWord = "FACI";
        assertTrue(wordSearch.search(matrix, targetWord));
    }

    @Test
    public void testHorizontalWordInRow2() {
        WordSearch wordSearch = new WordSearch();
        String[][] matrix = {
                { "F", "A", "C", "I" },
                { "O", "B", "Q", "P" },
                { "A", "N", "O", "B" },
                { "M", "A", "S", "S" }
        };
        String targetWord = "OBQP";
        assertTrue(wordSearch.search(matrix, targetWord));
    }


    @Test
    public void testVerticalWordInCol2() {
        WordSearch wordSearch = new WordSearch();
        String[][] matrix = {
                { "F", "A", "C", "I" },
                { "O", "B", "Q", "P" },
                { "A", "N", "O", "B" },
                { "M", "A", "S", "S" }
        };
        String targetWord = "ABNA";
        assertTrue(wordSearch.search(matrix, targetWord));
    }

    @Test
    public void testVerticalWordInCol4() {
        WordSearch wordSearch = new WordSearch();
        String[][] matrix = {
                { "F", "A", "C", "I" },
                { "O", "B", "Q", "P" },
                { "A", "N", "O", "B" },
                { "M", "A", "S", "S" }
        };
        String targetWord = "IPBS";
        assertTrue(wordSearch.search(matrix, targetWord));
    }

    @Test
    public void testHorizontalWordInRow4() {
        WordSearch wordSearch = new WordSearch();
        String[][] matrix = {
                { "F", "A", "C", "I" },
                { "O", "B", "Q", "P" },
                { "A", "N", "O", "B" },
                { "M", "A", "S", "S" }
        };
        String targetWord = "MASS";
        assertTrue(wordSearch.search(matrix, targetWord));
    }
}