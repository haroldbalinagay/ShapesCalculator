public class Ellipse {
    private double semiMajorAxis;
    private double semiMinorAxis;
    Ellipse(double Axis1, double Axis2) {
        if (Axis1 > Axis2){
            setSemiMajorAxis(Axis1);
            setSemiMinorAxis(Axis2);
        }
        else{
            setSemiMajorAxis(Axis2);
            setSemiMinorAxis(Axis1);
        }
    }
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }
    public double getSemiMinorAxis() {
        return semiMinorAxis;
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
}
