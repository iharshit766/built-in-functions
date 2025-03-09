import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take three integer inputs
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");
        
        // Find the maximum number
        int max = findMax(num1, num2, num3);
        
        // Display the result
        System.out.println("The maximum number is: " + max);
        
        scanner.close();
    }
    
    // Function to take input
    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

/*
Example Input/Output:
Enter first number: 10
Enter second number: 25
Enter third number: 15
The maximum number is: 25
*/
