package Abstract_Factory.logic;

public class AppleFactory implements CompanyFactory {
    @Override
    public Phone phoneFactory() {
        return new ApplePhone();
    }

    @Override
    public Computer computerFactory() {
        return new AppleComputer();
    }
}
