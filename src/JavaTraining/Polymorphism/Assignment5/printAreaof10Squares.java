package JavaTraining.Polymorphism.Assignment5;

import JavaTraining.Polymorphism.Assignment4.Square;
import org.junit.jupiter.api.Test;

public class printAreaof10Squares {
    Square square;
    @Test
    public void printAreaof10Squares() {
        for(int i =0; i <10; i++){
            square= new Square(i+5);
            square.printArea();
        }
    }
}
