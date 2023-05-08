package Abstraction;

public class Circle {

    // circle consists of a center(point x, y) and radius

    Point center; // Object of point called center
    double radius;

    int x;
    int y;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;

    }

    // Area of Circle
    public double CalculateArea() {
        return Math.PI * radius * radius;
    }

}
