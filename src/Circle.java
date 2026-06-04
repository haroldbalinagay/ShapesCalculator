public class Circle {
    private double radius;
    Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius <= 0) {
            IO.println("Error radius must be a positive number");
            return;
        }
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
    public double calculateDiameter(){
        return radius *2;
    }
}