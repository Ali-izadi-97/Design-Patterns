package Factory;

import Factory.logic.sample1.AnimalFactory;
import Factory.logic.sample1.CatFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory cat = new CatFactory();
        cat.makeAnimal();
    }
}
