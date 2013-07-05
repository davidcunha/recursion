/**
 * Merge Sort
 */
package pt.davidcunha.recursion;

/**
 *
 * @author David Cunha <davidgoncalvescunha AT gmail DOT pt>
 */
public class Knapsack {

    private int finalTarget;
    private int[] arr;
    private int size;

    public Knapsack(int target, int[] items) {
        this.finalTarget = target;
        this.arr = items;
        this.size = items.length;
    }

    public int sumUp(int target, int[] workspace, int position) {
        
        workspace[position] = arr[position];
        System.out.println("Target: " + target);
        System.out.println("Array: " + workspace[0] + ',' + workspace[1] + ',' + workspace[2] + ',' + workspace[3] + ',' + workspace[4]);
        System.out.println("Position: " + position);
        int sum = 0;
        for (int i = 0; i < workspace.length; i++) {
            sum += workspace[i];
        }
        if (sum == this.finalTarget) {
            return 1;
        } else {
            if (arr[position] < target) {
                System.out.println(arr[position] + " is to small...");
                target -= workspace[position];
                workspace[position] = arr[position++];
                return sumUp(target, workspace, position++);
            } else {
                System.out.println(arr[position] + " is to big...");
                workspace[position] = arr[position++];
                return sumUp(target, workspace, position++);
            }
        }
    }

    public static void main(String args[]) {
        int[] items = {11, 8, 7, 6, 5};
        int[] workspace = new int[5];
        int target = 20;
        Knapsack k = new Knapsack(target, items);
        k.sumUp(target, workspace, 0);
    }
}
