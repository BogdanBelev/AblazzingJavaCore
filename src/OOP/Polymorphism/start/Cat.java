package OOP.Polymorphism.start;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats"); //так как этот метод задан в родителе, он может реализоваться через тип данных Animal
    }
    public void meow(){
        System.out.println("The cat meows"); //а вот этот не сможет реализоваться через тип данных Animal, так как он не перенесен из родителя, а создан в этом классе
    }
}
