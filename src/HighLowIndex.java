public class HighLowIndex {
    // Find first index of target in sorted array
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1; // go left to find first occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Find last index of target in sorted array
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1; // go right to find last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5,6};
        int target = 2;
        System.out.println("First occurrence index: " + firstOccurrence(arr, target));
        System.out.println("Last occurrence index: " + lastOccurrence(arr, target));
    }
}
