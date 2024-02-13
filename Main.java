public class Main {

    public static void main(String[] args) {
        // Example for finding the maximum value in an array
        int[] inputArray = {100, 521, -76, -12, 174};
        MaxValueInArray maxValueInArray = new MaxValueInArray();
        long maxStartTime = System.nanoTime();
        int maxResult = maxValueInArray.findMaxValue(inputArray);
        long maxEndTime = System.nanoTime();
        System.out.println("Maximum value in the array: " + maxResult);
        System.out.println("Time complexity: O(n), where n is the length of the input array.");
        System.out.println("Execution time: " + (maxEndTime - maxStartTime) + " nanoseconds");

        System.out.println(); // Adding a newline for better readability

        // Example for calculating the nth Fibonacci number
        int n = 10; // Change the value of n as needed
        Fibonacci fibonacci = new Fibonacci();
        long fiboStartTime = System.nanoTime();
        int fiboResult = fibonacci.calculateFibonacci(n);
        long fiboEndTime = System.nanoTime();
        System.out.println("Fibonacci number at position " + n + ": " + fiboResult);
        System.out.println("Time complexity: O(n), where n is the input Fibonacci position.");
        System.out.println("Execution time: " + (fiboEndTime - fiboStartTime) + " nanoseconds");

        System.out.println(); // Adding a newline for better readability

        // Example for checking if an array contains 0 or -1
        int[] arrayToCheck = {100, 521, -76, -12, 174};
        CheckArray checkArray = new CheckArray();
        long checkStartTime = System.nanoTime();
        boolean checkResult = checkArray.containsZeroOrMinusOne(arrayToCheck);
        long checkEndTime = System.nanoTime();
        System.out.println("Array contains 0 or -1: " + checkResult);
        System.out.println("Time complexity: O(n), where n is the length of the input array.");
        System.out.println("Execution time: " + (checkEndTime - checkStartTime) + " nanoseconds");
    }
}
