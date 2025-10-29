public class PermutationsOfString {

    // Recursively generates all permutations of a given string.
    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
            return;
        }
        for (int i = left; i <= right; i++) {
            str = swap(str, left, i);
            permute(str, left + 1, right);
            str = swap(str, left, i); // backtrack
        }
    }

    // Helper to swap characters in a string.
    public static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length() - 1);
        // Output: All permutations of "ABC"
    }
}
