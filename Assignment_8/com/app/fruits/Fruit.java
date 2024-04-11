package com.app.fruits;

public class Fruit {
    String color;
    double weight;
    String name;
    boolean isFresh;

    public Fruit(String color, Double weight, String name, boolean isFresh){
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    @Override
    public String toString() {
        return "Fruit{" + "color='" + color + '\'' + ", weight=" + weight + ", name='" + name + '\'' + '}';
    }

    public String taste(){
        return "no specific taste";
    }
    
}
