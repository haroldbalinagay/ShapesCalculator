public class Cylinder {
    double radius;
    double height;
    Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }
    double getRadius() {
        return radius;
    }
    double getHeight() {
        return height;
    }
    void setRadius(double radius){
        if (radius <= 0){
            IO.println("Error radius must be a positive number");
            return;
        }
        this.radius = radius;
    }
    void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    double calculateSurfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
    double calculateVolume(){
        return  Math.PI * radius * height * radius;
    }
}