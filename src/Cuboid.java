public class Cuboid {
    private double length;
    private double width;
    private double height;
    Cuboid(double length, double width, double height ) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setLength(double length){
        if (length <= 0){
            IO.println("Error length must be a positive number");
            return;
        }
        this.length = length;
    }
    public void setWidth(double width){
        if (width <= 0){
            IO.println("Error width must be a positive number");
            return;
        }
        this.width = width;
    }
    public void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    public double calculateSurfaceArea(){
        return 2 * (length * height + length * width + width * height);
    }
    public double calculateVolume(){
        return length * width * height;
    }
}
