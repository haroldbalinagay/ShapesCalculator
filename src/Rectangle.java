public class Rectangle {
    double length;
    double width;
    Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }
    double getLength() {
        return length;
    }
    double getWidth() {
        return width;
    }
    void setLength(double length){
        if (length <= 0){
            IO.println("Error length must be a positive number");
            return;
        }
        this.length = length;
    }
    void setWidth(double width){
        if (width <= 0){
            IO.println("Error length must be a positive number");
            return;
        }
        this.width = width;
    }
    double calculateArea(){
        return length * width;
    }
    double calculateperimeter(){
        return (length + width) * 2;
    }
}
