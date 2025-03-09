import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        
        while (true) {
            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();
            
            System.out.print("Convert to (C/F) or Q to quit: ");
            char choice = scanner.next().toUpperCase().charAt(0);
            
            if (choice == 'C') {
                double celsius = fahrenheitToCelsius(temperature);
                System.out.printf("Temperature in Celsius: %.2f\n", celsius);
            } else if (choice == 'F') {
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
            } else if (choice == 'Q') {
                System.out.println("Exiting Temperature Converter.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter C, F, or Q to quit.");
            }
        }
        
        scanner.close();
    }
    
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

/*
Example Input/Output:
Enter temperature: 100
Convert to (C/F) or Q to quit: C
Temperature in Celsius: 37.78

Enter temperature: 37.78
Convert to (C/F) or Q to quit: F
Temperature in Fahrenheit: 100.00

Enter temperature: 0
Convert to (C/F) or Q to quit: Q
Exiting Temperature Converter.
*/
