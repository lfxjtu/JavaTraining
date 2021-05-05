package JavaTraining.Polymorphism.Assignment4;

public class Rectangle {
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int length;
    public int breadth;

    public void printArea() {
        System.out.println("The area of this rectangle is: " + length * breadth);
    }

    public void printPerimeter() {
        System.out.println("The perimeter of this rectangle is: " + (length * 2 + breadth * 2));
    }
}
