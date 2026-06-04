public class Triangle {
    private double height;
    private double base;
    Triangle(double base, double height) {
        setHeight(height);
        setBase(base);
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    public void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    public void setBase(double base){
        if (base <= 0){
            IO.println("Error base must be a positive number");
            return;
        }
        this.base = base;
    }
    public double calculateArea(){
        return (height * base)/2;
    }
    public double calculatePerimeter(){
        return base * 3;
    }
}
