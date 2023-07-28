// 8. Write a java program to find the transpose of a Matrix
import java.util.*;
public class P8TransposeMatrix {
    public static void main(String[] args) {
        // Initialize matrix.
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Initialize transpose matrix.
        int[][] transpose = new int[matrix[0].length][matrix.length];

        // Find the transpose.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose matrix.
        System.out.println("The transpose matrix is: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
