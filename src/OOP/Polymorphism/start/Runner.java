package OOP.Polymorphism.start;



public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog(); //если у класса есть родитель, то можно создавать экземпляры, относящиеся к родителю
        Cat cat = new Cat();

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;

        for (Animal animal : animals){
            animal.eat();
        }

        System.out.println("------");

        animalEats(dog);
        animalEats(cat);

    }

    public static void animalEats(Animal animal1){ //создаем метод реализации для быстрого вызова метода eat
        animal1.eat();
    }
}
