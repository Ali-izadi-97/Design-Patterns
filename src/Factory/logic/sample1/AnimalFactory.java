package Factory.logic.sample1;

public interface AnimalFactory {
    default Animal makeAnimal() {
        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }
    public abstract Animal createAnimal();
}
