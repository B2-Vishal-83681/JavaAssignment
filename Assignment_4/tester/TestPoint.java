package tester;
import com.app.geometry.Q1classPoint2D;
import java.util.Scanner;
public class TestPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter co-ordinate for point 1: ");
        System.out.println("enter x point co-ordinate: ");
        int x1 = sc.nextInt();
        System.out.println("enter y point co-ordinate: ");
        int y1 = sc.nextInt();

        System.out.println("enter co-ordinate for point 2: ");
        System.out.println("enter x point co-ordinate: ");
        int x2 = sc.nextInt();
        System.out.println("enter y point co-ordinate: ");
        int y2 = sc.nextInt();

        Q1classPoint2D p1 = new Q1classPoint2D(x1, y1);
        Q1classPoint2D p2 = new Q1classPoint2D(x2, y2);

        System.out.println("point 1 details.." + p1.getDetails());
        System.out.println("point 2 deatils.." + p2.getDetails());
        if (p1.isEqual(p2)) {
            System.out.println("points are at the same position..");

        }
        else {
            System.out.println("points are at different positions.");
            System.out.println("distance between Point 1 and Point 2: " + p1.calculateDistance(p2));
        }
    }}