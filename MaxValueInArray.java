public class MaxValueInArray extends Main{

    public static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        int maxValue = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] inputArray = {100, 521, -76, -12, 174};
        long startTime = System.nanoTime();
        int max = findMaxValue(inputArray);
        long endTime = System.nanoTime();
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Time complexity: O(n), where n is the length of the input array.");
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}
