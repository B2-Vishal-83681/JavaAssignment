import java.util.ArrayList;

public class Q3ArrayListReplace {
    public static void main(String args[]){
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        System.out.println("Original list of numbers = " + n1);

        n1.set(1,10);
        System.out.println("Update list of numbers = " + n1);
    }
}
