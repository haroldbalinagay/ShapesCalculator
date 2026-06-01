public class Cuboid {
    double length;
    double width;
    double height;
    Cuboid(double length, double width, double height ) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    double getLength() {
        return length;
    }
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
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
            IO.println("Error width must be a positive number");
            return;
        }
        this.width = width;
    }
    void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    double calculateSurfaceArea(){
        return 2 * (length * height + length * width + width * height);
    }
    double calculateVolume(){
        return length * width * height;
    }
}
