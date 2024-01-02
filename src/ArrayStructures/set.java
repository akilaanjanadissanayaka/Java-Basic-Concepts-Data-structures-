package ArrayStructures;
import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");

        System.out.println(stringSet); // Output: [Orange, Banana, Apple]
    }
}
