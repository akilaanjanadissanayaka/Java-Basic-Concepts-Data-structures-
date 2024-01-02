package ArrayStructures;

public class Array {
    public static void main(String args[]){
        int[] numbers = new int[5];

        // Add elements to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the original array
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));

        // Update an element at index 2
        numbers[2] = 35;

        // Print the array after updating
        System.out.println("Array after updating element at index 2: " + java.util.Arrays.toString(numbers));

        // Delete an element at index 3 (shift elements to fill the gap)
        int indexToDelete = 3;
        for (int i = indexToDelete; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        // Resize the array (optional, as the last element is now duplicated)
        numbers = java.util.Arrays.copyOf(numbers, numbers.length - 1);

        // Print the array after deletion
        System.out.println("Array after deleting element at index 3: " + java.util.Arrays.toString(numbers));
    }
}
