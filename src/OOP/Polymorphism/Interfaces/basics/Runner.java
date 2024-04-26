package OOP.Polymorphism.Interfaces.basics;

public class Runner {
    public static void main(String[] args) {
        Movable car = new Car(); //также как и при насл-ии, можно создавать объекты через общий тип данных, но реализовать можно только методы из Movable
        Dog dog = new Dog();
        car.move(); //пример обычной реализации метода
        dog.move(); //но это в случае, если не можем реализовать их вместе

        System.out.println("------");

        //так как мы сделали интерфес, мы можем создать массив с общим типом данных
        Movable[] movables = new Movable[2];
        movables[0] = car;
        movables[1] = dog;

        for(Movable movable : movables){
            movable.move();
            movable.brokeDown(); //у car реализация поменяется, так как метод перезаписали, а у dog реализация идет из Movable
        }
    }
}
