public class MoveZerosToLeft {

    // Moves all zeros in the array to the left while maintaining order of other elements
    public static void moveZerosToLeft(int[] arr) {
        int n = arr.length;
        int count = n - 1; // Index to place non-zero elements
        
        // Traverse array from end and shift non-zero elements to right side
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[count--] = arr[i];
            }
        }
        
        // Fill beginning part with zeros
        while (count >= 0) {
            arr[count--] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4};
        moveZerosToLeft(arr);
        System.out.print("Array after moving zeros to left: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 0 0 0 1 2 3 4
    }
}
