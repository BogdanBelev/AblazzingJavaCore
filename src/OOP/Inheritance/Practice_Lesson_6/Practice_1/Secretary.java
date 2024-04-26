package OOP.Inheritance.Practice_Lesson_6.Practice_1;

public class Secretary extends OfficeWorker {
    private final static String NAME_PROFESSION = "Secretary";
    public Secretary(String gender) {
        super(30000, gender);
    }

    @Override
    public void employeeFunctions() {
        System.out.println("The secretary can print a documents");
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
