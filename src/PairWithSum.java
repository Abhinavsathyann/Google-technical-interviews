import java.util.HashSet;

public class PairWithSum {

    // Prints all pairs in the array that sum up to a specific value
    public static void printPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Pairs with sum " + sum + ":");
        for (int value : arr) {
            int target = sum - value;
            if (set.contains(target)) {
                System.out.println("(" + value + ", " + target + ")");
            }
            set.add(value);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int sum = 7;
        printPairs(arr, sum);
        // Output: (4, 3), (5, 2)
    }
}
