package OOP.Inheritance.Lesson_6_InheritanceStart.dogs;

public class Shepherd extends Dog {

    public Shepherd() {
        super(36);
    }

    @Override
    public void run() {
        System.out.println("The shepherd dog runs fast");
    }

    @Override
    public void breath() {
        System.out.println("The shepherd breathes loudly");
    }

    @Override
    public void bark(){
        System.out.println("The shepherd barks");
    }
}
