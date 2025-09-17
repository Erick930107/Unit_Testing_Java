package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Test_QS {

	@Test
	void testClassInstantiation() {
	    new QuickSort(); // 解決class QuickSort未覆蓋
	}
	
    @Test
    void testNormalCase() {
        int[] input = {5, 10, 9, 8, 7};
        int[] expected = {5, 7, 8, 9, 10};
        QuickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        QuickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        QuickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testDuplicateElements() {
        int[] input = {3, 1, 2, 3, 1};
        int[] expected = {1, 1, 2, 3, 3};
        QuickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testNegativeNumbers() {
        int[] input = {-3, -1, -2, 0, 2, 1};
        int[] expected = {-3, -2, -1, 0, 1, 2};
        QuickSort.sort(input);
        assertArrayEquals(expected, input);
    }
}
