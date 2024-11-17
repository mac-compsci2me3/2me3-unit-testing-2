import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestInsertionSort {
    @Test
    public void testInsertionSortWithSingleElement() {
        int[] actual = {1};
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSortWithDuplicateElements() {
        int[] actual = {2, 2, 2};
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {2, 2, 2};
        assertArrayEquals(expected, actual);
    }

    // Write test cases to locate errors
 
}


