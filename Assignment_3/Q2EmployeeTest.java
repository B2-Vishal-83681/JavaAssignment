import java.util.Scanner;

class Employee {
    String first_name;
    String last_name;
    double salary;

    public Employee(){

    }
    public Employee(String first_name, String last_name, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getSalary() {
        return salary;
    }
    public double getyearlysalary(){
        return salary * 12;
    }
    public void increament(double percentage){
        this.salary *= (1 + percentage /100);
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name = ");
        this.first_name = sc.next();
        System.out.println("Enter your last name = ");
        this.last_name = sc.next();
        System.out.println("Enter your salary = ");
        this.salary = sc.nextDouble();
    }

}
public class Q2EmployeeTest {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.accept();
        System.out.println("Employee 1 Yearly Salary = " + e1.getyearlysalary());
        e1.increament(10);
        System.out.println("Employee 1 Yearly Salary after 10% increament = " + e1.getyearlysalary());

        System.out.println(" ");

        Employee e2 = new Employee();
        e2.accept();
        System.out.println("Employee 2 Yearly Salary = " + e2.getyearlysalary());
        e2.increament(10);
        System.out.println("Employee 2 Yearly Salary after 10% increament = " + e2.getyearlysalary());


    }

}
