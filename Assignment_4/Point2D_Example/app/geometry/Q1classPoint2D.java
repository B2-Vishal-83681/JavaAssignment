package com.app.geometry;

public class Q1classPoint2D {

    private int x;
    private int y;

    public Q1classPoint2D(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public String getDetails() {
        return "(" + x + " , " + y + ")";
    }
    public boolean isEqual(Q1classPoint2D other) {
        return this.x == other.x && this.y == other.y;

    }
    public double calculateDistance(Q1classPoint2D other) {
        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }

}