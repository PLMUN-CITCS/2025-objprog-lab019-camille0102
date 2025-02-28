import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        
        // Loop until a valid non-negative integer is entered
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Error: The number must be non-negative.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // consume the invalid input
            }
        }
        
        return number;
    }

    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1;
        
        // Factorial of 0 is 1 by definition
        if (n == 0) {
            return factorial;
        }

        // Loop to calculate the factorial for n > 0
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);
        
        // Display the result to the user
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
