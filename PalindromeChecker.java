import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase(); // Remove spaces and convert to lowercase
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
Example Input/Output:
Enter a string to check if it's a palindrome: madam
The string "madam" is a palindrome.

Enter a string to check if it's a palindrome: hello
The string "hello" is not a palindrome.
*/
