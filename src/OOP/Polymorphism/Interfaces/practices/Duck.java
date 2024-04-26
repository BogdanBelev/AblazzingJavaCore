package OOP.Polymorphism.Interfaces.practices;

public class Duck implements Swim, Fly {
    String name = "duck";
    String presenceOfS = "s";

    @Override
    public void swim() {
        System.out.printf("The %s swim%s\n", name, presenceOfS);
    }

    @Override
    public void fly() {
        System.out.printf("The %s flies\n", name);
    }
}
