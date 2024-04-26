package OOP.Inheritance.Lesson_6_InheritanceStart.dogs;
/*
        * public Terrier(int countTeeth) {
                super(countTeeth);
            }
* каждому терьеру нужно всегда задавать кол-во зубов (при вызове в Runner)
*
* */
public class Terrier extends Dog{

    public Terrier(int countTeeth) {
        super(countTeeth);
    }

    @Override
    public void breath() {
        System.out.println("The terrier breathes");
    }

    @Override
    public void run() {
        System.out.println("The terrier runs");
    }

    @Override
    public void bark(){
        System.out.println("The terrier barks");
    }
}
