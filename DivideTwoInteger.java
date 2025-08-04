package Day_9;

public class DivideTwoInteger {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Use long to prevent overflow, and take absolute values
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        int result = 0;

        // Bit manipulation logic for division
        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long multiple = 1;

            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            ldividend -= temp;
            result += multiple;
        }

        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);
        return negative ? -result : result;
    }

    // Main method for testing
    public static void main(String[] args) {
        DivideTwoInteger solution = new DivideTwoInteger();

        // Test cases
        System.out.println("10 / 3 = " + solution.divide(10, 3));        // Output: 3
        System.out.println("7 / -3 = " + solution.divide(7, -3));        // Output: -2
        System.out.println("-15 / 3 = " + solution.divide(-15, 3));      // Output: -5
        System.out.println("0 / 1 = " + solution.divide(0, 1));          // Output: 0
        System.out.println("-2147483648 / -1 = " + solution.divide(-2147483648, -1)); // Output: 2147483647
    }
}
