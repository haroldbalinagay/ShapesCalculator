public class Cone {
    double radius;
    double height;
    Cone(double radius, double height) {
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
    double calculateSlantHeight(){
        return Math.sqrt((radius * radius) + (height * height));
    }
    double calculateSurfaceArea(){
        double l = calculateSlantHeight();
        return Math.PI * radius * (radius + l);
    }
    double calculateVolume(){
        return (1.0/3.0) * Math.PI * (radius * height * radius);
    }
}