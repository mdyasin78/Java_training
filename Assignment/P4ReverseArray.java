// 4. Write a Java program to reverse an array of integer values.
public class P4ReverseArray {
    public static void main(String[] args) {
        // Initialize array.
        int[] arr = new int[] {1, 2, 3, 4, 5};

        // Initialize temp variable.
        int temp;

        // Loop through the array and swap the elements in pairs.
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Print the reversed array.
        System.out.println("The reversed array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
