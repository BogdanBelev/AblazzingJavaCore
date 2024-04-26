package OOP.Polymorphism.Interfaces.interface_inharitance;

public interface Alive extends Movable, Eatable {
    @Override
    default void eat() {
        Eatable.super.eat();
    }
}
