package Abstract_Factory.logic;

public class ApplePhone implements Phone {
    @Override
    public void type() {
        System.out.println("this is apple phone");
    }

    @Override
    public void action() {
        System.out.println("call");
    }
}
