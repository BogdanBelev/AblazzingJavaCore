package OOP.Polymorphism.Interfaces.dependency_inversion;

import java.lang.reflect.Array;

public class Runner {
    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd();
        Poodle poodle = new Poodle();
        Terrier terrier = new Terrier();

        DogZoo dogZoo1 = new DogZoo(shepherd, terrier);
        DogZoo dogZoo2 = new DogZoo(shepherd, poodle);
    }
}
