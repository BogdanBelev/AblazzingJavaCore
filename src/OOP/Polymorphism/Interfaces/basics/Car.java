package OOP.Polymorphism.Interfaces.basics;

//создаем класс, который не имеет ничего общего с классом Dog,
// но у них есть общий метод - move()

public class Car implements Movable{ //для подчинения классу Movable дописываем implements
    public void move(){
        System.out.println("The car moves");
    }
    public void turnOff(){ //пример метода, который мы не можем реализовать в объекте с типом данных Movable, так как создан он исключительно в классе Car и не относится к Movable
        System.out.println("The car turn off");
    }

    @Override
    public void brokeDown() {
        System.out.println("The car broke down");
    }
}
