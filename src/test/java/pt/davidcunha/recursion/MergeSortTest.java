package pt.davidcunha.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for Merge Sort
 */
public class MergeSortTest {

    @Test
    public void mergeSort() {
        int nItems = 6;
        long[] initArray = {10,20,60,25,40,15};

        long[] workspace = new long[nItems];
        MergeSort mSort = new MergeSort(initArray);
        mSort.run(workspace, 0, nItems - 1);

        assertEquals("10\n15\n20\n25\n40\n60\n", mSort.display());
    }
}
