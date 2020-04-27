package Abstract_Factory.logic;

public interface CompanyFactory {
    default void phoneDetail() {
        Phone p = phoneFactory();
        p.type();
        p.action();
    }

    default void computerDetail() {
        Computer c = computerFactory();
        c.type();
        c.action();
    }

    Phone phoneFactory();
    Computer computerFactory();
}
