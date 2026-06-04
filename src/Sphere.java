public class Sphere {
    private double radius;
    Sphere(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        if (radius <= 0){
            IO.println("Error radius must be a positive number");
            return;
        }
        this.radius = radius;
    }
    public double calculateSurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    public double calculateVolume(){
        return (4.0/3.0) * Math.PI * (radius * radius * radius);
    }
}
