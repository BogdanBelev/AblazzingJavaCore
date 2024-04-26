package OOP.Inheritance.Lesson_6_InheritanceStart;

import OOP.Inheritance.Lesson_6_InheritanceStart.dogs.Poodle;
import OOP.Inheritance.Lesson_6_InheritanceStart.dogs.Shepherd;
import OOP.Inheritance.Lesson_6_InheritanceStart.dogs.Terrier;

public class Runner {
    public static void main(String[] args) {

//        Пудель
        System.out.println("Poodle");
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breath();
        System.out.println("Number of teeth: " + poodle.countTeeth);
        System.out.println();
        poodle.beAngry();
        poodle.dogEats();

        System.out.println("-------");

//        Овчарка
        System.out.println("Shepherd");
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.println();
        shepherd.beAngry();
        System.out.println("Number of teeth: " + shepherd.countTeeth);

        System.out.println("-------");

//        Терьер
        System.out.println("Terrier");
        Terrier terrier = new Terrier(33);
        terrier.bark();
        terrier.run();
        terrier.breath();
        System.out.println("Number of teeth: " + terrier.countTeeth);

        System.out.println("---------------");

        Alive[] dogs = new Alive[3];
        dogs[0] = poodle;
        dogs[1] = terrier;
        dogs[2] = shepherd;


        for(Alive dog : dogs){
            dog.breath();
        }

    }
}
