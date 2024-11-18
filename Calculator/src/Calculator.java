import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display options to the user
            System.out.println("Options:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                // Exit the calculator
                System.out.println("Exiting...");
                break;
            }

            // Get the two operands from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    // Perform addition
                    result = num1 + num2;
                    break;
                case 2:
                    // Perform subtraction
                    result = num1 - num2;
                    break;
                case 3:
                    // Perform multiplication
                    result = num1 * num2;
                    break;
                case 4:
                    // Perform division
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Display the result to the user
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
