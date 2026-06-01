public class ShapesCalculator {
    void main(){
        Square testSquare = new Square(2.6);
        IO.println(testSquare.getSide());
        IO.println(testSquare.calculateArea());
        IO.println(testSquare.calculatePerimeter());
        Rectangle testRectangle = new Rectangle(2.4,6.7);
        IO.println(testRectangle.getHeight());
        IO.println(testRectangle.getWidth());
        IO.println(testRectangle.calculateArea());
        IO.println(testRectangle.calculatePerimeter());
        double testRadius = 3.14;
        Circle testCirlce = new Circle(testRadius);
        IO.println(testCirlce.getRadius());
        IO.println(testCirlce.calculateArea());
        IO.println(testCirlce.calculatePerimeter());
        IO.println(testCirlce.calculateDiameter());
        Ellipse testEllipse = new Ellipse(3.14,3.14);
        IO.println(testEllipse.calculatePerimeter());
    }
}

