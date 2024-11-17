import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestMergeSort {

    @Test
    public void testMergeSortWithSingleElement() {
        int[] actual = {42};
        SortingAlgorithms.mergeSort(actual);
        int[] expected = {42};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] actual = {};
        SortingAlgorithms.mergeSort(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

     // Write test cases to locate errors

}

