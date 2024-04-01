package com.bank.info;

import java.util.Scanner;

public class Customer {
    private String name;
    private int id;
    private int dateofbirth;
    private double accountbalance;

    public Customer(){

    }

    public Customer(String name, int id, int dateofbirth, double accountbalance) {
        this.name = name;
        this.id = id;
        this.dateofbirth = dateofbirth;
        this.accountbalance = accountbalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateofbirth(int dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDateofbirth() {
        return dateofbirth;
    }

    public double getAccountbalance() {
        return accountbalance;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name = ");
        this.name = sc.next();
        System.out.println("Enter your Id = ");
        this.id = sc.nextInt();
        System.out.println("Enter your DOB = ");
        this.dateofbirth = sc.nextInt();
        System.out.println("Enter Account Balance = ");
        this.accountbalance = sc.nextInt();
    }
    public void disp(){
        System.out.println("Mr " + this.name + " your customer id is " + this.id + "." + this.dateofbirth + " is your DOB " + "." + " And your account balance is " + this.accountbalance + "\n");
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", id=" + id + ", dateofbirth=" + dateofbirth + ", accountbalance=" + accountbalance + '}';
    }
}
