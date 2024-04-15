import java.util.Scanner;

interface Chec1k<T> {
    boolean compare(T x, T y);
}
public class Q5 {
    static <T> int countIf(T[] arr, T key, Check<T> c) {
        int count = 0;
        for (T element : arr) {
            if (c.compare(element, key)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Integer[] arrInt = {44, 77, 99, 22, 55, 66};
        Double[] arrDouble = {2.5, 3.0, 2.5, 4.5, 3.0, 2.5}; // Example array of Double with repeated elements

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a key to check repetitions in the Double array: ");
        Double key = scanner.nextDouble();

        int cnt = countIf(arrDouble, key, (x, y) -> x.equals(y));
        System.out.println("Count of key in the Double array: " + cnt);

        scanner.close();
    }
}
