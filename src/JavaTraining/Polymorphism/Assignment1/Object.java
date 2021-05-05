package JavaTraining.Polymorphism.Assignment1;

import org.junit.jupiter.api.Test;

public class Object {
    @Test
    public void testParentChild() {
        Parent newParent = new Parent();
        Child newChild = new Child();
        newParent.printParent();
        newChild.printChild();
        newChild.printParent();
    }
}
