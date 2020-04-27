package Decorator.logic;

public class DecoratorOne extends AbstractDecorator {
    @Override
    public void makeObject() {
        super.makeObject();
        addFunctionality();
    }

    private void addFunctionality() {
        System.out.println("add DecoratorOne functionality to object");
    }
}
