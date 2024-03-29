import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        if (sc.hasNextDouble() && sc.hasNextDouble()){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println("is double");
            double ave = (num1+num2)/2;
            System.out.println("Average = " + ave);
        }
        else {
            System.out.println("Not");
        }

    }
}
