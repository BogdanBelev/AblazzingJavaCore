package OOP.Polymorphism.Interfaces.functional_interfaces;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

}
