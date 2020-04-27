package Abstract_Factory.logic;

public class AsusPhone implements Phone {
    @Override
    public void type() {
        System.out.println("this is Asus Phone");
    }

    @Override
    public void action() {
        System.out.println("Call");
    }
}
