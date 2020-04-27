package Factory.logic.sample1;

public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Cat says: Miyoooo.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Cats prefer Sleeping...\n");
    }
}
