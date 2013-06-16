package pt.davidcunha.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for factorials
 */
public class FactorialsTest {

    @Test
    public void setup() {
        assertEquals(120, Factorials.check(5));
        assertEquals(720, Factorials.check(6));
    }
}
