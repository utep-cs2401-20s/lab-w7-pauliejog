/*
 * Paulie Jo Gonzalez
 * lab-w7
 * MW 1:30 pm
 */

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    /*
     * sortOfSort:
     * Test case 1: This test case checks that the method works when given an even-length array.
     * sortOfSort() → exp
     * PASSED
     */
    @Test
    public void testSortOfSort1() {
        int[] a = {2,7,1,3,0,9,6,5};
        int[] exp = {6,5,1,0,2,3,7,9};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(a);
        assertArrayEquals(exp,a);
    }

    /*
     * sortOfSort:
     * Test case 2: This test case checks that the method works when given an odd-length array.
     * sortOfSort() → exp
     * PASSED
     */
    @Test
    public void testSortOfSort2() {
        int[] b = {5,2,9,8,0};
        int[] exp = {5,2,0,8,9};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(b);
        assertArrayEquals(exp,b);
    }

    /*
     * sortOfSort:
     * Test case 3: This test case accounts for an already sorted array to ensure that it will resort it.
     * sortOfSort() → exp
     * PASSED
     */
    @Test
    public void testSortOfSort3() {
        int[] c = {1,2,3,4,5,6,7};
        int[] exp = {5,4,1,2,3,6,7};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(c);
        assertArrayEquals(exp,c);
    }

    /*
     * sortOfSort:
     * Test case 4: This case is designed to test a fairly large array of odd-length.
     * sortOfSort() → exp
     * PASSED
     */
    @Test
    public void testSortOfSort4() {
        int[] d = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int[] exp = {15,14,11,10,7,6,3,2,1,4,5,8,9,12,13,16,17};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(d);
        assertArrayEquals(exp,d);
    }

    /*
     * sortOfSort:
     * Test case 5: This test case checks that the method does not break when given an array containing all the same element.
     * sortOfSort() → exp
     * PASSED
     */
    @Test
    public void testSortOfSort5() {
        int[] e = {0,0,0,0,0,0,0,0};
        int[] exp = {0,0,0,0,0,0,0,0};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(e);
        assertArrayEquals(exp,e);
    }

    /*
     * sortOfSort:
     * Test case 6: This test case checks that the method works when given an array with negative numbers and duplicates.
     * sortOfSort() → exp
     * PASSED
     */
    @Test
    public void testSortOfSort6() {
        int[] f = {-3,2,2,-7,9,8,9,9};
        int[] exp = {9,8,-3,-7,2,2,9,9};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(f);
        assertArrayEquals(exp,f);
    }

    /*
     * sortOfSort:
     * Test case 7: This test case checks that the method works when given an array with negative numbers and duplicates.
     * sortOfSort() → exp
     * PASSED
     */
    @Test
    public void testSortOfSort7() {
        int[] g = {1,-5,6,88,-100,400,2,0,9,9,9,15};
        int[] exp = {15,9,6,2,-5,-100,0,1,9,9,88,400};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(g);
        assertArrayEquals(exp,g);
    }

    @Test
    public void testSortOfSort8() {//BROKE IT
        int[] g = {3,3,3,4,4,4,9,9,9,9,7,7,7,1,1,1,1,1,1,1,1,1,1};
        int[] exp = {9,9,7,4,3,3,1,1,1,1,1,1,1,1,1,1,3,4,4,7,7,9,9};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(g);
        assertArrayEquals(exp,g);
        arr.printArray(g);
    }
    @Test
    public void testSortOfSort9() {//BROKE IT
        int[] g = {9,8,7,6,5,3,7};
        //int[] exp = {};
        SortOfSort arr = new SortOfSort();
        arr.sortOfSort(g);
        //assertArrayEquals(exp,g);
        arr.printArray(g);
    }
}//end SortOfSortTester
