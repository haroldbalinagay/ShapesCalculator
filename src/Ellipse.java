public class Ellipse {
    double semiMajorAxis;
    double semiMinorAxis;
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
    double getSemiMajorAxis() {
        return semiMajorAxis;
    }
    double getSemiMinorAxis() {
        return semiMinorAxis;
    }
    void setSemiMajorAxis(double semiMajorAxis) {
        if (semiMajorAxis <= 0) {
            IO.println("Error semi major axis must be a positive number");
            return;
        }
        this.semiMajorAxis = semiMajorAxis;
    }
    void setSemiMinorAxis(double semiMinorAxis) {
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
    double calculateArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }
    double calculatePerimeter() {
        if(semiMajorAxis == semiMinorAxis){
            return Math.PI * semiMajorAxis * 2;
        }
        double h = ((semiMajorAxis - semiMinorAxis) * (semiMajorAxis - semiMinorAxis))/ ((semiMajorAxis + semiMinorAxis)*(semiMajorAxis + semiMinorAxis));
        return (Math.PI * (semiMajorAxis + semiMinorAxis)) * (1 + ((3*h) / (10 + Math.sqrt(4-3 * h))));
    }
    boolean isCircle(){
        return (semiMajorAxis == semiMinorAxis);
    }
}
