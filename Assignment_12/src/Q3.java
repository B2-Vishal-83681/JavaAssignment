import java.util.Scanner;
interface Arithmetic {
    double calc(double num1, double num2);
}

public class Q3 {
    static void calculate(double num1, double num2, Arithmetic op) {
        double result = op.calc(num1, num2);
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice = ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number = ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number = ");
                    num2 = scanner.nextDouble();
                    calculate(num1, num2, (a, b) -> a + b);
                    break;
                case 2:
                    System.out.print("Enter first number = ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number = ");
                    num2 = scanner.nextDouble();
                    calculate(num1, num2, (a, b) -> a - b);
                    break;
                case 3:
                    System.out.print("Enter first number = ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number = ");
                    num2 = scanner.nextDouble();
                    calculate(num1, num2, (a, b) -> a * b);
                    break;
                case 4:
                    System.out.print("Enter first number = ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number = ");
                    num2 = scanner.nextDouble();
                    calculate(num1, num2, (a, b) -> a / b);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        scanner.close();
    }
}
