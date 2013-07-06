/**
 * Merge Sort
 */
package pt.davidcunha.recursion;

import java.util.Arrays;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class MergeSort {

    private long[] arr;

    public MergeSort(long[] initArray) {
        this.arr = initArray;
    }

    /**
     * Run Merge Sort algorithm
     *
     * @param workspace array to work with in the merge process
     * @param lb lower bound from the array
     * @param ub upper bound from the array
     */
    public void run(long[] workspace, int lb, int ub) {

        if (lb == ub) {
            return;
        } else {
            int mid = (lb + ub) / 2;
            run(workspace, lb, mid); //run algorithm in the first half
            run(workspace, mid + 1, ub);//run algorithm in the second half
            this.merge(workspace, lb, mid + 1, ub); //merge
        }
    }

    /**
     * Merge process
     *
     * @param workspace array to work with in the merge process
     * @param lb lower bound from the array
     * @param mid midpoint from the array
     * @param ub upper bound from the array
     */
    private void merge(long[] workspace, int lb, int mid, int ub) {
        int i = 0;
        int nItems = ub - lb + 1;
        int cinit = lb;
        int cmiddle = mid - 1;

        while (cinit <= cmiddle && mid <= ub) {
            if (arr[cinit] < arr[mid]) {
                workspace[i++] = arr[cinit++];
            } else {
                workspace[i++] = arr[mid++];
            }
        }

        //complete merge process if there is more items in the first half
        while (cinit <= cmiddle) {
            workspace[i++] = arr[cinit++];
        }

        //complete merge process if there is more items in the second half
        while (mid <= ub) {
            workspace[i++] = arr[mid++];
        }

        //populate final array with result
        for (int j = 0; j < nItems; j++) {
            arr[lb + j] = workspace[j];
        }
    }

    /**
     * Display function
     *
     * @return string with all elements
     */
    public String display() {
        return Arrays.toString(arr);
    }
}
