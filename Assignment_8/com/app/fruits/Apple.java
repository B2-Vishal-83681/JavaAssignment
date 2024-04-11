package com.app.fruits;

public class Apple extends Fruit{
    public Apple(String color, Double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }
    public String taste(){
        return "sweet n sour";
    }
}
