import java.util.Scanner;

class Date{
    int month;
    int day;
    int year;

    public Date(){

    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month = ");
        this.month = sc.nextInt();
        System.out.println("Enter day = ");
        this.day = sc.nextInt();
        System.out.println("Enter year = ");
        this.year = sc.nextInt();
    }

    public void displayDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}
public class Q3DateTest {
    public static void main(String args[]){
        Date d1 = new Date();
        d1.accept();
        d1.displayDate();
    }
}
