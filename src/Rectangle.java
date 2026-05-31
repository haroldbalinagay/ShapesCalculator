public class Rectangle {
    private double height;
    private double width;
    Rectangle(double width, double height) {
        setHeight(height);
        setWidth(width);
    }
    double getHeight() {
        return height;
    }
    double getWidth() {
        return width;
    }
    void setHeight(double height){
        if (height <= 0){
            IO.println("Error length must be a positive number");
            return;
        }
        this.height = height;
    }
    void setWidth(double width){
        if (width <= 0){
            IO.println("Error length must be a positive number");
            return;
        }
        this.width = width;
    }
    double calculateArea(){
        return height * width;
    }
    double calculatePerimeter(){
        return (height + width) * 2;
    }
}
