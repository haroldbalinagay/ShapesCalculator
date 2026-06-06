public class Triangle {
    private double height;
    private double base;
    private boolean filled;
    Triangle(double base, double height, boolean filled) {
        setHeight(height);
        setBase(base);
        setFilled(filled);
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    public boolean isFilled(){
        return filled;
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
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public double calculateArea(){
        return (height * base)/2;
    }
    public double calculatePerimeter(){
        return base * 3;
    }
}
