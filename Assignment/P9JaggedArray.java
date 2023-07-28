// 9. What is a Jagged Array in Java? Implement a Java program to show Jagged array.
// A jagged array in Java is an array of arrays, where each element of the outer array 
// can contain a different number of elements. 
// This means that the jagged array can have a variable number of rows.
import java.util.*;
public class P9JaggedArray {
    public static void main(String[] args) {
        // Initialize jagged array.
        int[][] jaggedArray = new int[][] {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Iterate through the jagged array.
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
