public class SwapNumbers {
    // Swaps two numbers without using a temp variable.
    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        swap(a, b);
        // Output: Before swap: a = 5, b = 10
        //         After swap: a = 10, b = 5
    }
}
