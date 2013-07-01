package pt.davidcunha.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for Towers of Hanoi
 */
public class TowersHanoiTest {
    
    @Test
    public void setup() {
        assertEquals("Completed!", TowersHanoi.resolve(3, 'A', 'B', 'C'));
    }
    
}
