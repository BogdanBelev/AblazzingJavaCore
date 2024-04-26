package OOP.Polymorphism.Interfaces.interface_inharitance;

public interface Eatable {
    default void eat(){
        System.out.println("Someone eats");
    };
}
