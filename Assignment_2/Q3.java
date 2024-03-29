import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        float bill = 0;
        while (true) {
            System.out.println("Select from the menu");
            System.out.println("1.Dosa");
            System.out.println("2.Samosa");
            System.out.println("3.Idli");
            System.out.println("4.Poha");
            System.out.println("5.Vadapav");
            System.out.println("6.Curd Rice");
            System.out.println("7.Lemon Rice");
            System.out.println("8.White Rice");
            System.out.println("9.Generate Bill");
            System.out.println("10.Exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice = ");
            int item = sc.nextInt();
            System.out.println(item);
            int quantity;
            switch (item) {
                case 1:
                    System.out.println("You selected Dosa and price is 50 per piece");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 50;
                    break;
                case 2:
                    System.out.println("You selected Samosa and price is 15 per person");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 15;
                    break;
                case 3:
                    System.out.println("You selected Idli and price is 20 per person");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 20;
                    break;
                case 4:
                    System.out.println("You selected Poha and price is 25 per person");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 25;
                    break;
                case 5:
                    System.out.println("You selected Vadapav Rice and price is 10 per person");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 10;
                    break;
                case 6:
                    System.out.println("You selected Curd Rice and price is 70 per person");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 70;
                    break;
                case 7:
                    System.out.println("You selected Lemon Rice and price is 65 per person");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 65;
                    break;
                case 8:
                    System.out.println("You selected White Rice and price is 60 per person");
                    System.out.println("Enter quantity = ");
                    quantity = sc.nextInt();
                    bill += quantity * 60;
                    break;
                case 9:
                    System.out.println("Your total bill is = " + bill);
                case 10:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }
        }
    }
}
