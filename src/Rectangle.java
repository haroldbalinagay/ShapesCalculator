public class Rectangle {
    private double height;
    private double width;
    Rectangle(double width, double height) {
        setHeight(height);
        setWidth(width);
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height){
        if (height <= 0){
            IO.println("Error length must be a positive number");
            return;
        }
        this.height = height;
    }
    public void setWidth(double width){
        if (width <= 0){
            IO.println("Error length must be a positive number");
            return;
        }
        this.width = width;
    }
    public double calculateArea(){
        return height * width;
    }
    public double calculatePerimeter(){
        return (height + width) * 2;
    }
}
