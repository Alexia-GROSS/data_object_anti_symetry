package org.geomerty.oop.shapes;

import static java.lang.Math.PI;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return PI*radius*radius;
    }

    public double perimeter() {
        return 2*PI*radius;
    }
}
