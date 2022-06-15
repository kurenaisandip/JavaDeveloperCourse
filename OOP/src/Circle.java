public class Circle {

    // Circle consists of a center (point x, y) and radius

    Point centre;
    double radius;


    int x;
    int y;

    public Circle (Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Area of circle
    public double CalculateArea(){
        return Math.PI * radius * radius;
    }
}
