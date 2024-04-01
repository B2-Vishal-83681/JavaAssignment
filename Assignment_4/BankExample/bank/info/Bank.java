package com.bank.info;

import java.util.Scanner;

public class Bank {
    private String name;
    private String location;
    private String IFSC;
    private int Number_of_customer;

    public Bank(){

    }

    public Bank(String name, String location, String IFSC, int number_of_customer) {
        this.name = name;
        this.location = location;
        this.IFSC = IFSC;
        Number_of_customer = number_of_customer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public void setNumber_of_customer(int number_of_customer) {
        this.Number_of_customer = number_of_customer;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getIFSC() {
        return IFSC;
    }

    public int getNumber_of_customer() {
        return Number_of_customer;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name = ");
        this.name = sc.next();
        System.out.println("Enter your location = ");
        this.location = sc.next();
        System.out.println("Enter your IFSC code = ");
        this.IFSC = sc.next();
        System.out.println("Enter number of customer = ");
        this.Number_of_customer = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Bank{" + "name='" + name + '\'' + ", location='" + location + '\'' +", IFSC='" + IFSC + '\'' + ", Number_of_customer=" + Number_of_customer + '}';
    }

    public void disp(){
         System.out.print("Mr " + this.name + " your location is " + this.location + " and the IFSC code is " + this.IFSC + " and mobile number " + this.Number_of_customer + "\n");
     }

}



