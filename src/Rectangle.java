public class Rectangle {
    // UNDERSTAND: Private restricts access with the use of getter/setters.
    // DECISION: dimensions is stored as double to support fractional measurements.
    private double height;
    private double width;
    private boolean filled;
    // Constructor
    // UNDERSTAND: Called when a new Square object is created initializes object state
    // DECISION:  Uses setter to validate input.
    Rectangle(double width, double height, boolean filled) {
        setHeight(height);
        setWidth(width);
        setFilled(filled);
    }
    // UNDERSTAND: Provides access to private field
    // DECISION: No validation needed in getter, only returning value of measurement.
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public boolean isFilled(){
        return filled;
    }
    //UNDERSTAND: Modifies the value of the object with checking for valid input
    //DECISION: Returns when input is invalid to not change property.
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    public void setWidth(double width){
        if (width <= 0){
            IO.println("Error width must be a positive number");
            return;
        }
        this.width = width;
    }
    // Method to calculate area
    // UNDERSTAND: Returns area of a rectangle = height * width.
    // DECISION: follow Single Responsibility Principle
    public double calculateArea(){
        return height * width;
    }
    // Method to calculate perimeter
    // UNDERSTAND: Returns perimeter of a rectangle = (height + width) * 2
    // DECISION: follow Single Responsibility Principle
    public double calculatePerimeter(){
        return (height + width) * 2;
    }
    public void printRectangle(){
            if (filled) {
                IO.println("Filled Rectangle:");
            }
            else{
                IO.println("Hollow Rectangle:");
            }
            // UNDERSTAND: Rounded height and width to accommodate more accurate representation
            // DECISION: use Math.round on height and width
            for (int i = 0; i < Math.round(height); i++) {
                for (int j = 0; j < Math.round(width); j++) {
                    if (filled) {
                        IO.print("* ");
                    }
                    else {
                        // UNDERSTAND: Needs to print only on borders
                        // DECISION: Used conditional statement to print only on specific lines.
                        if (i == 0||i == (Math.round(height)-1) || j == 0 || j == (Math.round(width)-1)) {
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
