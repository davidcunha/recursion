package pt.davidcunha.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for combinations
 */
public class CombinationsTest {

    @Test
    public void setup() {
        String[] input = {"A", "B", "C"};

        int inputLength = input.length;
        boolean[] used = new boolean[inputLength];
        String[] outputCombinations = new String[inputLength];

        String result = Combinations.run(input, outputCombinations, used, inputLength, 0);
        assertEquals("[ABC][ACB][BAC][BCA][CAB][CBA]", result);
    }
}
