public class Triangle {
    private double height;
    private double base;
    private boolean filled;
    Triangle(double base, double height, boolean filled) {
        setHeight(height);
        setBase(base);
        setFilled(filled);
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setHeight(double height){
        if (height <= 0){
            IO.println("Error height must be a positive number");
            return;
        }
        this.height = height;
    }
    public void setBase(double base){
        if (base <= 0){
            IO.println("Error base must be a positive number");
            return;
        }
        this.base = base;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public double calculateArea(){
        return (height * base)/2;
    }
    public double calculatePerimeter(){
        return base * 3;
    }
    public void printTriangle() {
        if (filled) {
            IO.println("Filled Triangle, base = " + Math.round(base) + ", height = " + Math.round(height) + ":");
        } else {
            IO.println("Hollow Triangle, base = " + Math.round(base) + ", height = " + Math.round(height) + ":");
        }
        int h = (int) Math.round(height);
        int b = (int) Math.round(base);
        int center = b / 2;
        int denom = (h > 1) ? 2 * (h - 1) : 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                int distanceFromMid = Math.abs(j - center);
                boolean isInside = (h > 1) ? (distanceFromMid * denom <= i * b) : true;
                if (filled) {
                    if (isInside) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                } else {
                    boolean isBottom = (i == h - 1);
                    boolean nextXOutside = (h > 1) ? (((distanceFromMid + 1) * denom) > i * b) : false;
                    if (isInside && (isBottom || nextXOutside || i == 0)) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                }
            }
            IO.println("");
        }
    }
}
