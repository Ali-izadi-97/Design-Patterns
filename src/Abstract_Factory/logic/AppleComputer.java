package Abstract_Factory.logic;

public class AppleComputer implements Computer {
    @Override
    public void type() {
        System.out.println("this is apple computer");
    }

    @Override
    public void action() {
        System.out.println("programming");
    }
}
