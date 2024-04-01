package com.bank.tester;
import com.bank.info.*;
public class Main {
    public static void main(String args[]){
        Bank c1 = new Bank();
        c1.accept();
        c1.toString();
        c1.disp();
        System.out.println(" ");

        Customer c2 = new Customer();
        c2.accept();
        c2.toString();
        c2.disp();
        System.out.println(" ");


        BankEmployee b1 = new BankEmployee();
        b1.accept();
        b1.toString();
        b1.disp();
    }
}
