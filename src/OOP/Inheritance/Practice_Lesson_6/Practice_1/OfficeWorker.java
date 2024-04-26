package OOP.Inheritance.Practice_Lesson_6.Practice_1;

public abstract class OfficeWorker extends Professions {
    public OfficeWorker(int salary, String gender) {
        super(salary, gender);
    }

    public abstract void drinkCoffee();
}
