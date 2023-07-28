// 6. Write a Java program to find duplicate values in an array of string values
import java.util.*;
public class P6FindDuplicate {
    public static void main(String[] args) {
        // Initialize array.
        String[] arr = new String[] {"apple", "banana", "apple", "orange", "grape", "banana"};

        // Create a HashSet to store the unique elements.
        HashSet<String> set = new HashSet<>();

        // Loop through the array and add the unique elements to the HashSet.
        for (String value : arr) {
            if (set.contains(value)) {
                System.out.println("Duplicate element: " + value);
            } else {
                set.add(value);
            }
        }
    }
}
