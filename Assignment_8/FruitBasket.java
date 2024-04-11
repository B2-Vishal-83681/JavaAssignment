import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basket size = ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;
        while (true){
            System.out.println("1.Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in the basket");
            System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
            System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits stale");
            System.out.println("9. Exit");
            System.out.println("Enter your choice = ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    if(counter < size){
                        System.out.println("Enter color = ");
                        String color = sc.next();
                        System.out.println("Enter weight = ");
                        double weight = sc.nextDouble();
                        System.out.println("Enter name = ");
                        String name = sc.next();
                        basket[counter++] = new Mango(color,weight,name,true);
                    }
                    else {
                        System.out.println("Basket is full");
                    }
                    break;
                case 2:
                    if(counter < size){
                        System.out.println("Enter color = ");
                        String color = sc.next();
                        System.out.println("Enter weight = ");
                        double weight = sc.nextDouble();
                        System.out.println("Enter name = ");
                        String name = sc.next();
                        basket[counter++] = new Orange(color,weight,name,true);
                    }
                    else {
                        System.out.println("Basket is full");
                    }
                    break;
                case 3:
                    if(counter < size){
                        System.out.println("Enter color = ");
                        String color = sc.next();
                        System.out.println("Enter weight = ");
                        double weight = sc.nextDouble();
                        System.out.println("Enter name = ");
                        String name = sc.next();
                        basket[counter++] = new Apple(color,weight,name,true);
                    }
                    else {
                        System.out.println("Basket is full");
                    }
                    break;
                case 4:
                    for (Fruit fruit : basket){
                        if (fruit != null){
                            System.out.println(fruit.getName());
                        }
                    }
                    break;
                case 5:
                    for (Fruit fruit : basket){
                        if (fruit != null && fruit.isFresh()){
                            System.out.println(fruit.toString() + " taste = " + fruit.taste());
                        }
                    }
                    break;
                case 6:
                    for (Fruit fruit : basket){
                        if (fruit != null && !fruit.isFresh()){
                            System.out.println("taste=" + fruit.taste());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter Index = ");
                    int Index = sc.nextInt();
                    if (Index >= 0 && Index < counter) {
                        basket[Index].isFresh();
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 8:
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.taste().equals("sour")) {
                            fruit.isFresh();
                        }
                    }
                    break;

                case 9:
                    return;

            }
        }
    }
}
