/**
 * Combinations
 */
package pt.davidcunha.recursion;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class Combinations {
    
    private static StringBuilder sb = new StringBuilder();
        
    /**
     * Run Combinations algorithm
     * 
     * @param input array of objects
     * @param outputCombinations workspace array
     * @param used array for combinations without repetitions
     * @param inputlength size of the array of objects
     * @param level helper variable for recursivity
     */
     public static String run(String[] input, String[] outputCombinations, boolean[] used, int inputlength, int level) {
        
        if (level == inputlength) { //base case
            sb.append("[");
            for(int i = 0; i < inputlength; i++) {
                sb.append(outputCombinations[i]);
            }
            sb.append("]");
        }

        for (int i = 0; i < inputlength; ++i) {

            if (used[i]) { //skip if it already exists
                continue;
            }

            outputCombinations[level] = input[i];
            used[i] = true; 
            run(input, outputCombinations, used, inputlength, level + 1); //recursive process
            used[i] = false;
            outputCombinations[level] = "-";
        }
        
        return sb.toString();
    }
}
