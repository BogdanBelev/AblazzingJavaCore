package OOP.Polymorphism.Interfaces.practices;

public class Airplane implements Fly{
    String name = "airplane";

    @Override
    public void fly() {
        System.out.printf("The %s flies\n", name);
    }
}
