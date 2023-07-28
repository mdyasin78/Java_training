// 7. Write a Java program to add two matrices of the same size.
import java.util.*;

public class P7AddMatrices {
    public static void main(String[] args) {
        // Initialize matrices.
        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[][]{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        // Initialize result matrix.
        int[][] result = new int[matrix1.length][matrix1[0].length];

        // Add the matrices.
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result matrix.
        System.out.println("The result matrix is: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
