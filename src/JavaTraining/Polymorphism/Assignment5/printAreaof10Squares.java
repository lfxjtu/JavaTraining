package JavaTraining.Polymorphism.Assignment5;

import JavaTraining.Polymorphism.Assignment4.Square;

public class printAreaof10Squares {
    public static void main(String[] args) {
        for(int i =0; i <10; i++){
            Square square= new Square(i+5);
            square.printArea();
        }
    }
}
