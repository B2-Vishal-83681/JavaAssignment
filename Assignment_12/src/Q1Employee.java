interface Employee {
    double getSal();

    default double calcIncentives() {
        return 0.0;
    }
    static double calcTotalIncome(Employee arr[]){
        double totalIncome = 0.0;
        for (Employee e : arr){
            totalIncome += e.getSal() + e.calcIncentives();
        }
        return totalIncome;
    }
}
class Manager implements Employee{
    double basicSalary;
    double dearanceAllowance;

    public Manager(double basicSalary, double dearanceAllowance) {
        this.basicSalary = basicSalary;
        this.dearanceAllowance = dearanceAllowance;
    }

    @Override
    public double getSal() {
        return basicSalary + dearanceAllowance;
    }

    @Override
    public double calcIncentives() {
        return 0.2 * basicSalary;
    }
}

class Labor implements Employee{

    double hour;
    double rate;

    public Labor(double hour, double rate) {
        this.hour = hour;
        this.rate = rate;
    }

    @Override
    public double getSal() {
        return hour * rate;
    }

    @Override
    public double calcIncentives() {
        if (hour > 300){
            return 0.05 * getSal();
        }
        else {
            return 0;
        }
    }
}
class Clerk implements Employee{
    double salary;

    public Clerk(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSal() {
        return salary;
    }
}
public class Q1Employee {
    public static void main(String args[]){
        Employee [] e1 = new Employee[]{
                new Manager(90000, 5000),
                new Labor(100, 5),
                new Clerk(60000)
        };

        double totalIncome = Employee.calcTotalIncome(e1);
        System.out.println("Total Income of all Employee = " + totalIncome);

    }
}

