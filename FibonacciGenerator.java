import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        
        // Generate Fibonacci sequence
        generateFibonacci(terms);
        
        scanner.close();
    }
    
    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first + ", " + second);
        
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }
}

/*
Example Input/Output:
Enter the number of terms for the Fibonacci sequence: 7
Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8
*/
