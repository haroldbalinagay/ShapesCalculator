public class Ellipse {
    private double semiMajorAxis;
    private double semiMinorAxis;
    private boolean filled;
    Ellipse(double Axis1, double Axis2,boolean filled) {
        if (Axis1 > Axis2){
            setSemiMajorAxis(Axis1);
            setSemiMinorAxis(Axis2);
            setFilled(filled);
        }
        else{
            setSemiMajorAxis(Axis2);
            setSemiMinorAxis(Axis1);
            setFilled(filled);
        }
    }
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }
    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setSemiMajorAxis(double semiMajorAxis) {
        if (semiMajorAxis <= 0) {
            IO.println("Error semi major axis must be a positive number");
            return;
        }
        this.semiMajorAxis = semiMajorAxis;
    }
    public void setSemiMinorAxis(double semiMinorAxis) {
        if (semiMinorAxis <= 0) {
            IO.println("Error semi major axis must be a positive number");
            return;
        }
        if (semiMinorAxis > semiMajorAxis) {
            IO.println("Error semi major axis must be less than or equal to semi major axis");
            return;
        }
        this.semiMinorAxis = semiMinorAxis;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public double calculateArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }
    public double calculatePerimeter() {
        if(semiMajorAxis == semiMinorAxis){
            return Math.PI * semiMajorAxis * 2;
        }
        double h = ((semiMajorAxis - semiMinorAxis) * (semiMajorAxis - semiMinorAxis))/ ((semiMajorAxis + semiMinorAxis)*(semiMajorAxis + semiMinorAxis));
        return (Math.PI * (semiMajorAxis + semiMinorAxis)) * (1 + ((3*h) / (10 + Math.sqrt(4-3 * h))));
    }
    public boolean isCircle(){
        return (semiMajorAxis == semiMinorAxis);
    }
    public void printEllipse(){
        if (filled) {
            IO.println("Filled Ellipse, Semi Major = " + Math.round(semiMajorAxis) + " Semi Minor = " + Math.round(semiMinorAxis) +":");
        }
        else {
            IO.println("Hollow Ellipse, Semi Major = " + Math.round(semiMajorAxis) + " Semi Minor = " + Math.round(semiMinorAxis) +":");
        }
        int a = (int) Math.round(semiMajorAxis);
        int b = (int) Math.round(semiMinorAxis);
        int limit = a * a * b * b;

        for (int i = -b; i <= b; i++) {
            for (int j = -a; j <= a; j++) {
                int currentPos = (j * j * b * b) + (i * i * a * a);

                if (filled) {
                    if (currentPos <= limit) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                } else {
                    int nextX = ((Math.abs(j) + 1) * (Math.abs(j) + 1) * b * b) + (i * i * a * a);
                    int nextY = (j * j * b * b) + ((Math.abs(i) + 1) * (Math.abs(i) + 1) * a * a);

                    if (currentPos <= limit && (nextX >= limit || nextY >= limit)) {
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
