import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQuickSort {
    @Test
    public void testQuickSortWithEmptyArray() {
        int[] actual = {};
        SortingAlgorithms.quickSort(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

      // Write test cases to locate errors
}


