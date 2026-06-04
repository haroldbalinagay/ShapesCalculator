public class Cone {
    private double radius;
    private double height;
    Cone(double radius, double height) {
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
    public double calculateSlantHeight(){
        return Math.sqrt((radius * radius) + (height * height));
    }
    public double calculateSurfaceArea(){
        double l = calculateSlantHeight();
        return Math.PI * radius * (radius + l);
    }
    public double calculateVolume(){
        return (1.0/3.0) * Math.PI * (radius * height * radius);
    }
}