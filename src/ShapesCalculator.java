public class ShapesCalculator {
    void main(){
        int choice = 0;
        boolean run = true;
        while (run){
            IO.println("=====================================================");
            IO.println("                GEOMETRY CALCULATOR");
            IO.println("=====================================================");
            IO.println("1. 2D Shapes Calculator");
            IO.println("2. 3D Shapes Calculator");
            IO.println("3. Exit");
            IO.println("=====================================================");
            choice = Integer.parseInt(IO.readln("Enter your choice (1-3) "));
            switch (choice){
                case 1:twoDShapes(); break;
                //case 2:threeDShapes();
                case 3: run = false; break;
                default: IO.println("Please enter a valid input");
            }
        }
    }
    void twoDShapes(){
        IO.println("=====================================================");
        IO.println("                2D Shapes Calculator");
        IO.println("=====================================================");
        IO.println("1. Square");
        IO.println("2. Rectangle");
        IO.println("3. Circle");
        IO.println("4. Ellipse");
        IO.println("5. Triangle");
        IO.println("6. Exit");
    }
}

