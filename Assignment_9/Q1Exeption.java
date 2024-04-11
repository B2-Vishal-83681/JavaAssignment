import java.util.Scanner;
class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class Q1Exeption {
    public static void main(String[] args) throws ExceptionLineTooLong {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (input.length() > 80) {
            throw new ExceptionLineTooLong("The string is too long");
        }
    }
}
