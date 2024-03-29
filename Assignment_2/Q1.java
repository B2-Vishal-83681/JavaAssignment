import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int num = sc.nextInt();
        System.out.println("enter given number = " + num);
        System.out.println("Binary equivalent = " + Integer.toBinaryString(num));
        System.out.println("Octal equivalent = " + Integer.toOctalString(num));
        System.out.println("Hexadecimal = " + Integer.toHexString(num) );
        System.out.println();

    }
}