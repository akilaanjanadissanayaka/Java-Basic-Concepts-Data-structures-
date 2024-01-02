package ArrayStructures;

import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class convert_string_to_list {
    public static void main(String[] args) throws IOException {
        String s = "hello";
        List<Character> characterList = new ArrayList<>();

        for (char c : s.toCharArray()) {
            // Add each character to the list
            characterList.add(c);
        }
        char x=s.charAt(0);
        // Print the list of characters
        System.out.println("List of characters: " + characterList);

        // You can perform further operations with the characterList here
    }
}
