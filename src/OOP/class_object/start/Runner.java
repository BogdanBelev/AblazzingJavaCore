package OOP.class_object.start;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");                //создаем экз-р класса Cat
        Class<? extends Cat> catClass = cat.getClass();   //через метод getClass() создаем catClass
        System.out.println(catClass.getName());           //выводим имя и пусть класса - OOP.class_object.start.Cat

        System.out.println(cat.toString());               //также можно вывести инфу из класса

    }
}
