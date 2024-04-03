import java.util.Scanner;

public class Q2StringPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter palindrome = ");
        String s1 = sc.next();
        StringBuffer s2 = new StringBuffer(s1);
        s2.reverse();
        String s3 = s2.toString();
        if (s1.equals(s3))
            System.out.println("This is palindrome");
        else
            System.out.println("This is not palindrome");

    }
}
