package OOP.Inheritance.Practice_Lesson_6.Practice_1;

public class Accountant extends OfficeWorker {
    private final static String NAME_PROFESSION = "Accountant";
    public Accountant(String gender) {
        super(50000, gender);
    }

    @Override
    public void employeeFunctions() {
        System.out.println("The accountant can calculate taxes");
    }

    @Override
    public void receivesSalary() {
        System.out.printf("The %s receives a salary of %d rubles\n", NAME_PROFESSION, salary);
    }

    @Override
    public void drinkCoffee() {
        System.out.printf("The %s can drinks coffee\n", NAME_PROFESSION);
    }
}
