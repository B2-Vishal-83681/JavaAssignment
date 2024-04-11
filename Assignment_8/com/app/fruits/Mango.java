package com.app.fruits;

public class Mango extends Fruit{

    public Mango(String color, Double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }
    public String taste(){
        return "sour";
    }
}
