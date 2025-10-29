public class FindTwoMissingNumbers {
    // Function to find two missing numbers in range [1, n]
    // Assumes array size is n-2 and all elements are distinct
    public static void findTwoMissingNumbers(int arr[], int n) {
        boolean[] mark = new boolean[n + 1];
        // Mark all present elements
        for (int i = 0; i < n - 2; i++) {
            mark[arr[i]] = true;
        }
        // Print two unmarked (missing) elements
        System.out.print("Two Missing Numbers are: ");
        for (int i = 1; i <= n; i++) {
            if (!mark[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6}; // Should find 2 and 4 missing from [1..6]
        int n = arr.length + 2;    // n = 6
        findTwoMissingNumbers(arr, n);
    }
}
