public class Cube{
    private double side;
    Cube(double side) {
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
    public double calculateSurfaceArea(){
        return 6 * side * side;
    }
    public double calculateVolume(){
        return side * side * side;
    }
}
