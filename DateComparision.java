import java.time.LocalDate;
import java.util.Scanner;

public class DateComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take first date input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        
        // Take second date input
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());
        
        // Compare the dates and display result
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
        
        scanner.close();
    }
}

/*
Input:
Enter first date (yyyy-MM-dd): 2025-03-09
Enter second date (yyyy-MM-dd): 2025-03-10

Output:
The first date is before the second date.
*/
