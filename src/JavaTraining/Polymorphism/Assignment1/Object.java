package JavaTraining.Polymorphism.Assignment1;

public class Object {
    public static void main(String[] args) {
        Parent newParent = new Parent();
        Child newChild = new Child();
        newParent.printParent();
        newChild.printChild();
        newChild.printParent();
    }
}
