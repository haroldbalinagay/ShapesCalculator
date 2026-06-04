public class Square {
    private double side;
    Square(double side) {
        setSide(side);
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side){
    if (side <= 0){
        IO.println("Error side must be a positive number");
        return;
    }
    this.side = side;
    }
    public double calculateArea(){
        return side * side;
    }
    public double calculatePerimeter(){
        return 4 * side;
    }
}
