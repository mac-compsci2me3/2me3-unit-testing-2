import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSelectionSort {

    @Test
    public void testSelectionSortWithEmptyArray() {
        int[] actual = {};
        SortingAlgorithms.selectionSort(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    // Write test cases to locate errors
}
