package OOP.Inheritance.Practice_Lesson_6.Practice_1;

public class Security extends Professions{
    private String nameSecurity;
    private final static String NAME_PROFESSION = "Security";

    public Security(String gender, String nameSecurity) {
        super(15000, gender);
        this.nameSecurity = nameSecurity;
    }

    @Override
    public void employeeFunctions() {
        System.out.printf("The security employee %s can guards\n", nameSecurity);
    }

    @Override
    public void receivesSalary() {
        System.out.printf("The %s receives a salary of %d rubles\n", NAME_PROFESSION, salary);
    }

    public String getNameSecurity() {
        return nameSecurity;
    }
}
