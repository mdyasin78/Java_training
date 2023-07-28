
// 5. Write a Java program to remove duplicate elements from an array
import java.util.*;

public class P5RemoveDuplicate {
    public static void main(String[] args) {
        // Initialize array.
        int[] arr = new int[] {1, 2, 3, 3, 4, 5, 5, 6};

        // Create a HashSet to store the unique elements.
        HashSet<Integer> set = new HashSet<>();

        // Loop through the array and add the unique elements to the HashSet.
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Create a new array to store the unique elements.
        int[] uniqueArr = new int[set.size()];

        // Iterate through the HashSet and add the elements to the new array.
        int i = 0;
        for (Integer element : set) {
            uniqueArr[i++] = element;
        }

        // Print the unique array.
        System.out.println("The unique array is: ");
        for (int j = 0; j < uniqueArr.length; j++) {
            System.out.print(uniqueArr[j] + " ");
        }
    }
}
