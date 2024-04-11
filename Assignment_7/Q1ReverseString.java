import java.util.Scanner;

public class Q1ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String = ");
        String s1 = sc.nextLine();
        StringBuffer s2 = new StringBuffer(s1);
        s2.reverse();
        System.out.println("Reverse String is = " + s2);

    }
}
