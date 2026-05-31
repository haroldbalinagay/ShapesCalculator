public class Square {
    double side;
    Square(double side) {
        setSide(side);
    }
    double getSide() {
        return side;
    }
    void setSide(double side){
    if (side <= 0){
        IO.println("Error side must be a positive number");
        return;
    }
    this.side = side;
    }
    double calculateArea(){
        return side * side;
    }
    double calculatePerimeter(){
        return 4 * side;
    }
}
