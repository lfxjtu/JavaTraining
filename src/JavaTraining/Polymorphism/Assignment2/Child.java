package JavaTraining.Polymorphism.Assignment2;

import org.junit.jupiter.api.Test;

public class Child extends Parent {
    void printChild() {
        System.out.println("This is a child class");
    }

    @Test
    void testChild() {
        Child newChild = new Child();
        Parent newParent = new Parent();
        newParent.printParent();
        newChild.printChild();
        newChild.printParent();
    }
}
