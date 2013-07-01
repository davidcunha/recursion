/*
 * Towers of Hanoi
 * 
 */
package pt.davidcunha.recursion;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class TowersHanoi {

    /*
     * Towers of Hanoi resolve operation
     * 
     * @param nDisks number of disks
     * @param src source from the tower
     * @param inter intermediary from the tower
     * @param dest destination from the tower
     * 
     * @return result
     */
    public static String resolve(int nDisks, char src, char inter, char dest) {

        if (nDisks == 1) {
            System.out.println("move disk 1 from " + src + " to " + dest);
        } else {
            resolve(nDisks - 1, src, dest, inter);

            System.out.println("move disk " + nDisks + " from " + src + " to " + dest);

            resolve(nDisks - 1, inter, src, dest);
        }
        
        return "Completed!";
    }
}
