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
    public void printCircle(){
        if (filled) {
            IO.println("Filled Circle, radius = " + Math.round(radius) + ":");
        }
        else {
            IO.println("Hollow Circle, radius = " + Math.round(radius) + ":");
        }

        int r = (int) Math.round(radius);

        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) {
                double x = j;
                double y = i;
                double distanceSq = (x * x) + (y * y);
                if (filled) {
                    if (distanceSq <= (r * r)) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                } else {
                    if (distanceSq <= (r * r) && distanceSq >= (r - 1) * (r - 1)) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                }
            }
            IO.println("");
        }
    }
}