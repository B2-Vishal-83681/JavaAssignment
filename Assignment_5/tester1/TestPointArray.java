package tester1;

import Q1.Point2D;
import java.util.Scanner;

public class TestPointArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many points to plot: ");
        Point2D[] points = new Point2D[sc.nextInt()];

        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x coordinate for point " + i + ": ");
            double x = sc.nextDouble();
            System.out.print("Enter y coordinate for point " + i + ": ");
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Display distance between specified points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index of the point: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < points.length) {
                        System.out.println("Point " + index + " - X: " + points[index].getX() + ", Y: " + points[index].getY());
                    } else {
                        System.out.println("Invalid index, please retry!");
                    }
                    break;
                case 2:
                    System.out.println("All Points:");
                    for (Point2D point : points) {
                        System.out.println("X: " + point.getX() + ", Y: " + point.getY());
                    }
                    break;
                case 3:
                    System.out.print("Enter index of start point: ");
                    int start = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int end = sc.nextInt();
                    if (start >= 0 && start < points.length && end >= 0 && end < points.length) {
                        if (start != end) {
                            double distance = Math.sqrt(Math.pow(points[end].getX() - points[start].getX(), 2) +
                                    Math.pow(points[end].getY() - points[start].getY(), 2));
                            System.out.println("Distance between point " + start + " and point " + end + ": " + distance);
                        } else {
                            System.out.println("Points are at the same position.");
                        }
                    } else {
                        System.out.println("Invalid indices, please retry!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
