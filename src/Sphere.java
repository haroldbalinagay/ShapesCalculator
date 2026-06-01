public class Sphere {
    double radius;
    Sphere(double radius) {
        setRadius(radius);
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double radius){
        if (radius <= 0){
            IO.println("Error radius must be a positive number");
            return;
        }
        this.radius = radius;
    }
    double calculateSurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    double calculateVolume(){
        return (4.0/3.0) * Math.PI * (radius * radius * radius);
    }
}
