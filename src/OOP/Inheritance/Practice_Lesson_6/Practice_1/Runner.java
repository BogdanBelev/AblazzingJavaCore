package OOP.Inheritance.Practice_Lesson_6.Practice_1;

public class Runner {
    public static void main(String[] args) {
        Security security_1 = new Security("male", "Bogdan");
        security_1.employeeFunctions();
        security_1.receivesSalary();
        System.out.println(security_1.getNameSecurity());
        System.out.println("");

        Security security_2 = new Security("male", "Denis");
        security_2.employeeFunctions();
        security_2.receivesSalary();
        System.out.println("");

        Accountant accountant = new Accountant("female");
        accountant.employeeFunctions();
        accountant.receivesSalary();
        accountant.drinkCoffee();
        System.out.println("");

        Secretary secretary = new Secretary("female");
        secretary.employeeFunctions();
        secretary.receivesSalary();
        accountant.drinkCoffee();
        System.out.println("");
    }
}
