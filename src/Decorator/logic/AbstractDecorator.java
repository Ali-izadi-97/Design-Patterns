package Decorator.logic;

public class AbstractDecorator extends Component {
    protected Component component;
    public void setTheComponent(Component c) {
        this.component = c;
    }

    @Override
    public void makeObject() {
        if (component != null) {
            component.makeObject();
        } else {
            throw new RuntimeException("please set main component for decorator with setTheComponent()");
        }
    }
}
