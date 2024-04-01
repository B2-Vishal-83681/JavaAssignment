package com.bank.info;

import java.util.Scanner;

public class BankEmployee {
    private String name;
    private int eid;
    private float salary;
    private int age;

    public BankEmployee(){

    }

    public BankEmployee(String name, int eid, float salary, int age) {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int eid) {
        this.eid = eid;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int geteId() {
        return eid;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name = ");
        this.name = sc.next();
        System.out.println("Enter your Employee Id = ");
        this.eid = sc.nextInt();
        System.out.println("Enter your Salary = ");
        this.salary = sc.nextFloat();
        System.out.println("Enter your Age = ");
        this.age = sc.nextInt();
    }
    public void disp(){
        System.out.println("Mr. " + this.name + " your employee id is " + this.eid + "." + " Your salary is " + this.salary + " and your age is " + this.age + "\n");
    }

    @Override
    public String toString() {
        return "BankEmployee{" + "name='" + name + '\'' + ", eid=" + eid + ", salary=" + salary + ", age=" + age + '}';
    }
}
