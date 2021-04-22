package inheritance;

public class ChildClass extends Baseclass{
    String childVar = publicVar;

    public String getChildVar() {
        return childVar;
    }

    public void setChildVar(String childVar) {
        this.childVar = childVar;
    }
}
