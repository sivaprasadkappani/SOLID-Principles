package com.edlumens.solid.cohesion.low;

 
public class Square {
    private double sideLength;

    public Square(double sideLength ) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }

    public double calculatePerimeter() {
        return 4 * sideLength;
    }

    public void draw() {
        System.out.println("Drawing a square with side length: " + sideLength);
    }

    public void move(double deltaX, double deltaY) {
        // Change the position of the square
    }
     
}
