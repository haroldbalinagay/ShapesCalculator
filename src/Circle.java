public class Circle {
    double radius;
    final double PI = 3.14;
    Circle(double radius) {
        setRadius(radius);
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        if (radius <= 0) {
            IO.println("Error radius must be a positive number");
            return;
        }
        this.radius = radius;
    }
    double calculateArea() {
        return PI * (radius * radius);
    }
    double calculatePerimeter() {
        return PI * radius * 2;
    }
}