public class Circle {
    double radius;
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
        return Math.PI * (radius * radius);
    }
    double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
    double calculateDiameter(){
        return radius *2;
    }
}