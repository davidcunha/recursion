/*
 * Factorials
 * 
 */
package pt.davidcunha.recursion;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class Factorials {

    /**
     * Finding the nth term
     *
     * @param n term
     * @return result
     */
    public static int check(int n) {
        if (n == 0) {
            return 1;
        }
        return n * check(n - 1); //recursive finding
    }
}
