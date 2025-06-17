import java.util.Scanner;

public class Calculator {

 
    public static double add(double a, double b) {
        return a + b;
    }

 
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
           
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    case 4:
                        result = divide(num1, num2);
                        if (!Double.isNaN(result)) {
                            System.out.println("Result: " + result);
                        }
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        System.out.println("Calculator exited. Goodbye!");
        scanner.close();
    }
}
