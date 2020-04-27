package Abstract_Factory;

import Abstract_Factory.logic.AppleFactory;
import Abstract_Factory.logic.CompanyFactory;

public class Main {
    public static void main(String[] args) {
        CompanyFactory apple = new AppleFactory();
        apple.computerDetail();
        apple.phoneDetail();
    }
}
