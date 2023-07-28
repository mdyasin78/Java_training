// 10. In a given string remove the occurance of 
// the same element using string buffer and builder classes in Java
import java.util.*;
public class P10RemdupString {
    public static void main(String[] args) {
        // Initialize string.
        String str = "JavaisEasy";

        // Initialize string buffer.
        StringBuffer sb = new StringBuffer();

        // Traverse the string.
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is already present in the string buffer.
            boolean found = false;
            for (int j = 0; j < sb.length(); j++) {
                if (str.charAt(i) == sb.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // If the character is not present in the string buffer, add it to the string buffer.
            if (!found) {
                sb.append(str.charAt(i));
            }
        }

        // Print the string buffer.
        System.out.println("The string after removing duplicates is: " + sb);
    }
}
