package org.apache.maven;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");

            System.out.print("Choose an operation (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("Square Root: " + Math.sqrt(sqrtInput));
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int factorialInput = scanner.nextInt();
                    System.out.println("Factorial: " + factorial(factorialInput));
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double lnInput = scanner.nextDouble();
                    System.out.println("Natural Logarithm: " + Math.log(lnInput));
                    break;

                case 4:
                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + Math.pow(base, exponent));
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
