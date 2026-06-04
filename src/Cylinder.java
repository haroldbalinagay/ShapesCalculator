public class Cylinder {
    private double radius;
    private double height;
    Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public void setRadius(double radius){
        if (radius <= 0){
            IO.println("Error radius must be a positive number");
            return;
        }
        this.radius = radius;
    }
    public void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    public double calculateSurfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
    public double calculateVolume(){
        return  Math.PI * radius * height * radius;
    }
}