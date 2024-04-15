import java.util.function.Predicate;
public class Q2 {
    public static int countIf(String[] arr, Predicate<String> cond) {
        int count = 0;
        for (String str : arr) {
            if (cond.test(str))
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        String[] arr = {"Nilesh","Shubham","Pratik","Omkar","Pranshat"};
        int cnt = countIf(arr, str -> str.length() > 6);
        System.out.println("Result = " + cnt);
    }
}
