package ArrayStructures;
import java.util.ArrayList;
import java.util.List;

public class Metrix {
    public static void main(String[] args) {
        // Create a matrix represented as ArrayList of ArrayLists
        List<List<Integer>> matrix = new ArrayList<>();

        // Populate the matrix
        matrix.add(new ArrayList<>(List.of(1, 2, 3)));
        matrix.add(new ArrayList<>(List.of(4, 5, 6)));
        matrix.add(new ArrayList<>(List.of(7, 8, 9)));

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Access an element in the matrix (row 1, column 2)
        int elementToAccess = matrix.get(1).get(2);
        System.out.println("Accessed Element: " + elementToAccess);

        // Update an element in the matrix (row 0, column 1)
        int newValue = 10;
        matrix.get(0).set(1, newValue);
        System.out.println("Matrix after Update:");
        printMatrix(matrix);

        // Add a scalar value to all elements in the matrix
        int scalar = 5;
        for (List<Integer> row : matrix) {
            for (int i = 0; i < row.size(); i++) {
                row.set(i, row.get(i) + scalar);
            }
        }
        System.out.println("Matrix after Addition:");
        printMatrix(matrix);
    }

    // Helper method to print the matrix
    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            System.out.println(row);
        }
        System.out.println();
    }
}
