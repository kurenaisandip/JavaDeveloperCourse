public class Rectangle implements Shape {

    double width = 0;
    double height = 0;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double CalculateArea() {
        return width * height;
    }

    @Override
    public double CalculatePerimeter() {
        return 2 * (height * width);
    }
}
