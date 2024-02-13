public class CheckArray extends Main {

    public static boolean containsZeroOrMinusOne(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        for (int num : array) {
            if (num == 0 || num == -1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] inputArray = {100, 521, -76, -12, 174};
        long startTime = System.nanoTime();
        boolean result = containsZeroOrMinusOne(inputArray);
        long endTime = System.nanoTime();
        System.out.println("Array contains 0 or -1: " + result);
        System.out.println("Time complexity: O(n), where n is the length of the input array.");
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}
