package pt.davidcunha.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for triangular numbers
 */
public class TriangularNumbersTest {

    @Test
    public void setup() {
        assertEquals(10, TriangularNumbers.check(4));
        assertEquals(15, TriangularNumbers.check(5));
    }
}
