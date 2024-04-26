package OOP.anonymous_classes;

import OOP.Polymorphism.Interfaces.basics.Dog;

//если нам нужен один экземпляр класса, с конкретными методами, например, 1 собака, которая умеет дышать и есть
//то можно создать анонимный класс прям в раннере, не используя лишние классы и файлы
//но надо понимать, что класса Dog нет, и как-то переиспользовать в будущем нельзя

public class Runner {
    public static void main(String[] args) {
        Alive dog = new Alive() { ///реализация абстрактных методов интерфейса Alive происходит прям в раннере
            @Override
            public void eat() {
                System.out.println("Dog eats");
            }

            @Override
            public void breath() {
                System.out.println("Dog breath");
            }
        };
        dog.breath();
        dog.eat();

        Animal cat = new Animal(){ //также можно создавать анонимные классы и от абстрактных классов
            @Override
            public void eat() {
                System.out.println("Cat eats");
            }
        };

        cat.eat();
    }
}
