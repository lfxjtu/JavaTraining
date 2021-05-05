package JavaTraining.Polymorphism.Assignment4;

public class Square extends Rectangle{
    public int side;
    public Square(int s) {
        super(s, s);
        side = s;
    }

    @Override
    public void printArea() {
        System.out.println("The area of this square is: " + (side*side));
    }

    @Override
    public void printPerimeter() {
        System.out.println("The perimeter of this square is: " + (side*4));
    }
}
