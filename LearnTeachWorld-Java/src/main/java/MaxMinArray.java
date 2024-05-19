public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 1, 2, 8, 4, 6};

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array to find maximum and minimum elements
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger element is found
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if a smaller element is found
            }
        }

        // Print the maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
