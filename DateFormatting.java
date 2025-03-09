import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Define different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        // Display the date in different formats
        System.out.println("Current Date in dd/MM/yyyy format: " + currentDate.format(format1));
        System.out.println("Current Date in yyyy-MM-dd format: " + currentDate.format(format2));
        System.out.println("Current Date in EEE, MMM dd, yyyy format: " + currentDate.format(format3));
    }
}

/*
Input: (No input required, program fetches the current system date automatically)

Output:
Current Date in dd/MM/yyyy format: 09/03/2025
Current Date in yyyy-MM-dd format: 2025-03-09
Current Date in EEE, MMM dd, yyyy format: Sun, Mar 09, 2025
*/
