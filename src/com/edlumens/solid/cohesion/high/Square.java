package com.edlumens.solid.cohesion.high;

 

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
     
}
