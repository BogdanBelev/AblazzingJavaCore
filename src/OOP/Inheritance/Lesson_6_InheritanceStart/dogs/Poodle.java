package OOP.Inheritance.Lesson_6_InheritanceStart.dogs;
/*
* Создаем класс наследника, у которого такие же методы как и у родителя:
* Так, пудель лает, как и все собаки
* Значит Dog - родитель - задает методы всем наследникам
* В классе Poodle дописываем
*           extends Dog
* Где Dog это родительский класс
*
* @Override - проверяет, если такой метод в родителе (один в один)
*
* ---------
* конструктор :
*           public Poodle(){
                super(28);
            }
* реализует конструктор из Dog (у всех пуделей 28 зубов)
*
* --------
* ура, можно перезаписывать абстрактные методы, заданные в родительском классе:
* просто опять пишем такой же метод в классе наследника
*
* также можно перезаписывать частично с помощью super
* также можно добавлять аргументы родителя через super
*
* Если мы хотим, чтобы класс не мог наследовать, дописываем final)) На все случаи жизни!
* */
public class Poodle extends Dog{

    public Poodle(){
        super(28);
    }
    @Override
    public void run() {
        System.out.println("The poodle runs slowly");
    }

    @Override
    public void breath() {
        System.out.println("The poodle breathes quietly");
    }

    @Override
    public void bark(){
        System.out.println("The poodle barks");
    }

    @Override
    public void beAngry(){
        System.out.println("The poodle has " + super.countLegs + " legs"); // также можно добавлять аргументы родителя через super
        System.out.println("The poodle is sad");   // задаем новое значение
        super.beAngry();                           // вставляем тело метода родительского класа
        System.out.println("The poodle is angry"); // снова новое значение
    }


}
