public class Fibonacci {

    // Recursive implementation
    public static int fibRecursive(int n) {
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // DP implementation
    public static int fibDP(int n) {
        if (n <= 1)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("10th Fibonacci (recursive): " + fibRecursive(n));
        System.out.println("10th Fibonacci (DP): " + fibDP(n));
        // Output: 55 for both
    }
}
