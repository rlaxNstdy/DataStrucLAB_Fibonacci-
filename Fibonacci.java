public class Fibonacci extends Main {

    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 10; // Change the value of n as needed
        long startTime = System.nanoTime();
        int result = calculateFibonacci(n);
        long endTime = System.nanoTime();
        System.out.println("Fibonacci number at position " + n + ": " + result);
        System.out.println("Time complexity: O(n), where n is the input Fibonacci position.");
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}
