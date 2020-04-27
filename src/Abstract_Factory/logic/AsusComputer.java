package Abstract_Factory.logic;

public class AsusComputer implements Computer {
    @Override
    public void type() {
        System.out.println("this is asus computer");
    }

    @Override
    public void action() {
        System.out.println("programming");
    }
}
