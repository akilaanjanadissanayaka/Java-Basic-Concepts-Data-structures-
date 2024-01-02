package ArrayStructures;


import java.io.IOException;
import java.util.ArrayList;

public class List {
    public static int simpleArraySum(java.util.List<Integer> ar) {
        int length=ar.size() ;
        int tot=0;
        for(int i=0;i<length;i++){
            tot+= ar.get(i);
        }
        return tot;

    }

    public static void main(String[] args) {

        // Define an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Update an element at index 2
        numbers.set(2, 35);

        // Print the ArrayList after updating
        System.out.println("ArrayList after updating element at index 2: " + numbers);

        // Delete an element at index 3
        int indexToDelete = 3;
        numbers.remove(indexToDelete);

        // Print the ArrayList after deletion
        System.out.println("ArrayList after deleting element at index 3: " + numbers);


        //call by index
        System.out.println("oth index "+numbers.get(3));

    }
}
