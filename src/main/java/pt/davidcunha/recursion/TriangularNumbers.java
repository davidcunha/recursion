/*
 * Triangular Numbers
 * 
 */
package pt.davidcunha.recursion;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class TriangularNumbers {

    /**
     * Finding the nth term
     *
     * @param n term
     * @return result
     */
    public static int check(int n) {
        if (n == 1) {
            return 1;
        }
        return n + check(n - 1); //recursive finding
    }
}
