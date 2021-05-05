package JavaTraining.Polymorphism.Assignment4;

public class PrintPerimeterAndArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.printf("rectangle length: %d, breadth: %d\n",rectangle.length,rectangle.breadth);
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(15);
        System.out.printf("\nSquare side: %d\n",square.side);
        square.printArea();
        square.printPerimeter();
    }
}
