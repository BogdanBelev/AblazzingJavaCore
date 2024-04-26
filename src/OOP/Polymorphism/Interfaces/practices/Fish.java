package OOP.Polymorphism.Interfaces.practices;

public class Fish implements Swim {
    String name = "fish";
    String presenceOfS = "";

    @Override
    public void swim() {
        System.out.printf("The %s swim%s\n", name, presenceOfS);
    }
}
