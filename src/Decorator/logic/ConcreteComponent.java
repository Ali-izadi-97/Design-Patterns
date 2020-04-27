package Decorator.logic;

public class ConcreteComponent extends Component {
    @Override
    public void makeObject() {
        System.out.println("Original Object is complete. It is closed for modification.");
    }
}
