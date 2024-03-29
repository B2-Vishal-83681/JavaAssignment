import java.util.Scanner;
public class Q3practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");
        System.out.println("Enter choice = ");
        String s = sc.next();
        switch(s){

            case"Add":
                System.out.println("num1 + num2 =" +(num1+num2));
                break;
            case"Sub":
                System.out.println("num1 + num2 =" +(num1-num2));
                break;
            case"Mul":
                System.out.println("num1 + num2 =" +(num1*num2));
                break;
            case"Div":
                System.out.println("num1 + num2 =" +(num1/num2));
                break;
            case"0":
                System.out.println("exit");
                break;

        }
    }
}
