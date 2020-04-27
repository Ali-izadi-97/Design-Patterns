package Decorator;

import Decorator.logic.ConcreteComponent;
import Decorator.logic.DecoratorOne;
import Decorator.logic.DecoratorTwo;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent noDecorator = new ConcreteComponent();
        noDecorator.makeObject();

        System.out.println();
        DecoratorOne decoratorOne = new DecoratorOne();
        decoratorOne.setTheComponent(noDecorator);
        decoratorOne.makeObject();

        System.out.println();
        DecoratorTwo decoratorTwo = new DecoratorTwo();
        decoratorTwo.setTheComponent(decoratorOne);
        decoratorTwo.makeObject();
    }
}
