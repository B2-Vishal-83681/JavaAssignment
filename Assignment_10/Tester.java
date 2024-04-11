import java.util.EmptyStackException;
import java.util.Scanner;

public class Tester {
    private Stack<Employee> stack;

    public static void main(String[] args) {
        new Tester().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a stack:");
        System.out.println("1. Fixed Stack");
        System.out.println("2. Growable Stack");
        int choice = scanner.nextInt();
        if (choice == 1) {
            stack = new FixedStack<>();
        } else if (choice == 2) {
            stack = new GrowableStack<>();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push data");
            System.out.println("2. Pop data");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Enter employee details:");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                stack.push(new Employee(name, id, salary));
            } else if (option == 2) {
                try {
                    Employee emp = stack.pop();
                    System.out.println("Popped employee: " + emp);
                } catch (EmptyStackException e) {
                    System.out.println("Stack is empty.");
                }
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
