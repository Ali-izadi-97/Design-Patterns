package Decorator.logic;

public class DecoratorTwo extends AbstractDecorator {

    @Override
    public void makeObject() {
        addFunctionality();
        super.makeObject();
    }

    private void addFunctionality() {
        System.out.println("add DecoratorTwo functionality to object");
    }
}
