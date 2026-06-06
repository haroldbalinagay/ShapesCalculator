public class Circle {
    private double radius;
    private boolean filled;
    Circle(double radius, boolean filled) {
        setRadius(radius);
        setFilled(filled);
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
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
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