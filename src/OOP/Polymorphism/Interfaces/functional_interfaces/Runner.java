package OOP.Polymorphism.Interfaces.functional_interfaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat(); //так как cat реализует инт-йс Sounding, можно создать кошку через тип данных Sounding
        cat.makeSound();

        //благодаря функциональному интерфейсу Sounding мы можем (не создавая нового класса Bird)
        //создать новую реализацию метода makeSound();
        //ВАЖНО! Это работает только с функциональными интерфейсами, у которых один абстр-й метод
        Sounding bird = () -> System.out.println("Bird sings");
        bird.makeSound();
    }
}
