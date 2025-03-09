import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Define an initial date
        LocalDate initialDate = LocalDate.of(2025, 3, 9);
        System.out.println("Initial Date: " + initialDate);
        
        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = initialDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + modifiedDate);
        
        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After Subtracting 3 Weeks: " + finalDate);
    }
}

/*
Input: (No input required, program uses a predefined date)

Output:
Initial Date: 2025-03-09
After Adding 7 Days, 1 Month, and 2 Years: 2027-04-16
After Subtracting 3 Weeks: 2027-03-26
*/
