public class Triangle {
    private double height;
    private double base;
    Triangle(double base, double height) {
        setHeight(height);
        setBase(base);
    }
    double getHeight() {
        return height;
    }
    double getBase() {
        return base;
    }
    void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    void setBase(double base){
        if (base <= 0){
            IO.println("Error base must be a positive number");
            return;
        }
        this.base = base;
    }
    double calculateArea(){
        return (height * base)/2;
    }
    double calculatePerimeter(){
        return base * 3;
    }
}
