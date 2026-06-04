public class Rectangle {
    private double height;
    private double width;
    private boolean filled;
    Rectangle(double width, double height, boolean filled) {
        setHeight(height);
        setWidth(width);
        setFilled(filled);
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public boolean isFilled(){
        return filled;
    }
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
    public double calculateArea(){
        return height * width;
    }
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
