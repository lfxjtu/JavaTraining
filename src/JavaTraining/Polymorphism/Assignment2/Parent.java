package JavaTraining.Polymorphism.Assignment2;

import org.junit.jupiter.api.Test;

public class Parent {
    void printParent(){
        System.out.println("This is a parent class");
    }
    @Test
    void testParent(){
        Parent newParent = new Parent();
        newParent.printParent();
    }
}

