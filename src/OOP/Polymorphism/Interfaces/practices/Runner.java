package OOP.Polymorphism.Interfaces.practices;

public class Runner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        Swim[] pool = new Swim[2];
        pool[0] = fish;
        pool[1] = duck;

        System.out.println("Pool: ");
        for (Swim swimmingThing : pool){
            swimmingThing.swim();
        }

        System.out.println("------");

        Fly[] sky = new Fly[2];
        sky[0] = duck;
        sky[1] = airplane;

        System.out.println("Sky: ");
        for (Fly flyingThing : sky){
            flyingThing.fly();
        }

    }
}
