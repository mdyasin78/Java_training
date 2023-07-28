// 1. Write a Java program to sum values of an array.
public class P1SumOfArray {

    public static void main(String[] args) {
        // Initialize array.
        int[] arr = new int[] {1, 2, 3, 4, 5};

        // Initialize sum variable.
        int sum = 0;

        // Loop through the array and add each element to the sum variable.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the sum of the array.
        System.out.println("The sum of the array is: " + sum);
    }
}