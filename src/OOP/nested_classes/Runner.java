package OOP.nested_classes;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human("4609", "123432", PassportType.FOREIGN); //создаем чел-ка сразу с паспортом
        System.out.println(human);

        Human.Passport newPassport = new Human.Passport("9999", "000999", PassportType.FOREIGN); //создаем новый паспорт для замены

        human.setPassport(newPassport); //меняем паспорт

        System.out.println(human);
    }
}