// UNDERSTAND: This class models a geometric square.
public class Square {
    // UNDERSTAND: Private restricts access with the use of getter/setters.
// DECISION: side is stored as double to support fractional measurements.
    private double side;
    private boolean filled;
    // Constructor
    // UNDERSTAND: Called when a new Square object is created - initializes object state
    // DECISION:  Uses setter to validate input.
    Square(double side,boolean filled) {
        setSide(side);
        setFilled(filled);
    }
    // UNDERSTAND: Provides access to private field
    // DECISION: No validation needed in getter, only returning value of side.
    public double getSide() {
        return side;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //UNDERSTAND: Modifies the value of the object with checking for valid input
    //DECISION: Returns when input is invalid to not change property.
    public void setSide(double side){
    if (side <= 0){
        IO.println("Error side must be a positive number");
        return;
    }
    this.side = side;
    }
    // Method to calculate area
    // UNDERSTAND: Returns area of a square = side * side.
    // DECISION: follow Single Responsibility Principle
    public double calculateArea(){
        return side * side;
    }
    // Method to calculate perimeter
    // UNDERSTAND: Returns perimeter of a square = 4 * side
    // DECISION: follow Single Responsibility Principle
    public double calculatePerimeter(){
        return 4 * side;
    }
    public void printSquare() {
        if (filled) {
            IO.println("Filled Square:");
        }
        else{
            IO.println("Hollow Square:");
        }
        for (int i = 0; i < Math.round(side); i++) {
            for (int j = 0; j < Math.round(side); j++) {
                if (filled) {
                    IO.print("* ");
                }
                else {
                    if (i == 0||i == (Math.round(side)-1) || j == 0 || j == (Math.round(side)-1)) {
                        IO.print("* ");
                    }
                    else {
                        IO.print("  ");
                    }
                }
            }
            IO.println("");
        }
    }
}
