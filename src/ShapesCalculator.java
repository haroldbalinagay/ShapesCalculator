public class ShapesCalculator {
    void main(){
        int choice = 0;
        while (choice !=3){
            IO.println("=====================================================");
            IO.println("                GEOMETRY CALCULATOR");
            IO.println("=====================================================");
            IO.println("1. 2D Shapes Calculator");
            IO.println("1. 3D Shapes Calculator");
            IO.println("3. Exit");
            IO.println("=====================================================");
            choice = Integer.parseInt(IO.readln("Enter your choice (1-3)"));
            switch (choice){
                case 1:twoDShapes();
                //case 2:threeDShapes();
                case 3: break;
            }
        }
    }
    void twoDShapes(){
        IO.println("=====================================================");
        IO.println("                2D Shapes Calculator");
        IO.println("=====================================================");
        IO.println("1. 2D Shapes Calculator");
        IO.println("1. 3D Shapes Calculator");
        IO.println("3. Exit");
        IO.println("4. 2D Shapes Calculator");
        IO.println("5. 3D Shapes Calculator");
        IO.println("6. Exit");
    }
}

