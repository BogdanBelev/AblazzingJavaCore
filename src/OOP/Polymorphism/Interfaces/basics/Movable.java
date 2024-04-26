package OOP.Polymorphism.Interfaces.basics;

public interface Movable { //создаем не класс, а интерфейс
    //создаем метод, общий для Car и Dog
    void move(); //не обязательно писать public, так как по умолчанию все методы интерфейса публичные

    //также конечно можно создавать методы, которые реализуются в интерфейсе, но через default
    //и также как и в наследовании, такой метод можнжо перезаписать
    default void brokeDown(){
        System.out.println("The something broke down");
    }

}
