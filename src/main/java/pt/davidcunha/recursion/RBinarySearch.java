/*
 * Binary Search
 * 
 */
package pt.davidcunha.recursion;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class RBinarySearch {

    private int nElemns;
    private long[] arr;

    /**
     * RBinarySearch public constructor
     *
     * @param max array initialization
     */
    public RBinarySearch(int max) {
        arr = new long[max];
        nElemns = 0;
    }

    /**
     * RBinarySearch getter
     *
     * @return array
     */
    public long[] getArr() {
        return arr;
    }

    /**
     * Insert function (assume that the items are sorted)
     *
     * @param n number to insert in the array
     */
    public void insert(long n) {
        arr[nElemns] = n;
        nElemns++;
    }

    /**
     * Display function
     *
     * @return string with all elements
     */
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nElemns; i++) {
            sb.append(arr[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Find wrapper for binary search
     *
     * @param n element to be searched
     * @return element
     */
    public int find(long n) {
        return this.binarySearch(n, 0, nElemns - 1);
    }

    /**
     * Recursive Binary Search
     *
     * @param n element to be searched
     * @return element
     */
    public int binarySearch(long n, int lb, int ub) {
        int mid;

        mid = (lb + ub) / 2;
        if (arr[mid] == n) {
            return mid;
        } else if (lb > ub) {
            return arr.length;
        } else {
            if (n > arr[mid]) {
                lb = mid + 1;
                return this.binarySearch(n, lb, ub);
            } else {
                ub = mid - 1;
                return this.binarySearch(n, lb, ub);
            }
        }

    }
}
