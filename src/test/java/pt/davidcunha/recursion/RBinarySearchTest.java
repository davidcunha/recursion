package pt.davidcunha.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for Recursive Binary Search
 */
public class RBinarySearchTest {

    @Test
    public void binarySearch() {
        RBinarySearch arr = new RBinarySearch(5);
        arr.insert(20);
        arr.insert(30);
        arr.insert(50);
        arr.insert(80);
        arr.insert(120);

        assertEquals(0, arr.find(20));
        assertEquals(3, arr.find(80));
    }
}
