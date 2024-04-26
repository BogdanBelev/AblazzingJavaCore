package OOP.Polymorphism.instanseof_ex;

public class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Animal[] zoo = new Animal[2];
        zoo[0] = cat;
        zoo[1] = dog;

        for (Animal animal : zoo) {
            if(animal instanceof Cat cat1) {
                cat1.sayMeow();
            }
        }

    }
}
