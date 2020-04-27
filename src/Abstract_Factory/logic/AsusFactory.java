package Abstract_Factory.logic;

public class AsusFactory implements CompanyFactory {
    @Override
    public Phone phoneFactory() {
        return new AsusPhone();
    }

    @Override
    public Computer computerFactory() {
        return new AsusComputer();
    }
}
