public class ShapesCalculator {
    void main() {
        int choice = 0;
        boolean run = true;
        while (run) {
            IO.println("=====================================================");
            IO.println("                GEOMETRY CALCULATOR");
            IO.println("=====================================================");
            IO.println("1. 2D Shapes Calculator");
            IO.println("2. 3D Shapes Calculator");
            IO.println("3. Exit");
            IO.println("=====================================================");
            choice = Integer.parseInt(IO.readln("Enter your choice (1-3) "));
            switch (choice) {
                case 1:
                    twoDShapes();
                    break;
                case 2:
                    threeDShapes();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    IO.println("Please enter a valid input");
            }
        }
    }

    void twoDShapes() {
        int choice = 0;
        while (choice != 6) {
            IO.println("=====================================================");
            IO.println("                2D Shapes Calculator");
            IO.println("=====================================================");
            IO.println("1. Square");
            IO.println("2. Rectangle");
            IO.println("3. Circle");
            IO.println("4. Ellipse");
            IO.println("5. Triangle");
            IO.println("6. Return to Main Menu");
            choice = Integer.parseInt(IO.readln("Enter your choice (1-6) "));
            switch (choice) {
                case 1:
                    IO.println("\nSquare:");
                    double side = Double.parseDouble(IO.readln("Enter side length: "));
                    Square square = new Square(side, true);
                    IO.println("\nResults:");
                    IO.println(String.format("Perimeter: %.2f", square.calculatePerimeter()));
                    IO.println(String.format("Area: %.2f", square.calculateArea()));
                    square.printSquare();
                    break;
                case 2:
                    IO.println("\nRectangle:");
                    double width = Double.parseDouble(IO.readln("Enter width: "));
                    double height = Double.parseDouble(IO.readln("Enter height: "));
                    Rectangle rectangle = new Rectangle(width, height, true);
                    IO.println("\nResults:");
                    IO.println(String.format("Perimeter: %.2f", rectangle.calculatePerimeter()));
                    IO.println(String.format("Area: %.2f", rectangle.calculateArea()));
                    rectangle.printRectangle();
                    break;
                case 3:
                    IO.println("\nCircle:");
                    double radius = Double.parseDouble(IO.readln("Enter radius: "));
                    Circle circle = new Circle(radius, true);
                    IO.println("\nResults:");
                    IO.println(String.format("Perimeter: %.2f", circle.calculatePerimeter()));
                    IO.println(String.format("Area: %.2f", circle.calculateArea()));
                    circle.printCircle();
                    break;
                case 4:
                    IO.println("\nEllipse:");
                    double axis1 = Double.parseDouble(IO.readln("Enter first axis: "));
                    double axis2 = Double.parseDouble(IO.readln("Enter second axis: "));
                    Ellipse ellipse = new Ellipse(axis1, axis2, true);
                    IO.println("\nResults:");
                    IO.println(String.format("Perimeter: %.2f", ellipse.calculatePerimeter()));
                    IO.println(String.format("Area: %.2f", ellipse.calculateArea()));
                    ellipse.printEllipse();
                    break;
                case 5:
                    IO.println("\nTriangle:");
                    double base = Double.parseDouble(IO.readln("Enter base: "));
                    double heightTri = Double.parseDouble(IO.readln("Enter height: "));
                    Triangle triangle = new Triangle(base, heightTri, true);
                    IO.println("\nResults:");
                    IO.println(String.format("Perimeter: %.2f", triangle.calculatePerimeter()));
                    IO.println(String.format("Area: %.2f", triangle.calculateArea()));
                    triangle.printTriangle();
                    break;
                case 6:
                    break;
                default:
                    IO.println("Please enter a valid input");
            }
        }
    }

    void threeDShapes() {
        int choice = 0;
        while (choice != 6) {
            IO.println("=====================================================");
            IO.println("                2D Shapes Calculator");
            IO.println("=====================================================");
            IO.println("1. Cube");
            IO.println("2. Cuboid");
            IO.println("3. Sphere");
            IO.println("4. Cone");
            IO.println("5. Cylinder");
            IO.println("6. Return to Main Menu");
            choice = Integer.parseInt(IO.readln("Enter your choice (1-6) "));
            switch (choice) {
                case 1:
                    IO.println("\nCube:");
                    double side = Double.parseDouble(IO.readln("Enter side length: "));
                    Cube cube = new Cube(side);
                    IO.println("\nResults:");
                    IO.println(String.format("Surface Area: %.2f", cube.calculateSurfaceArea()));
                    IO.println(String.format("Volume: %.2f", cube.calculateVolume()));
                    break;
                case 2:
                    IO.println("\nCuboid:");
                    double length = Double.parseDouble(IO.readln("Enter length: "));
                    double width = Double.parseDouble(IO.readln("Enter width: "));
                    double height = Double.parseDouble(IO.readln("Enter height: "));
                    Cuboid cuboid = new Cuboid(length,width, height );
                    IO.println("\nResults:");
                    IO.println(String.format("Surface Area: %.2f", cuboid.calculateSurfaceArea()));
                    IO.println(String.format("Volume: %.2f", cuboid.calculateVolume()));
                    break;
                case 3:
                    IO.println("\nSphere:");
                    double radius = Double.parseDouble(IO.readln("Enter radius: "));
                    Sphere sphere = new Sphere(radius);
                    IO.println("\nResults:");
                    IO.println(String.format("Surface Area: %.2f", sphere.calculateSurfaceArea()));
                    IO.println(String.format("Volume: %.2f", sphere.calculateVolume()));
                    break;
                case 4:
                    IO.println("\nCone:");
                    double radiusCone = Double.parseDouble(IO.readln("Enter radius: "));
                    double heightCone = Double.parseDouble(IO.readln("Enter height: "));
                    Cone cone = new Cone(radiusCone, heightCone);
                    IO.println("\nResults:");
                    IO.println(String.format("Surface Area: %.2f", cone.calculateSurfaceArea()));
                    IO.println(String.format("Volume: %.2f", cone.calculateVolume()));
                    break;
                case 5:
                    IO.println("\nCylinder:");
                    double radiusCyl = Double.parseDouble(IO.readln("Enter radius: "));
                    double heightCyl = Double.parseDouble(IO.readln("Enter height: "));
                    Cylinder cylinder = new Cylinder(radiusCyl, heightCyl);
                    IO.println("\nResults:");
                    IO.println(String.format("Surface Area: %.2f", cylinder.calculateSurfaceArea()));
                    IO.println(String.format("Volume: %.2f", cylinder.calculateVolume()));
                    break;
                case 6:
                    break;
                default:
                    IO.println("Please enter a valid input");
            }
        }
    }
}