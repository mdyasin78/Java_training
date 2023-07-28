// 2.  Write a Java program to insert an element (specific position) into an array.
import java.util.Scanner;

public class P2InsertElementInArray {
    public static void main(String[] args) {
        // Initialize array.
        int[] arr = new int[] {1, 2, 3, 4, 5};

        // Initialize scanner.
        Scanner sc = new Scanner(System.in);

        // Get the element to be inserted.
        System.out.println("Enter the element to be inserted: ");
        int element = sc.nextInt();

        // Get the position where the element is to be inserted.
        System.out.println("Enter the position where the element is to be inserted: ");
        int position = sc.nextInt();

        // Shift all elements after the position one position to the right.
        for (int i = arr.length - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the element at the specified position.
        arr[position] = element;

        // Print the array.
        System.out.println("The array after inserting the element is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
