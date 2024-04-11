import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMax {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int max = Collections.max(numbers);

        System.out.println("Maximum number: " + max);
    }
}