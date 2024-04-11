import java.util.ArrayList;
import java.util.Collections;

public class Q2ArrayList {
    public static void main(String args[]){
        ArrayList<String> color = new ArrayList<String>();
        color.add("Black");
        color.add("White");
        color.add("Red");
        color.add("Yellow");
        System.out.println("Colors = ");
        for (String colors : color){
            System.out.println(colors);
        }
        Collections.sort(color);
        System.out.println("Sorted Colors = ");
        for (String colors : color){
            System.out.println(colors);
        }
    }
}
