import java.util.Scanner;

class CreditLimit{
    int account_number;
    int initial_balance;
    int total_item_charged;
    int total_credits_applied;
    int allowed_credit_limit;
    public CreditLimit (){

    }

    public CreditLimit(int account_number, int initial_balance, int total_item_charged, int total_credits_applied, int allowed_credit_limit) {
        this.account_number = account_number;
        this.initial_balance = initial_balance;
        this.total_item_charged = total_item_charged;
        this.total_credits_applied = total_credits_applied;
        this.allowed_credit_limit = allowed_credit_limit;
    }
    void toAcceptdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number = ");
        this.account_number = sc.nextInt();
        System.out.println("Enter initial balance = ");
        this.initial_balance = sc.nextInt();
        System.out.println("Total item charged = ");
        this.total_item_charged = sc.nextInt();
        System.out.println("Total credit applied = ");
        this.total_credits_applied = sc.nextInt();
        System.out.println("Allowed credit limit = ");
        this.allowed_credit_limit = sc.nextInt();
    }
    public double newBalance(){
        double newBalance = initial_balance + total_item_charged - total_credits_applied;
        return newBalance;
    }
}


public class Q2CreditLimit {
    public static void main(String args[]){
        CreditLimit c1 = new CreditLimit();
        c1.toAcceptdata();
        System.out.println("new balance = " + c1.newBalance());
        double bal = c1.newBalance();
        if (bal > c1.allowed_credit_limit){
            System.out.println("Credit limit exceeded");
        }
    }
}
