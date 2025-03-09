import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        // Calculate factorial using recursion
        long result = factorial(number);
        
        // Display the result
        System.out.println("Factorial of " + number + " is: " + result);
        
        scanner.close();
    }
    
    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

/*
Example Input/Output:
Enter a number to calculate its factorial: 5
Factorial of 5 is: 120

Enter a number to calculate its factorial: 7
Factorial of 7 is: 5040
*/
