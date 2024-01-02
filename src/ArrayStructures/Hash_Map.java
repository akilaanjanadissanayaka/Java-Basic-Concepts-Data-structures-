package ArrayStructures;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hash_Map {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding data to the HashMap
        studentScores.put("John", 90);
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Eva", 88);

        // Displaying the original scores
        System.out.println("Original Scores:");
        printScores(studentScores);

        // Checking if a key is present and retrieving its value
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a student name to check scores: ");
        String studentName = scanner.nextLine();

        if (studentScores.containsKey(studentName)) {
            int score = studentScores.get(studentName);
            System.out.println(studentName + "'s score is: " + score);
        } else {
            System.out.println(studentName + " is not in the list.");
        }

        // Adding a new entry
        System.out.print("\nEnter a new student name: ");
        String newStudentName = scanner.nextLine();
        System.out.print("Enter the score for " + newStudentName + ": ");
        int newScore = scanner.nextInt();

        studentScores.put(newStudentName, newScore);

        // Displaying scores after adding a new entry
        System.out.println("\nScores after adding " + newStudentName + ":");
        printScores(studentScores);

        scanner.close();
    }

    private static void printScores(Map<String, Integer> scores) {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

